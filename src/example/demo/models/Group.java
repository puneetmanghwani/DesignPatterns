package example.demo.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group {

    private Integer groupId;

    private String groupName;

    private List<User> userList;

    private List<Expense> expenseList;

    public Group(Integer groupId, String groupName){
        this.groupId = groupId;
        this.groupName = groupName;
        this.userList = new ArrayList<>();
        this.expenseList = new ArrayList<>();
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void setExpenseList(List<Expense> expenseList) {
        this.expenseList = expenseList;
    }
}
