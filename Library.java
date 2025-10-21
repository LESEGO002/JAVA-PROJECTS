/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainapp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author RC_Student_lab
 */
public class Library {
    private final List<Item> items;
    
    public Library(){
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item Item){
        items.add(Item);
        
    }
    
    public boolean removeItemById(String id){
        return items.removeIf(i -> i.getId().equalsIgnoreCase(id));
    }
    
    public Optional<Item> findById(String id){
        return items.stream().filter(i -> i.getId().equalsIgnoreCase(id)).findFirst();
        
    }
    
    public List<Item> searchByTitle(String keyword){
        List<Item> results = new ArrayList<>();
        String k = keyword.toLowerCase();
        for( Item i : items){
        if(i.getTitle().toLowerCase().contains(k)) results.add(i);
        }
        return results;
    }
    
    public boolean borrowItem(String id){
        Optional<Item> o = findById(id);
        return o.map(Item :: borrow).orElse(false);
                
    }
    
     public boolean returnItem(String id){
        Optional<Item> o = findById(id);
        return o.map(Item :: returnItem).orElse(false);
        
     }
     
     public int totalItems(){return items.size();}
     public int totalAvailable(){
         int c =0;
         for(Item i :items)if(i.isAvailable())c++;
         return c;
     }
     public List<Item>getAllItems(){
         return new ArrayList<>(items);
     }
}
