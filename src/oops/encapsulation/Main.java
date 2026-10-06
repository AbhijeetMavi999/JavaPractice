package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Phele delphia", 1000.0);
        bankAccount.deposit(110);
        System.out.println("Updated balance after deposited: "+bankAccount.getBalance());

        System.out.println();

        bankAccount.withdraw(550.73);
        System.out.println("Updated balance after withraw: "+bankAccount.getBalance());
    }
}
