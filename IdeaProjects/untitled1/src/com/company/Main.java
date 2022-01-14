package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        LocalDate date0 = LocalDate.now();
        LocalDate date1 = LocalDate.of(2002, 2, 15);
        LocalDate date2 = LocalDate.of(2004, 4, 12);
        LocalDate date3 = LocalDate.of(2012, 5, 25);
        LocalDate date4 = LocalDate.of(2015, 7, 20);
        LocalDate date5 = LocalDate.of(2000, 3, 14);


        Map<LocalDate, String> arr = new HashMap<>();
        arr.put(date1, "Number the Stars");
        arr.put(date2, "The Chronicles of Narnia");
        arr.put(date3, "Winnie-the-Pooh");
        arr.put(date4, "Bridge to Terabithia");
        arr.put(date5, "Black Beauty");
        System.out.println(arr);


        String s = arr.get(date0);

        System.out.println("On this date : " + date0 + ". There is no book = " + s);


        for (Map.Entry<LocalDate, String> me : arr.entrySet()) {
            System.out.println("Dates of booked books : " + me.getKey());
        }
        for (Map.Entry<LocalDate, String> a : arr.entrySet()) {
            System.out.println("Titles of booked books : " + a.getValue());
        }

    }
}


