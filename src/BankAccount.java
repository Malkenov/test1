public class BankAccount {
    private long moneyAmount;

    public long getMoneyAmount() {
        return moneyAmount;
    }


    public void setMoneyAmount(long moneyAmount) {
        this.moneyAmount = moneyAmount;
    }


    public void withdrawAll(long newMoneyAmount) {
        moneyAmount = getMoneyAmount() - newMoneyAmount;
    }
}


