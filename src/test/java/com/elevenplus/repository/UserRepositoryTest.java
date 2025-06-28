package com.elevenplus.repository;

import com.elevenplus.model.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Should save and retrieve user by id")
    void testSaveAndFindById() {
        User user = new User();
        user.setUsername("testuser");
        user.setEmail("test@example.com");
        user.setPassword("password");
        user.setRole(User.Role.STUDENT);
        user.setStatus(User.Status.ACTIVE);
        User saved = userRepository.save(user);
        Optional<User> found = userRepository.findById(saved.getId());
        assertThat(found).isPresent();
        assertThat(found.get().getUsername()).isEqualTo("testuser");
    }

    @Test
    @DisplayName("Should find all users")
    void testFindAll() {
        User user1 = new User();
        user1.setUsername("user1");
        user1.setEmail("user1@example.com");
        user1.setPassword("pass1");
        user1.setRole(User.Role.ADMIN);
        user1.setStatus(User.Status.ACTIVE);
        User user2 = new User();
        user2.setUsername("user2");
        user2.setEmail("user2@example.com");
        user2.setPassword("pass2");
        user2.setRole(User.Role.PARENT);
        user2.setStatus(User.Status.BLOCKED);
        userRepository.save(user1);
        userRepository.save(user2);
        List<User> users = userRepository.findAll();
        assertThat(users).hasSizeGreaterThanOrEqualTo(2);
    }

    @Test
    @DisplayName("Should delete user by id")
    void testDeleteById() {
        User user = new User();
        user.setUsername("deleteuser");
        user.setEmail("delete@example.com");
        user.setPassword("password");
        user.setRole(User.Role.STUDENT);
        user.setStatus(User.Status.ACTIVE);
        User saved = userRepository.save(user);
        userRepository.deleteById(saved.getId());
        Optional<User> found = userRepository.findById(saved.getId());
        assertThat(found).isNotPresent();
    }
}

