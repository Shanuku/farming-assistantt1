
package com.fas.admin.entities;

import com.fas.admin.constants.UserType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testUserEntity() {
        // Create a sample user
        User user = new User();
        user.setId(1L);
        user.setType(UserType.ADMIN);
        user.setUsername("john.doe");
        user.setPassword("password123");
        user.setLoggedIn(true);

        // Verify the user's properties
        Assertions.assertEquals(1L, user.getId());
        Assertions.assertEquals(UserType.ADMIN, user.getType());
        Assertions.assertEquals("john.doe", user.getUsername());
        Assertions.assertEquals("password123", user.getPassword());
        Assertions.assertTrue(user.getLoggedIn());

        // Test the toString() method
        String expectedToString = "User{id=1, type=ADMIN, username='john.doe', password='password123', loggedIn=true}";
        Assertions.assertEquals(expectedToString, user.toString());

        // Create another user with the same ID
        User anotherUser = new User();
        anotherUser.setId(1L);

        // Verify the equals() and hashCode() methods
        Assertions.assertEquals(user, anotherUser);
        Assertions.assertEquals(user.hashCode(), anotherUser.hashCode());
    }
}
