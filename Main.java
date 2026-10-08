import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(long accountNumber,String accountHolderName,double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance; 
    }
    void deposit(double amount) {
        balance+=amount;
    }
    void withdraw(double amount) {
       if (amount <= balance) balance -= amount;
       else System.out.println("Insufficient balance");
}
double checkBalance() {
return balance;
}

void displayAccount() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Balance: " + balance);
}
}

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
long no = sc.nextLong();
sc.nextLine();
String name = sc.nextLine();
BankAccount acc = new BankAccount(no, name, sc.nextDouble());
acc.deposit(sc.nextDouble());
acc.withdraw(sc.nextDouble());
acc.displayAccount();
}
}