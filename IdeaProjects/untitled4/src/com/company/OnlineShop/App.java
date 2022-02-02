package com.company.OnlineShop;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static ArrayList<Account>list = new ArrayList<Account>();
    public static ArrayList<Account> getlist;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Admin admin = new Admin("admin","1234", "admin@com");
        User user = new User();
        list.add(admin);


        
    }
    public static void startMenu(){
        Login classLogin = new Login ();

    }



    public static ArrayList<Account> getList() {
        return null;
    }
}
