package com.company.OnlineShop;

public class UserMenu {
    private Scanner scanner = new Scanner(System.in);

    public void menu(User user) {
        Boolean logout = false;
        //Prints the start menu for a user
        while (logout == false) {
            System.out.println(
                    "1. See Pproduct  0. Logout");
            String menuChoise = stringLongerthenOne();
            switch (menuChoise) {
                case "1":
