# EMI-Calculator
📘 Overview The EMICalculator is a simple Java program that calculates the Equated Monthly Installment (EMI) for a loan based on the principal amount, rate of interest, and loan tenure (in months).

This program takes user input through the console and computes the EMI using the standard EMI formula.

🧮 Formula Used 𝐸𝑀𝐼=𝑃⋅𝑟⋅(𝑟)'𝑛/(1+𝑟)'𝑛−1

Where: P = Principal Loan Amount r = Monthly Interest Rate (Annual rate divided by 12 × 100) n = Loan tenure in months

🛠️ How to Run 
Make sure you have Java installed.
Save the file as EMICalculator.java inside a folder named day3.
Open your terminal and navigate to the folder. 
Compile the program:
javac day3/EMICalculator.java
Run the program:
java day3.EMICalculator
Follow the prompts to input: Principal Amount, Rate of Interest (Annual %), Number of Months (Loan tenure)
Example:
Enter the Principle Amount
100000
Enter the Rate of Interest
7.5
Enter the number of months
12
Your EMI will be: 8698.84
