package com.example.test2;

public class Modell {
    private int image;
    private String title;
    private String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Modell{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Modell(int image, String title, String name) {
        this.image = image;
        this.title = title;
        this.name = name;
    }

    public Modell() {

    }

}
