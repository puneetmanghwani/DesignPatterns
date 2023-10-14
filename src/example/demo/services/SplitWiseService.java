package example.demo.services;

import com.example.demo.Exception.InvalidExpenseException;
import com.example.demo.models.Expense;
import com.example.demo.models.Group;
import com.example.demo.models.Split.Split;
import com.example.demo.models.Split.SplitType;
import com.example.demo.models.User;

import java.util.ArrayList;
import java.util.List;

public class SplitWiseService {

    private UserService userService;

    private GroupService groupService;

    private ExpenseService expenseService;

    private BalanceSheetService balanceSheetService;

    public SplitWiseService(){
        this.userService = new UserService();
        this.groupService = new GroupService();
        this.expenseService = new ExpenseService();
        this.balanceSheetService = new BalanceSheetService();
    }

    public void initializeData(){
        createUsers();
        createGroups();
    }

    public void demo(){
        Group group = groupService.getGroupById(1);
        User user1 = userService.getUserById(1);
        User user2 = userService.getUserById(2);

        groupService.addUserInGroup(group, user1);
        groupService.addUserInGroup(group, user2);

        //creating expense
        User paidByUser = userService.getUserById(1);
        Integer expenseId = 1;
        String expenseDescription = "Food";
        Double totalAmount = 20.0;
        List<Split> splitList = new ArrayList<>();

        Split split1 = new Split(userService.getUserById(1), 10.0);
        Split split2 = new Split(userService.getUserById(2), 10.0);

        splitList.add(split1);
        splitList.add(split2);

        Expense expense;
        try {
            expense = expenseService.createExpense(group, expenseId, expenseDescription, paidByUser, totalAmount,
                    splitList, SplitType.EQUAL);
        } catch (InvalidExpenseException e){
            System.out.println("Invalid Expense");
            return;
        }

        balanceSheetService.updateBalanceSheet(paidByUser, splitList, totalAmount);

        for(User user : userService.getAllUsers()){
            //TODO: how in userService showUserBalanceSheet
            balanceSheetService.showUserBalanceSheet(user);
        }
    }

    private void createUsers(){
        User user1 = userService.createUser(1, "User 1");
        User user2 = userService.createUser(2, "User 2");
    }

    private void createGroups(){
        Group group1 = groupService.createGroup(1, "Group 1");
    }

}
