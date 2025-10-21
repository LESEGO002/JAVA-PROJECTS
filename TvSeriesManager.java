/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tvseriesmanager;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class TvSeriesManager {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("LATEST SERIES - 2025");
            System.out.println("==========================");
        System.out.println("Enter (1) to Launch menu or any other key to exit: ");
        String input =scanner.nextLine();
        if(!input.equals("1"))
            break;
        SeriesP series = new SeriesP();
        
         SeriesP.displayMenu();
         String choice = scanner.nextLine();
         
         switch(choice){
             case "1":
                 SeriesP.captureSeries();
                 break;
             case "2":
                 SeriesP.searchSeries();
                 break;
             case "3":
                 SeriesP.UpdateAgeRestriction();
                 break;
             case "4":
                 SeriesP.deleteSeries();
                 break;
             case "5":
                SeriesP. printReport();
             case "6":
                 System.out.println("Exiting application...");
                 break;
             default:
                 System.out.println("Invalid choice. Try again.");
    }
}
    }
}
    
