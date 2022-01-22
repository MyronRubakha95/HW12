package com.company;


import java.time.LocalDate;

public class Users{
    private String email ;
    private LocalDate loginDate;
    private String team;

    public Users(String email, LocalDate loginDate, String team) {
        this.email = email;
        this.loginDate = loginDate;
        this.team = team;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(LocalDate loginDate) {
        this.loginDate = loginDate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Users{" +
                "email='" + email + '\'' +
                ", loginDate=" + loginDate +
                ", team='" + team + '\'' +
                '}';
    }
}
