package example.demo.services;

import com.example.demo.Exception.InvalidExpenseException;
import com.example.demo.models.Expense;
import com.example.demo.models.Group;
import com.example.demo.models.Split.Split;
import com.example.demo.models.Split.SplitStrategy;
import com.example.demo.models.Split.SplitStrategyFactory;
import com.example.demo.models.Split.SplitType;
import com.example.demo.models.User;

import java.util.List;

public class ExpenseService {

    public Expense createExpense(Group group, Integer expenseId, String expenseDescription, User userPaid, Double amount,
                                 List<Split> splitList, SplitType splitType) throws InvalidExpenseException {

        SplitStrategy splitStrategy = SplitStrategyFactory.getSplitStrategy(splitType);

        if(!splitStrategy.validateSplit(splitList, amount)){
            throw new InvalidExpenseException("Invalid Expense");
        }

        Expense expense = new Expense(expenseId, expenseDescription, userPaid, amount, splitList, splitType);

        List<Expense> expenseList = group.getExpenseList();
        expenseList.add(expense);

        return expense;
    }

}
