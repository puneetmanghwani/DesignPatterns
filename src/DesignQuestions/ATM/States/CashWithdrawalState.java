package DesignQuestions.ATM.States;

import DesignQuestions.ATM.ATM;
import DesignQuestions.ATM.AmountWithdrawl.CashWithdrawalProcessor;
import DesignQuestions.ATM.AmountWithdrawl.FiveHundredWithdrawProcessor;
import DesignQuestions.ATM.AmountWithdrawl.OneHundredWithdrawProcessor;
import DesignQuestions.ATM.AmountWithdrawl.TwoThousandWithdrawProcessor;
import DesignQuestions.ATM.Card;

public class CashWithdrawalState extends ATMState{
    public CashWithdrawalState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmountRequest){
        if(atm.getAtmBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        } else if (card.getBankBalance() < withdrawalAmountRequest){
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            card.deductBankBalance(withdrawalAmountRequest);
            atm.deductATMBalance(withdrawalAmountRequest);

            CashWithdrawalProcessor cashWithdrawalProcessor = new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
            cashWithdrawalProcessor.withdraw(atm, withdrawalAmountRequest);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
