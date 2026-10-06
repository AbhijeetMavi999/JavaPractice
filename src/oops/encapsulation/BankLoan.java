package oops.encapsulation;

public class BankLoan {

    private String name;
    private int age;
    private double amount;

//    BankLoan(String name, int age, double amount) {
//        this.name = name;
//        this.age = age;
//        this.amount = amount;
//    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
