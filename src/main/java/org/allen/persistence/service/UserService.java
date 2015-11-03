package org.allen.persistence.service;

import org.allen.persistence.domain.User;

import java.util.List;

/**
 * AUTHOR: Allen Fu
 * DATE:   2015-11-03
 */
public interface UserService {
    public void insertUser(User user);

    public User findUserById(Long id);

    public List<User> findUserByName(String name);
}
