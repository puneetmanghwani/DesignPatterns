package example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(){
        this.userRepository = UserRepository.getInstance();
    }

    public User createUser(Integer id, String userName){
        User user = new User(id, userName);
        return userRepository.saveUser(user);
    }

    public User getUserById(Integer userId){
        return userRepository.findUserById(userId);
    }


    public List<User> getAllUsers(){
        return userRepository.findAllUsers();
    }
}
