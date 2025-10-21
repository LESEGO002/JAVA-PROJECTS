/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainapp;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class MainApp {

    public static void main(String[] args) {
        Library library = new Library();
        
        Book b1 = new Book("B001", "Data Structures", "Bob Brown", 350);
        Book b2 = new Book("B002", "Data Structures", "Bob Brown", 350);
        DVD d1 = new DVD("D001","Inception", 148,"PG13");
        DVD d2 = new DVD("D002","The Matrix",136,"R");
       
        
        System.out.println("Preforming borrow/return operations...");
        System.out.println("=========================================");
        
        System.out.println("Borrow B001:"+ (library.borrowItem("B001")?"Successful":"Failed"));
        System.out.println("Return B002:"+ (library.borrowItem("B002")?"Successful":"Failed"));
        
        System.out.println("borrow D001: "+ (library.borrowItem("D001")?"Successful":"Failed"));
        System.out.println("Return D002: " + (library.returnItem("D002") ? "Success" : "Failed"));
        
        System.out.println("\nSearch results for 'data':");
        library.searchByTitle("data").forEach(System.out::println);
        
        System.out.println("\n-- Library Report--");
        ReportGenerator.printlibraryReport(library);
    }
}
