package DesignQuestions.ATM.AmountWithdrawl;

import DesignQuestions.ATM.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawalProcessor{
    public TwoThousandWithdrawProcessor(CashWithdrawalProcessor cashWithdrawalProcessor) {
        super(cashWithdrawalProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {
        int required = remainingAmount/2000;
        int remaining = remainingAmount%2000;

        if(required<=atm.getNoOfTwoThousandNotes()){
            atm.deductTwoThousandNotes(required);
        } else{
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
            remaining += (required - atm.getNoOfTwoThousandNotes()) * 2000;
        }

        if(remaining!=0){
            super.withdraw(atm, remaining);
        }
    }
}
