
package BankApp;
import java.util.Scanner;
public class Account {
    private String OwnerName;
    private String AccNum;
    private double balance;

    public Account(String OwnerName, String AccNum, double balance) {
        this.OwnerName = OwnerName;
        this.AccNum = AccNum;
        this.balance = balance;
    }

    public void depo(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount +" "+ "is deposited successfully!");
        } else {
            System.out.println("The amount deposited is invalid!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " " + "is withdrawn successfully");
        } else System.out.println("Bad withdrawal amount or balance");
    }public void DisBal(){
        System.out.println("Current balance is"+ " " +balance);
    }
}


