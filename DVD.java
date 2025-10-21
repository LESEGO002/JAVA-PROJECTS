/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;

import java.util.Locale;

/**
 *
 * @author RC_Student_lab
 */
public class DVD extends Item {
    private int durationMinutes;
    private String rating;
    
    public DVD(String id, String title, int par, String r){
        super(id,title);
        this.durationMinutes = durationMinutes;
        this.rating =rating;
    }
    public int getDurationMinutes(){return durationMinutes;}
    public String getRating(){return rating;}
    public void setDurationMinutes(int durationMinutes){this.durationMinutes = durationMinutes;}
    public void setRating(String Rating){this.rating =rating;}
    
    @Override
    public String getType(){ return "DVD";}
    
    @Override
    public String toString(){
        return String.format("%s Duration: %d min, Rating: %s", super.toString());
    }
}
