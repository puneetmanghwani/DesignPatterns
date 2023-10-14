package example.demo.models;

import com.example.demo.models.Split.Split;
import com.example.demo.models.Split.SplitType;
import lombok.Data;

import java.util.List;

@Data
public class Expense {

    private Integer expenseId;

    private String expenseDescription;

    private User userPaid;

    private Double amount;

    private List<Split> splitList;

    private SplitType splitType;

    public Expense(Integer expenseId, String expenseDescription, User userPaid, Double amount, List<Split> splitList, SplitType splitType) {
        this.expenseId = expenseId;
        this.expenseDescription = expenseDescription;
        this.userPaid = userPaid;
        this.amount = amount;
        this.splitList = splitList;
        this.splitType = splitType;
    }

    public Integer getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Integer expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }

    public User getUserPaid() {
        return userPaid;
    }

    public void setUserPaid(User userPaid) {
        this.userPaid = userPaid;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Split> getSplitList() {
        return splitList;
    }

    public void setSplitList(List<Split> splitList) {
        this.splitList = splitList;
    }

    public SplitType getSplitType() {
        return splitType;
    }

    public void setSplitType(SplitType splitType) {
        this.splitType = splitType;
    }
}
