/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherick.amazonviewer.model;

import java.util.Date;

/**
 *
 * @author brotherick
 */
public class Magazine extends Publication {
    
    private int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return "\n Title: " + getTitle() + 
                "\n Editorial: " + getEditorial() +
                "\n Edition date: " + getEditionDate();
    }

    
}
