package org.allen.persistence.service;

import org.allen.persistence.SpringTest;
import org.allen.persistence.domain.User;
import org.junit.Assert;
import org.junit.Test;

/**
 * AUTHOR: Allen Fu
 * DATE:   2015-11-03
 */
public class UserServiceTest extends SpringTest{
    @Test
    public void testInserUser(){
        User user = new User();
        user.setName("dsdfasdf");
        userService.insertUser(user);
    }

    @Test
    public void testFindUserById() {
        User user = userService.findUserById(1L);
        Assert.assertEquals(1, user.getId().longValue());
    }
}
