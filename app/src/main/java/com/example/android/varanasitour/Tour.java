package com.example.android.varanasitour;

public class Tour {

    private String Name;
    private int Image;
    private String about;
    public Tour(String name,int image){
        this.Name =name;
        this.Image = image;
    }
public Tour(String name,int image,String about){
    this.Name =name;
    this.Image = image;
    this.about=about;

}

    public String getName(){
        return Name;
    }

    public int getImage() {
        return Image;
    }

    public String getAbout() {
        return about;
    }
}
