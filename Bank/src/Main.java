import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("🏦 Welcome to the Bank!");
        System.out.println("👤 Imagine that you are a physical person");

        while (true) {
            // Display menu options
            System.out.println("\n==============================");
            System.out.println("📋 Please choose an option:");
            System.out.println("1️⃣  Create Account");
            System.out.println("2️⃣  Get minimal salary");
            System.out.println("3️⃣  Deposit Money");
            System.out.println("4️⃣  Withdraw Money");
            System.out.println("5️⃣  Check Balance");
            System.out.println("6️⃣  Exit");
            System.out.println("==============================");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice < 1 || choice > 6) {
                System.out.println("❌ Invalid choice. Please try again.\n");
                continue; // Restart the loop for valid input
            }

            switch (choice) {
                case 1:
                    System.out.print("📝 Enter your name: ");
                    bank.setName(scanner.nextLine());
                    System.out.println("✅ Account created for " + bank.getName() + "!");
                    break;
                case 2:
                    System.out.println("💸 Minimal salary: ");
                    bank.withdrawMinimalSalary();
                    break;
                case 3: 
                    System.out.print("💰 Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("🏧 Enter the withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.witchdraw(withdrawAmount);
                    break;
                case 5:
                    System.out.printf("💼 Current balance: $%.2f%n", bank.getBalance());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("👋 Thank you for using our bank services. Goodbye!");
                    return; // Exit the program
            }
        }
    }
}