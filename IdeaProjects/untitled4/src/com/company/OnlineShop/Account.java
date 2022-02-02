package com.company.OnlineShop;

public class Account {
    String name;
    String password;
    String email;

    public Account(String name, String password, String email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Object checkPassword() {
        return password;
    }


    public Object checkName() {
        return name;
    }
}
