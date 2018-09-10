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
public class Publication {
    
    private String title;
    private Date editionDate;
    private String editorial;
    private String[] autors;

    public Publication(String title, Date editionDate, String editorial) {
        super();
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(Date editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return autors;
    }

    public void setAutors(String[] autors) {
        this.autors = autors;
    }
    
    
    
    
    
}
