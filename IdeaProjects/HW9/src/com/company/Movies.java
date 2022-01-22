package com.company;

public class Movies {
    public String nameMovies;
    private double price ;
    public String genre;

    public Movies(String nameMovies, double price, String genre) {
        this.nameMovies = nameMovies;
        this.price = price;
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "nameMovies='" + nameMovies + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }

    public String getNameMovies() {
        return nameMovies;
    }

    public void setNameMovies(String nameMovies) {
        this.nameMovies = nameMovies;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
