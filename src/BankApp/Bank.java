package BankApp;

public class Bank {
    public static void main(String[] args) {
        Account account1=new Account("John Newman", "GR1259666332145",1200);
        Account account2=new Account("Scooby Doo", "DE2259632222224",2500);
        //account1 moves!
        account1.DisBal();
        account1.depo(400);
        account1.DisBal();
        account1.withdraw(800);
        account1.DisBal();
        //account 2 moves!
        account2.DisBal();
        account2.withdraw(2600);
        account2.DisBal();
    }
}