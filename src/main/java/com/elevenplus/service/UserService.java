package com.elevenplus.service;

import com.elevenplus.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User updateUserRole(Long userId, User.Role newRole);
    User updateUserStatus(Long userId, User.Status newStatus);
}
