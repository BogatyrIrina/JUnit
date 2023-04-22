package com.example.junit;

public class User {
    private final String login;
    private final String email;

    public User(String login, String email) throws IllegalArgumentException {
        if (login.equals(email)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        if (!email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException();
        }
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
