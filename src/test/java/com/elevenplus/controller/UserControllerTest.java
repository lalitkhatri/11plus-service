package com.elevenplus.controller;

import com.elevenplus.model.User;
import com.elevenplus.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserControllerTest {
    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllUsers() {
        User user1 = new User();
        User user2 = new User();
        when(userService.getAllUsers()).thenReturn(Arrays.asList(user1, user2));
        List<User> users = userController.getAllUsers();
        assertEquals(2, users.size());
    }

    @Test
    void testGetUserById_Found() {
        User user = new User();
        when(userService.getUserById(1L)).thenReturn(Optional.of(user));
        ResponseEntity<User> response = userController.getUserById(1L);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(user, response.getBody());
    }

    @Test
    void testGetUserById_NotFound() {
        when(userService.getUserById(1L)).thenReturn(Optional.empty());
        ResponseEntity<User> response = userController.getUserById(1L);
        assertEquals(404, response.getStatusCode().value());
    }

    @Test
    void testCreateUser() {
        User user = new User();
        when(userService.createUser(user)).thenReturn(user);
        User created = userController.createUser(user);
        assertEquals(user, created);
    }

    @Test
    void testUpdateUser_Success() {
        User user = new User();
        when(userService.updateUser(1L, user)).thenReturn(user);
        ResponseEntity<User> response = userController.updateUser(1L, user);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(user, response.getBody());
    }

    @Test
    void testUpdateUser_NotFound() {
        User user = new User();
        when(userService.updateUser(1L, user)).thenThrow(new RuntimeException("User not found"));
        ResponseEntity<User> response = userController.updateUser(1L, user);
        assertEquals(404, response.getStatusCode().value());
    }

    @Test
    void testDeleteUser() {
        doNothing().when(userService).deleteUser(1L);
        ResponseEntity<Void> response = userController.deleteUser(1L);
        assertEquals(204, response.getStatusCode().value());
    }

    @Test
    void testUpdateUserRole_Success() {
        User user = new User();
        UserController.RoleUpdateRequest req = new UserController.RoleUpdateRequest();
        req.setRole("admin");
        when(userService.updateUserRole(1L, User.Role.ADMIN)).thenReturn(user);
        ResponseEntity<User> response = userController.updateUserRole(1L, req);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(user, response.getBody());
    }

    @Test
    void testUpdateUserRole_BadRequest() {
        UserController.RoleUpdateRequest req = new UserController.RoleUpdateRequest();
        req.setRole("invalid");
        ResponseEntity<User> response = userController.updateUserRole(1L, req);
        assertEquals(400, response.getStatusCode().value());
    }

    @Test
    void testUpdateUserRole_NotFound() {
        UserController.RoleUpdateRequest req = new UserController.RoleUpdateRequest();
        req.setRole("admin");
        when(userService.updateUserRole(1L, User.Role.ADMIN)).thenThrow(new RuntimeException("User not found"));
        ResponseEntity<User> response = userController.updateUserRole(1L, req);
        assertEquals(404, response.getStatusCode().value());
    }

    @Test
    void testUpdateUserStatus_Success() {
        User user = new User();
        UserController.StatusUpdateRequest req = new UserController.StatusUpdateRequest();
        req.setStatus("active");
        when(userService.updateUserStatus(1L, User.Status.ACTIVE)).thenReturn(user);
        ResponseEntity<User> response = userController.updateUserStatus(1L, req);
        assertEquals(200, response.getStatusCode().value());
        assertEquals(user, response.getBody());
    }

    @Test
    void testUpdateUserStatus_BadRequest() {
        UserController.StatusUpdateRequest req = new UserController.StatusUpdateRequest();
        req.setStatus("invalid");
        ResponseEntity<User> response = userController.updateUserStatus(1L, req);
        assertEquals(400, response.getStatusCode().value());
    }

    @Test
    void testUpdateUserStatus_NotFound() {
        UserController.StatusUpdateRequest req = new UserController.StatusUpdateRequest();
        req.setStatus("active");
        when(userService.updateUserStatus(1L, User.Status.ACTIVE)).thenThrow(new RuntimeException("User not found"));
        ResponseEntity<User> response = userController.updateUserStatus(1L, req);
        assertEquals(404, response.getStatusCode().value());
    }

    @Test
    void testRemoveUser_Success() {
        doNothing().when(userService).deleteUser(1L);
        ResponseEntity<Void> response = userController.removeUser(1L);
        assertEquals(204, response.getStatusCode().value());
    }

    @Test
    void testRemoveUser_NotFound() {
        doThrow(new RuntimeException("User not found")).when(userService).deleteUser(1L);
        ResponseEntity<Void> response = userController.removeUser(1L);
        assertEquals(404, response.getStatusCode().value());
    }
}
