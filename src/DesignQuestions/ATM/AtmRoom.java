package DesignQuestions.ATM;

public class AtmRoom {

    ATM atm;

    User user;

    public static void main(String args[]){
        AtmRoom atmRoom = new AtmRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm,atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentATMStatus();
    }

    private void initialize(){
        this.atm = ATM.getAtmObject();
        this.user = createUser();
        this.atm.setAtmBalance(3500, 1,2,5);
    }

    private User createUser(){
        user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {

        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }

}
