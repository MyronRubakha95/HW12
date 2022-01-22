package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        System.out.println("***** TASK 1 *****");
        MyFunctionalInterface task1 = () -> "Hello World";
        System.out.println(task1.Hello());
        System.out.println("***** TASK 2 *****");

        LocalDate DATE = LocalDate.now().minusDays(7);

        List<Users> listUser = new ArrayList<>();
        listUser.add(new Users("1@com", LocalDate.of(2022, 1, 17), "Alfa"));
        listUser.add(new Users("2@com", LocalDate.of(2018, 4, 4), "Beta"));
        listUser.add(new Users("3@com", LocalDate.of(2022, 1, 20), "Gamma"));
        listUser.add(new Users("4@com", LocalDate.of(2017, 10, 10), "Users"));
        listUser.add(new Users("5@com", LocalDate.of(2012, 11, 25), "New Users"));


        var arr = listUser.stream()
                .filter(it -> it.getLoginDate().isAfter(DATE)).toList();
        System.out.println("Users who logged in after week ago : " + arr);

        var arr1 = listUser.stream()
                .collect(Collectors.groupingBy(Users::getTeam));
        System.out.println("Group by team : " + arr1);
        System.out.println("***** TASK 3 *****");

        List<Movies> movies1 = new ArrayList<>();
        movies1.add(new Movies("The Matrix", 120, "Action"));
        movies1.add(new Movies("The Hangover", 150, "Comedy"));
        movies1.add(new Movies("(500) Days of Summer", 100, "Romantic "));
        movies1.add(new Movies("Forrest Gump", 200, "History"));

        List<Movies> movies2 = new ArrayList<>();
        movies2.add(new Movies("The Hunger Games", 130, "Action"));
        movies2.add(new Movies("The Social Network", 125, "Action"));
        movies2.add(new Movies("Pride and Prejudice", 115, "Action"));
        movies2.add(new Movies("Breakfast at Tiffany’s", 105, "Comedy"));

        List<List<Movies>> listmovies = new ArrayList<>();
        listmovies.add(movies1);
        listmovies.add(movies2);

        var priceTicket = listmovies.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.averagingDouble(Movies::getPrice)));
        System.out.println("Average price of tickets = " + priceTicket);

        var countGenre = listmovies.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(Movies::getGenre, Collectors.counting()));
        System.out.println("Count movies for a particular genre = " + countGenre);


    }
}
