package com.example.miaprimaapplicazione;

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String date;

    public User(String username, String password, String name, String surname, String date) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDate() {
        return date;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
