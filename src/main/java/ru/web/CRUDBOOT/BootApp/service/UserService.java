package ru.web.CRUDBOOT.BootApp.service;

import ru.web.CRUDBOOT.BootApp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void deleteUser(Long id);
}
