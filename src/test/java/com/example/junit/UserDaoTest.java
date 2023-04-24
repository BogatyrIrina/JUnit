package com.example.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    private final UserDao dao = new UserDaoImpl();

    @Test
    public void testUserByUserName(){
        User user = dao.getUserByName("Mary");
        Assertions.assertNotNull(user);
        Assertions.assertEquals(user.getName(), "Mary");
    }
    @Test
    public void testUserByUserNameIsNull(){
        Assertions.assertNull(dao.getUserByName("person"));
    }
}
