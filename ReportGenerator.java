/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;
import java.util.List;
/**
 *
 * @author RC_Student_lab
 */
public class ReportGenerator {
    public static void printlibraryReport(Library lib){
        System.out.println("===================================");
        System.out.println("          Libray Report");
        System.out.println("====================================");
        System.out.printf("Total items: %d%n",lib.totalItems());
        System.out.printf("Available items: %d%n",lib.totalAvailable());
        System.out.println("-------------------------------------");
        System.out.println("ID     | Type | Title(status)");
        System.out.println("-------------------------------------");
        
        List<Item> all =lib.getAllItems();
        for(Item it: all){
            System.out.printf("%-8s | %-4s | %s%n",
                    it.getId(),it.getType(),it.getTitle()+"("+(it.isAvailable()?"Available":"borrowed")+")");
        }
        System.out.println("=======================================");          
    }
}
