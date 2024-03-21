package az.edu.ada.adazon.service;

import az.edu.ada.adazon.entity.User;
import az.edu.ada.adazon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> listUser(){
        return userRepository.findAll();
    }
}
