package com.example.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class UserTest {
    private static User user1;
    private static User user2;
    @BeforeAll
    private static void initParams(){
        System.out.println("Start testing");
        user1 = new User();
        user2 = new User("login", "myemail@mail.ru");
    }
    @AfterAll
    private static void shouldDoAfterAll(){
        System.out.println("Finish testing");
    }

    @Test
    public void testCreateUserWithParameters(){
        assertTrue(user2.getEmail() != null && user2.getLogin() != null);
    }
    @Test
    public void testCreateUserWithoutParameters(){
        assertTrue(user1.getEmail() == null && user1.getLogin() == null);
    }


    @Test
    void shouldGetLogin() throws IllegalArgumentException {
        User user = new User("login", "myemail@mail.ru");
        Assertions.assertEquals("login", user.getLogin());
    }

    @Test
    void shouldGetEmail() {
        User user = new User("login", "myemail@mail.ru");
        Assertions.assertEquals("myemail@mail.ru", user.getEmail());
    }
    @Test
    public void shouldNotValidUserParametersTrowException(){
        Assertions.assertThrows (IllegalArgumentException.class, () -> new User("login", "myemail@mail.ru"));
    }
    @Test
    public void shouldNotValidUserWithoutParametersTrowException(){
        Assertions.assertThrows (IllegalArgumentException.class, () -> new User());
    }
}
