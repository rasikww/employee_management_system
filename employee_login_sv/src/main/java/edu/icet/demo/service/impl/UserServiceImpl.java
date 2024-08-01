package edu.icet.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.demo.dto.User;
import edu.icet.demo.entity.UserEntity;
import edu.icet.demo.repository.UserRepository;
import edu.icet.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ObjectMapper mapper;

    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        repository.save(mapper.convertValue(user, UserEntity.class));
        return "OK";//this is just for testing with postman
    }
}
