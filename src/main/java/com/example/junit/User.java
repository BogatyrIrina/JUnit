package com.example.junit;

import java.util.Objects;

public class User {
    private String name;
    private String email;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) throws IllegalArgumentException {
        if (name.equals(email)) {
            throw new IllegalArgumentException("Name is the same as email");
        }
        this.name = name;
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Incorrect email");
        }
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
