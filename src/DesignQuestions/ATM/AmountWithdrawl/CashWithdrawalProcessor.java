package DesignQuestions.ATM.AmountWithdrawl;

import DesignQuestions.ATM.ATM;

public class CashWithdrawalProcessor {

    CashWithdrawalProcessor nextCashWithdrawalProcessor;

    public CashWithdrawalProcessor(CashWithdrawalProcessor cashWithdrawalProcessor){
        this.nextCashWithdrawalProcessor = cashWithdrawalProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount){
        if(nextCashWithdrawalProcessor!=null){
            nextCashWithdrawalProcessor.withdraw(atm, remainingAmount);
        }
    }

}
