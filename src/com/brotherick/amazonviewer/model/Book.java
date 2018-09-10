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
public class Book extends Publication implements IVisualizable {
    
    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }
    
    @Override
    public String toString(){
        String detailBook = "\n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition date: " + getEditionDate() + 
                "\n Autors: "; 
        for(int i = 0; i < getAuthors().length; i++){
            detailBook += "\t" + getAuthors()[i];
        }
        return detailBook;

    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        if (dateF.getSeconds() > dateI.getSeconds()) {
            setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
        }else{
            setTimeReaded(0);
        }
    }
    
}
