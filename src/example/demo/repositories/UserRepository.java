package example.demo.repositories;

import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

    //TODO: remember this would be static
    private static UserRepository userRepository;

    Map<Integer, User> userForId;

    private UserRepository(){
        userForId = new HashMap<>();
    }

    public static UserRepository getInstance(){
        if(userRepository==null){
            synchronized (UserRepository.class){
                if(userRepository == null){
                    userRepository = new UserRepository();
                }
            }
        }

        return userRepository;
    }


    public User saveUser(User user){

        Integer userId = user.getUserId();

        userForId.put(userId, user);

        return user;
    }

    public User findUserById(Integer userId){
        return userForId.get(userId);
    }

    public List<User> findAllUsers(){
        return new ArrayList<>(userForId.values());
    }

}
