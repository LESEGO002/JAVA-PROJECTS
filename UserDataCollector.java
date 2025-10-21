/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userdatacollector;
  import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author leseg
 */
public class UserDataCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Write data to file
        try (FileWriter writer = new FileWriter("my user")) {
            writer.write("Name: " + name + "\n");
            writer.write("Surname: " + surname + "\n");
            writer.write("Age: " + age + "\n");
            System.out.println("Data successfully written to 'my user' file!");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

