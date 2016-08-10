package com.kitesquotes.itychanged.kitesquotes.Day.model;

/**
 * Created by PC on 8/5/2016.
 */
public class OPhoto {
    public String image;
    public String name;
    public OPhoto(String image,String name){
        this.name=name;
        this.image=image;
    }

    public OPhoto(String image){
        this.image=image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
