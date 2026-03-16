public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 4: Банковская система ===");
        SavingsAccount savings = new SavingsAccount("SA001", 1000, 5);
        CreditAccount credit = new CreditAccount("CA001", 500, 1000);

        savings.deposit(200);
        savings.withdraw(100);
        savings.applyInterest();

        credit.deposit(300);
        credit.withdraw(800);
        credit.withdraw(500);
        System.out.println();
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Applied interest " + interest + ". New balance: " + balance);
    }
}

class CreditAccount extends BankAccount {
    double creditLimit;

    CreditAccount(String accountNumber, double balance, double creditLimit) {
        super(accountNumber, balance);
        this.creditLimit = creditLimit;
    }

    @Override
    void withdraw(double amount) {
        if (balance + creditLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " (credit). New balance: " + balance);
        } else {
            System.out.println("Credit limit exceeded");
        }
    }
}