package com.company.OnlineShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Account {
    public Object see;
    private Scanner scanner = new Scanner(System.in);

    public Admin(String name, String password, String email) {
        super(name, password, email);
        this.name = name;
        this.password = password;
        this.email = email;
    }
    public void seeUser (){
        ArrayList<Account> list = App.getlist;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof User) {
                User user = (User) list.get(i){
                    System.out.println(name + " " + password + " "+ email);

                }
            }

        }
    }
}
