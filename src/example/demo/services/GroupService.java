package example.demo.services;

import com.example.demo.models.Group;
import com.example.demo.models.User;
import com.example.demo.repositories.GroupRepository;

import java.util.List;

public class GroupService {

    private GroupRepository groupRepository;

    public GroupService(){
        this.groupRepository = GroupRepository.getInstance();
    }

    public Group createGroup(Integer id, String groupName){
        Group group = new Group(id, groupName);
        return groupRepository.saveGroup(group);
    }

    public Group getGroupById(Integer groupId){
        return groupRepository.findGroupById(groupId);
    }

    public User addUserInGroup(Group group, User user){
        List<User> userList = group.getUserList();
        userList.add(user);

        return user;
    }
}
