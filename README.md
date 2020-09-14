All Bank Accounts
Do not implement or maintain the 6-digit sort code and the 8-digit account number.
Instead, the unique ID number will represent the account identification number.
This ID number is system-generated when the bank account is first created and should
start at 1005 and then each subsequent ID number should increment by 5.

Bank Customers
The unique ID number will represent the customer identification number.
This ID number is system-generated when the customer is first created and
should start at 2,000,007 and then each subsequent ID number should increment by 7.

Please note…
Current accounts are checking accounts. An ISA is an Individual Savings Account.

Introduction

The task is to design and implement the business logic layer for a
bank account management system as described below in the System Description.

A front end application is not required however you may choose to
incorporate one in order to test certain elements of your application.

If you manage to complete all of the requirements listed below,
consider what additional aspects you could incorporate in to the project
that would extend the functionality of the application and stretch your understanding of OO languages.

Try to ensure that you use various aspects of OO languages and the advantages
that brings, to give your system flexibility. This could include, but is not limited to:

•	4 pillars
•	Abstract Classes & Interfaces
•	Re-use of code through methods
•	Using access modifiers to control visibility
•	Instance vs. static members

System Description

This program will be used to generate and organise data for a bank.
We want to create, manipulate, and track different types of bank accounts,
customer information, and the connections between accounts and customers.
There will be no persistence or storage (data will have to be recreated each time the program is executed).


All Bank Accounts
•	Should have a balance associated with it
•	Should have a 6 digit sort code associated with it
•	Should have an 8 digit account number associated with it
•	Should have a unique ID number associated with it which is automatically defined and never modified
•	Should be able to deposit funds
•	Should be able to withdraw funds



There are three types of accounts that can be created. These are as follows:

Savings Accounts (Personal Saver)
•	Should not be able to withdraw more than the balance
•	Should store an interest rate i.e. 14.5% = 14.5
•	Should be able to update the balance based on the current interest rate using
the following formula: current balance + (current balance * ( interest rate / 100 ))
•	Should be able to change the value of the interest rate

Current Accounts
•	Should store an overdraft amount up to £2,500
•	Should allow the overdraft amount to be set upon creation of the account
•	Should allow withdrawal up to the value of the overdraft amount
•	Should store an overdraft charges interest rate i.e. 14.5% = 14.5
•	Should store the overdraft charges interest rate to be set upon the creation of the account
•	Should be able to update the balance with the overdraft charges. The overdraft charges
should be calculated using the following formula: amount of overdraft used * ( interest rate / 100 )
•	Should be able to change the value of the overdraft charges interest rate
•	Should be able to create a current account without an overdraft amount and interest charge rate
i.e. if one is not included, the other should not be included. In this scenario, both values should default to 0

ISA (Personal Saver)
•	Should not be able to withdraw more than the balance
•	Should store an interest rate that is constant for all ISAs i.e. 14.5% = 14.5
•	Should be able to change the value of the interest rate
•	Should be able to update the balance based on the current interest rate using the following
formula: current balance + (current balance * ( interest rate / 100 ))

 
There exist some categories for the above accounts. There may be a need in the future to add
more types of accounts that fall in to the below categories or to add more functionality to the below categories.

Personal Saver Accounts
•	The following are considered to be Personal Saver accounts:
o	Savings Accounts
o	ISAs
•	Should be able to accrue additional funds to be added to the balance based on an interest rate for the account

Everyday Accounts
•	The following are considered to be Everyday accounts:
o	Current Accounts


There are requirements for what information should be stored on customers.

Bank Customers:
•	Should have an automatically generated, unique ID number associate to them
•	Should have a first name, last name

Finally, there are some administrative restrictions in place.

Managing data:
•	Any number of accounts and/or customers may exist in the system at once
•	A customer should be able to have zero or many accounts
•	A customer can own any number of any type of account
•	Should be able to print out the account information of all accounts owned by a customer
•	Should be able to update the interest accrued on all Personal Saver accounts owned by a customer

