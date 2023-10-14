package example.demo.repositories;

import com.example.demo.models.Group;

import java.util.HashMap;
import java.util.Map;

public class GroupRepository {

    private static GroupRepository groupRepository;

    private Map<Integer, Group> groupForId;

    private GroupRepository(){
        groupForId = new HashMap<>();
    }

    public static GroupRepository getInstance(){
        if(groupRepository==null){
            synchronized (GroupRepository.class){
                if(groupRepository == null){
                    groupRepository = new GroupRepository();
                }
            }
        }

        return groupRepository;
    }

    public Group saveGroup(Group group){

        Integer groupId = group.getGroupId();

        groupForId.put(groupId, group);

        return group;
    }

    public Group findGroupById(Integer groupId){
        return groupForId.get(groupId);
    }
}
