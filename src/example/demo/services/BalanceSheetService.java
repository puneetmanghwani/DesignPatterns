package example.demo.services;


import com.example.demo.models.Balance;
import com.example.demo.models.Split.Split;
import com.example.demo.models.User;
import com.example.demo.models.UserExpenseBalanceSheet;

import java.util.List;
import java.util.Map;

public class BalanceSheetService {

    public void updateBalanceSheet(User userPaid, List<Split> splitList, Double totalExpenseAmount){

        UserExpenseBalanceSheet userExpenseBalanceSheet = userPaid.getUserExpenseBalanceSheet();
        userExpenseBalanceSheet.setTotalPayment(userExpenseBalanceSheet.getTotalPayment() + totalExpenseAmount);

        for(Split split : splitList){
            User userOwe = split.getUser();
            Double amountOwe = split.getAmountOwe();

            if(userPaid.getUserId().equals(userOwe.getUserId())){
                userExpenseBalanceSheet.setTotalUserExpense(userExpenseBalanceSheet.getTotalUserExpense() + amountOwe);
            } else {

                userExpenseBalanceSheet.setTotalGetBack(userExpenseBalanceSheet.getTotalGetBack() + amountOwe);

                Balance userOweBalance = userExpenseBalanceSheet.getBalanceForUserId()
                        .getOrDefault(userOwe.getUserId(), new Balance());
                userOweBalance.setAmountGetBack(userOweBalance.getAmountGetBack() + amountOwe);

                //TODO: remember if you don't do this it will not reflect
                userExpenseBalanceSheet.getBalanceForUserId().put(userOwe.getUserId(), userOweBalance);

                //TODO: add comments everywhere

                UserExpenseBalanceSheet oweUserBalanceSheet = userOwe.getUserExpenseBalanceSheet();

                oweUserBalanceSheet.setTotalUserExpense(oweUserBalanceSheet.getTotalUserExpense() + amountOwe);
                oweUserBalanceSheet.setTotalOwe(oweUserBalanceSheet.getTotalOwe() + amountOwe);

                Balance paidUserBalance = oweUserBalanceSheet.getBalanceForUserId()
                        .getOrDefault(userPaid.getUserId(), new Balance());
                paidUserBalance.setAmountOwe(paidUserBalance.getAmountOwe() + amountOwe);

                //TODO: remember if you don't do this it will not reflect
                oweUserBalanceSheet.getBalanceForUserId().put(userPaid.getUserId(), paidUserBalance);
            }
        }

    }

    public void showUserBalanceSheet(User user){

        UserExpenseBalanceSheet userExpenseBalanceSheet = user.getUserExpenseBalanceSheet();

        System.out.println("---------------------------------------");

        System.out.println("Balance sheet of user : " + user.getUserId());

        System.out.println("TotalYourExpense: " + userExpenseBalanceSheet.getTotalUserExpense());
        System.out.println("TotalGetBack: " + userExpenseBalanceSheet.getTotalGetBack());
        System.out.println("TotalYourOwe: " + userExpenseBalanceSheet.getTotalOwe());
        System.out.println("TotalPaymentMade: " + userExpenseBalanceSheet.getTotalPayment());

        for(Map.Entry<Integer, Balance> entry : userExpenseBalanceSheet.getBalanceForUserId().entrySet()){

            Integer userID = entry.getKey();
            Balance balance = entry.getValue();

            System.out.println("userID:" + userID + " YouGetBack:" + balance.getAmountGetBack() + " YouOwe:" + balance.getAmountOwe());
        }

        System.out.println("---------------------------------------");
    }
}
