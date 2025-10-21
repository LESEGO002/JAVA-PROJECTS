/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;

/**
 *
 * @author RC_Student_lab
 */
public abstract class Item {
   
    private final String id;
    private String title;
    private boolean available;
    
    public Item(String id,String title){
        this.id = id;
        this.title = title;
        this.available = true;
    }
    public String getId(){return id;}
    public String getTitle(){return title;}
    public boolean isAvailable(){return available;}
    
    public void setTitle(String title){this.title =title;}
    
    public boolean borrow(){
        if(!available)return false;
        available = false;
        return true;
    }
    public boolean returnItem(){
        if(available) return false;
        available =true;
        return true;
    }
    public abstract String getType();
    
    @Override
    public String toString(){
        return String.format("%s [%s] - %s - %s", 
                getType(),id,title,(available?"Available":"Borrowed"));
    }
}


