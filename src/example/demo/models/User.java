package example.demo.models;

import lombok.Data;

@Data
public class User {

    private Integer userId;

    private String userName;

    private UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

    public void setUserExpenseBalanceSheet(UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }
}
