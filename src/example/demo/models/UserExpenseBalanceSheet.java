package example.demo.models;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class UserExpenseBalanceSheet {

    Map<Integer, Balance> balanceForUserId;

    private Double totalUserExpense;

    private Double totalOwe;

    private Double totalGetBack;

    private Double totalPayment;

    public UserExpenseBalanceSheet() {
        this.balanceForUserId = new HashMap<>();
        this.totalUserExpense = 0.0;
        this.totalOwe = 0.0;
        this.totalGetBack = 0.0;
        this.totalPayment = 0.0;
    }

    public Map<Integer, Balance> getBalanceForUserId() {
        return balanceForUserId;
    }

    public void setBalanceForUserId(Map<Integer, Balance> balanceForUserId) {
        this.balanceForUserId = balanceForUserId;
    }

    public Double getTotalUserExpense() {
        return totalUserExpense;
    }

    public void setTotalUserExpense(Double totalUserExpense) {
        this.totalUserExpense = totalUserExpense;
    }

    public Double getTotalOwe() {
        return totalOwe;
    }

    public void setTotalOwe(Double totalOwe) {
        this.totalOwe = totalOwe;
    }

    public Double getTotalGetBack() {
        return totalGetBack;
    }

    public void setTotalGetBack(Double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }

    public Double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Double totalPayment) {
        this.totalPayment = totalPayment;
    }
}
