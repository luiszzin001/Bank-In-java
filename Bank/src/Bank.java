public class Bank {
    private String name;
    private double minimalSalary = 1850.00; // Example minimal salary
    private double balance = 0.0;
    private boolean minimalSalaryWithdrawn = false;

    public boolean withdrawMinimalSalary() {
        if (minimalSalaryWithdrawn) {
            System.out.println("🚫 You have already withdrawn your minimal salary. Only one withdrawal allowed!");
            return false;
        }
        balance += minimalSalary;
        minimalSalaryWithdrawn = true;
        System.out.printf("🎉💸 Minimal salary of $%.2f has been withdrawn! Current balance: $%.2f%n", minimalSalary, balance);
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMinimalSalary() {
        return this.minimalSalary;
    }
    
    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("⚠️ Deposit amount must be positive! Please try again.");
        } else if (amount > 0 && amount <= minimalSalary) {
            balance -= amount;
            System.out.printf("✅💰 Deposit successful! Your new balance is: $%.2f%n", balance);
        } else {
            System.out.println("❌ The amount is greater than your minimal salary limit.");
        }
    }

    public void witchdraw(double amount) {
        if (amount > balance) {
            System.out.println("🚫 Insufficient balance for withdrawal. Please check your funds!");
        } else if (amount <= balance && amount > 0) {
            balance += amount;
            System.out.printf("✅🏧 Withdrawal successful! Your new balance is: $%.2f%n", balance);
        } else {
            System.out.println("⚠️ The withdrawal amount must be positive!");
        }
    }
}
