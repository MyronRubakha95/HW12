package com.company.OnlineShop;

import java.util.ArrayList;


public class Login {
    public Account loginGetAccountFromList(int position) {
        ArrayList<Account>list = App.getlist;

        Account account = list.get(position);
        return account;
    }
    public int loginGetListPosition(String username, String password) {
        int userPosition = -1;
        ArrayList<Account> list = App.getList();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).checkName().equals(username) && list.get(i).checkPassword().equals(password)) {
                userPosition = i;
                break;
            }
        }
        if (userPosition == -1) {
            System.out.println("Username or password incorrect");
        }

        return userPosition;
    }
}

