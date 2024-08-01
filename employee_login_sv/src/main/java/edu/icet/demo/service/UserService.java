package edu.icet.demo.service;

import edu.icet.demo.dto.User;

public interface UserService {

    boolean login(User user);
    String register(User user);
}
