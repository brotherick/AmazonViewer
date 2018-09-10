/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brotherick.amazonviewer.model;

/**
 *
 * @author brotherick
 */
public class Chapter extends Movie {

    private int id;
    private int sessionNumber;

    public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
        super(title, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }

    @Override
    public int getId() {
        return this.id; //To change body of generated methods, choose Tools | Templates.
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString(){
        return "\n Title: " + getTitle() + 
                "\n Year: " + getYear() +
                "\n Creator " + getCreator() +
                "\n Duration: " + getDuration();
    }

}
