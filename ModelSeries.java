/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseriesmanager;

/**
 *
 * @author RC_Student_lab
 */
public class ModelSeries {
    public String Seriesid;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumOfEpisodes;
    
    public ModelSeries(String id,String name, String age, String episodes){
        this.Seriesid = id;
        this.SeriesName = name;
        this.SeriesAge = age;
        this.SeriesNumOfEpisodes = episodes;
    }
    @Override
    public String toString(){
        return "Series ID: " + Seriesid +
                "\nSeries Name: " + SeriesName + 
                "\nNumber Of episodes: " + SeriesNumOfEpisodes;
    }
    }

