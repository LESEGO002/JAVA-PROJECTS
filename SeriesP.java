/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseriesmanager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class SeriesP {
     public static ArrayList<ModelSeries> SeriesList = new ArrayList<>();
     private static Scanner scanner = new Scanner(System.in);
     public static void addSeries(String id, String name, String age, String episodes){
         SeriesList.add(new ModelSeries(id,name,age,episodes));
     }
     public static String searchSeriesById(String id) {
    for (ModelSeries s : SeriesList) {
        if (s.Seriesid.equalsIgnoreCase(id)) {
            return s.toString();
        }
    }
    return "Not found";
}
     public static boolean deleteSeries(String id){
         return SeriesList.removeIf(s -> s.Seriesid.equals(id));
     }
     public static String generateReport() {
    StringBuilder report = new StringBuilder("Series Report:\n");
    for (ModelSeries s : SeriesList) {
        report.append(s.toString()).append("\n");
    }
    return report.toString();
}
    
    public static void displayMenu(){
    System.out.println("\nPlease select one of the following menu items: ");
    System.out.println("(1) Capture new series.");
    System.out.println("(2) Search for a series.");
    System.out.println("(3) Update series age restriction.");
    System.out.println("(4) Delete a Series.");
    System.out.println("(5) Print series report - 2025.");
    System.out.println("(6) Exit Application.");
    System.out.println("Enter choice: ");
}

public static void captureSeries(){
    System.out.println("CAPTURE A NEW SERIES");
    System.out.println("**************************");
    System.out.println("Enter series ID: ");
    String id =scanner.nextLine();
    
    System.out.println("Enter series Name: ");
    String name = scanner.nextLine();
     
    String age ="";
    while(true){
    System.out.println("Enter Age Ristriction: ");
    age = scanner.nextLine();
    try{
        int ageNum = Integer.parseInt(age);
        if (ageNum>=2 && ageNum<=18){
            break;
        }else{
            System.out.println("you have entered the wrong series age");    
        }
    }catch (NumberFormatException e){
        System.out.println("you entered a incorrect series age");
        System.out.println("Please re-enter the series age");
    }
   }
    System.out.println("Enter number of episodes " + name +":");
    String episodes = scanner.nextLine();
    
    ModelSeries newSeries = new ModelSeries(id,name,age,episodes);
    SeriesList.add(newSeries);
    
    System.out.println("Series Captured Successfully!");
}

public static void searchSeries(){
    Scanner scanner = new Scanner(System.in);
     ModelSeries found = null;
    
    System.out.println("Enter Series Name to Search: ");
    String id = scanner.nextLine();
    for(ModelSeries s : SeriesList){
        if(s.Seriesid.equalsIgnoreCase(id)){
           found = s;
           break;
        }
    }
    if(found!= null){
        System.out.println(found);
    }else{
        System.out.println("series With Series Id:" + id +"was not found!");
    }    
    }
public static void UpdateAgeRestriction(){ 
    System.out.println("Enter the id series to update:");
    String Age =scanner.nextLine();
    boolean found =false;
    for(int i=0; i<SeriesList.size();i++){ //use a for loop 
        if(SeriesList.get(i).Seriesid.equals(found)){
            ModelSeries s = SeriesList.get(i);
           
       
        System.out.println("Enter the series name!");
        s.SeriesName = scanner.nextLine();
        
        String age ="";
        while(true){
            System.out.println("Enter the age restiriction");
            age = scanner.nextLine();
            try{
                int ageNum = Integer.parseInt(age);
                if(ageNum>=2 && ageNum<=18){
                    s.SeriesAge = age;
                    break;
                }else{
                    System.out.println("you have entered a incorrect series age!!!");
                }
            }catch (NumberFormatException e){
                System.out.println("You have entered a incorrect series age");
        }
    }
            System.out.println("Enter number of episodes: ");
            s.SeriesNumOfEpisodes =scanner.nextLine();
            
            System.out.println("series updated successfully!");
            found =true;
            break;
        }
    }
    if(!found){
        System.out.println("Series with Series age: " + Age + " was not found!");
    }
}
   public static void deleteSeries(){
       System.out.print("Enter series Id to delete: ");
       String id = scanner.nextLine();
       boolean found =false;
       
      for(int i =0; i< SeriesList.size();i++)
           if(SeriesList.get(i).Seriesid.equals(id)){
               System.out.println("Are you sure you want to delete series" + id +" from the system? Yes (y) to delete.");
               String confirm = scanner.nextLine();
                if(confirm.equalsIgnoreCase("y")){
                    SeriesList.remove(i);
                    System.out.println("Series with ID '" + id+ "' has been deleted.");    
           }else{
                    System.out.println("Delete cancelled.");
                }
                found =true;
                break;
       }
       if(!found){
            System.out.println("Series with ID '" + id+ "' has been deleted.");
       }
   }     
public static void printReport(){
    if(SeriesList.isEmpty()){
        System.out.println("no series available to display!");
        return;
    }
    for(int i= 0; i< SeriesList.size();i++){
        System.out.println("series"+(i+1));
        System.out.println(SeriesList.get(i));
    }
}
}
    

