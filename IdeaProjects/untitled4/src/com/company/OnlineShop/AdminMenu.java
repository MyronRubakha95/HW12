package com.company.OnlineShop;



import java.util.Scanner;

public class AdminMenu {
    private Scanner scanner = new Scanner(System.in);
    private AdminMenu adminMenu = new AdminMenu();

    public void menu (Admin admin){
Boolean logout = false;
while (logout==false){
    System.out.println("1. See users 2.See password 3.See email 4.Add Product 5.Block Users");
    String menuChoise = UserMenu.stringLongerthenOne();

    switch (menuChoise){
        case "1":
            admin.seeUser();
            break;
        case "2":
            admin.see;
            break;
        case "3":
            admin.email()
    }
}
    }
}
