public class BankUser {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000);// передайте в банкомат сумму на счету
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " тг.");
        bankAccount.withdrawAll(800);// вызовите метод вывода средств
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount());
    }
}
