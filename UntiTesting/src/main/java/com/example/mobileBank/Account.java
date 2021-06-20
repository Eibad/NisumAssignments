package main.java.com.example.mobileBank;

public class Account {

    private String owner;
    private long balance;
    private int pin;


    public Account(String owner, long balance, int pin) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
    }

    public long getBalance() {
        return balance;
    }

    public boolean verifyPin(int pin) {
        if (this.pin == pin) {
            return true;
        }
        return false;
    }


    public void transferTo(Account toAcc, long amount) {
        if (amount >= 500 && amount <= balance) {
            balance -= amount;
            toAcc.balance += amount;
        }
    }
}
