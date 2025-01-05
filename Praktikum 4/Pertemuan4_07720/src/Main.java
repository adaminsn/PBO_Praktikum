abstract class Account {
    String nomorakun;
    double balance;

    Account(String nomorakun, double balance) {
        this.nomorakun = nomorakun;
        this.balance = balance;
    }

    abstract void deposit(int amount);
    abstract void withdraw(double amount) throws InsufficientFundsException;

    void displayBalance() {
        System.out.println("Account Number: " + nomorakun + ", Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String nomorakun, double balance, double interestRate) {
        super(nomorakun, balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("mana ada orang deposit -.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Saldo anda tidak cukup!!!!!. Insufficient funds for withdrawal.!!!!!");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest Added: " + (balance * interestRate) + ", New Balance: " + balance);
    }
}

class InsufficientFundsException extends Exception {
    InsufficientFundsException (String message) {
        super(message);}
}
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Selamat Datang Nasabah BTK");
            SavingsAccount savings = new SavingsAccount("123456789", 1000.0, 0.05);
            savings.displayBalance();
            savings.deposit(500);
            savings.addInterest();
            savings.withdraw(2000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Maaf saldo gasesuai silahkan bekerja keras lagi");
        } finally {
            System.out.println("Terima Kasih telah menjadi nasabah dari bank BTK.");
            System.out.println("Thank you for being a customer of Bank BTK.");
        }
    }
}