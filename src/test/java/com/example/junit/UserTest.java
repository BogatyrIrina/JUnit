package com.example.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @BeforeAll
    private static void initParams(){
        System.out.println("Start testing");
    }
    @AfterAll
    private static void shouldDoAfterAll(){
        System.out.println("Finish testing");
    }
    @Test
    void shouldGetLogin() throws IllegalArgumentException {
        User user = new User("login", "myemail@mail.ru");
        Assertions.assertEquals("login", user.getLogin());
        Assertions.assertEquals("myemail@mail.ru", user.getEmail());
    }

    @Test
    void shouldGetEmail() {
    }
}
