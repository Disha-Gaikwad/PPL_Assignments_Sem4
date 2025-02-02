# Procedural paradigm implementation
balance = 0  # Global variable to store balance

def deposit(amount):
    global balance
    balance += amount
    print(f"Deposited: {amount}. New balance: {balance}")

def withdraw(amount):
    global balance
    if amount <= balance:
        balance -= amount
        print(f"Withdrawn: {amount}. New balance: {balance}")
    else:
        print("Insufficient funds")

def check_balance():
    print(f"Current balance: {balance}")

# Example usage:
deposit(1000)
withdraw(500)
check_balance()
withdraw(600)  # This should trigger insufficient funds message