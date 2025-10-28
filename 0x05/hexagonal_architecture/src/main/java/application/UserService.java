package application;

import java.util.List;

import domain.User;
import ports.UserRepository;

public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUser(String id, String name) {
        this.userRepository.save(new User(id, name));
    }


    public User getUser(String id) {
        return this.userRepository.findById(id);
    }


    public List<User> listUsers() {
        return this.userRepository.findAll();
    }
}