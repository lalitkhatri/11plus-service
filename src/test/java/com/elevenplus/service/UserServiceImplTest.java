package com.elevenplus.service;

import com.elevenplus.model.User;
import com.elevenplus.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceImplTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        User user1 = new User();
        User user2 = new User();
        when(userRepository.findAll()).thenReturn(Arrays.asList(user1, user2));
        List<User> users = userService.getAllUsers();
        assertThat(users).hasSize(2);
    }

    @Test
    void testGetUserById_Found() {
        User user = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        Optional<User> result = userService.getUserById(1L);
        assertThat(result).isPresent();
        assertThat(result.get()).isEqualTo(user);
    }

    @Test
    void testGetUserById_NotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());
        Optional<User> result = userService.getUserById(1L);
        assertThat(result).isNotPresent();
    }

    @Test
    void testCreateUser() {
        User user = new User();
        when(userRepository.save(user)).thenReturn(user);
        User created = userService.createUser(user);
        assertThat(created).isEqualTo(user);
    }

    @Test
    void testUpdateUser_Success() {
        User user = new User();
        user.setUsername("new");
        user.setEmail("new@example.com");
        user.setPassword("pass");
        User existing = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.of(existing));
        when(userRepository.save(existing)).thenReturn(existing);
        User updated = userService.updateUser(1L, user);
        assertThat(updated.getUsername()).isEqualTo("new");
        assertThat(updated.getEmail()).isEqualTo("new@example.com");
        assertThat(updated.getPassword()).isEqualTo("pass");
    }

    @Test
    void testUpdateUser_NotFound() {
        User user = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> userService.updateUser(1L, user));
    }

    @Test
    void testDeleteUser() {
        doNothing().when(userRepository).deleteById(1L);
        userService.deleteUser(1L);
        verify(userRepository, times(1)).deleteById(1L);
    }

    @Test
    void testUpdateUserRole_Success() {
        User user = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.save(user)).thenReturn(user);
        User updated = userService.updateUserRole(1L, User.Role.ADMIN);
        assertThat(updated.getRole()).isEqualTo(User.Role.ADMIN);
    }

    @Test
    void testUpdateUserRole_NotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> userService.updateUserRole(1L, User.Role.ADMIN));
    }

    @Test
    void testUpdateUserStatus_Success() {
        User user = new User();
        when(userRepository.findById(1L)).thenReturn(Optional.of(user));
        when(userRepository.save(user)).thenReturn(user);
        User updated = userService.updateUserStatus(1L, User.Status.ACTIVE);
        assertThat(updated.getStatus()).isEqualTo(User.Status.ACTIVE);
    }

    @Test
    void testUpdateUserStatus_NotFound() {
        when(userRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(RuntimeException.class, () -> userService.updateUserStatus(1L, User.Status.ACTIVE));
    }
}

