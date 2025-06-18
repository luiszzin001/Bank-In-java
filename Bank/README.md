# 💸 Bank Console Application

This is a simple Java console application that simulates basic banking operations for a user.

## Features

- 📝 Create an account with your name  
- 💸 Withdraw minimal salary (only once per account)  
- 💰 Deposit money  
- 🏧 Withdraw money  
- 💼 Check your current balance  
- ❌ Prevents invalid operations and duplicate minimal salary withdrawals

## How It Works

When you start the application, you interact with a menu in the terminal.  
The logic is simple and user-friendly:

- **Account Creation:**  
  You can create an account by entering your name. This is stored for your session.

- **Minimal Salary Withdrawal:**  
  You can withdraw a fixed minimal salary amount, but only once. The program uses a flag to ensure you can't withdraw this salary more than one time.

- **Deposits:**  
  You can deposit any positive amount. The balance is updated and shown after each deposit.

- **Withdrawals:**  
  You can withdraw money as long as you have enough balance and the amount is positive. The program prevents overdrafts and negative withdrawals.

- **Balance Check:**  
  At any time, you can check your current balance.

- **Input Validation:**  
  The application checks for invalid menu options and invalid operations (like negative deposits or withdrawals, or trying to withdraw the minimal salary more than once), always giving clear feedback with emojis.

The logic is handled by two main classes:
- `Main.java` manages the user interface and menu.
- `Bank.java` manages the account data and operations, ensuring all business rules are followed.

## How to Run

1. Make sure you have [Java](https://www.oracle.com/java/technologies/downloads/) installed.
2. Compile the project:
    ```sh
    javac src/*.java
    ```
3. Run the application:
    ```sh
    java -cp src Main
    ```

## Example Menu

```
==============================
📋 Please choose an option:
1️⃣  Create Account
2️⃣  Get minimal salary
3️⃣  Deposit Money
4️⃣  Withdraw Money
5️⃣  Check Balance
6️⃣  Exit
==============================
```

## Author

- [Luis Fernando]

---
✨ Enjoy your banking experience! ✨
