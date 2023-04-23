package com.example.junit;

import java.util.Objects;

public class User {
    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) throws IllegalArgumentException {
        if (login.equals(email)) {
            throw new IllegalArgumentException("Login is the same as email");
        }
        this.login = login;
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Incorrect email");
        }
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
