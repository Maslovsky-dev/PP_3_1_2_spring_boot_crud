package ru.maslovsky.SpringBoot.service;


import ru.maslovsky.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User userById(Long id);
    List<User> listUsers();
    void update(Long id,User user);
    void delete(Long id);


}
