/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;

/**
 *
 * @author RC_Student_lab
 */
public class Book extends Item {
    private String author;
    private int pages;
    
    public Book(String id, String title, String author, int pages){
        super(id, title);
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor(){return author;}
    public int getPages(){return pages;}
    public void SetAuthor(String author){this.author = author;}
    public void setpages(int pages){this.pages = pages;}
    
    @Override
    public String getType(){return "book";}
    
    @Override
    public String toString(){
        return String.format("%s, Author: %s, Pages: %d", super.toString(),author,pages);
    }
}
