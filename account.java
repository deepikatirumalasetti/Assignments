package javaprojects;

public class account {
  private double balance;

  public account() {

    this.balance = 10000;
  }

  public account(double initialBalance) {

    this.balance = initialBalance;
  }

  public void deposit(double amount) {

    this.balance = this.balance + amount;
  }

  public void withdraw(double amount) {

    if (amount > this.balance) {
      throw new IllegalArgumentException("InsufficientBalanceException");
    }
    this.balance = this.balance - amount;
  }

  public double getBalance() {

    return this.balance;
  }
}
