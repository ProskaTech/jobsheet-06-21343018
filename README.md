## Object-oriented Programming 04: Java Operators
> Created by Anita Nursi &nbsp;&middot;&nbsp;
> Student ID Number: 21343018 &nbsp;&middot;&nbsp;
> Majority of Informatics &nbsp;&middot;&nbsp;
> Faculcity of Engineering &nbsp;&middot;&nbsp;
> Universitas Negeri Padang
---
# About
This is a learning project about Decision Making in Java. Decision Making in programming is similar to decision-making in real life. In programming also face some situations where we want a certain block of code to be executed when some condition is fulfilled. 

A programming language uses control statements to control the flow of execution of a program based on certain conditions. These are used to cause the flow of execution to advance and branch based on changes to the state of a program. 

---
# #1 IF
if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not. 
```
if(condition) 
{
   // Statements to execute if
   // condition is true
}
```
---
# #2 IF-ELSE
The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false. 
```
if (condition)
{
    // Executes this block if
    // condition is true
}
else
{
    // Executes this block if
    // condition is false
}
```
---

# #3 IF-ELSE-IF
Here, a user can decide among multiple options.The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, the statement associated with that if is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final else statement will be executed. 
```
if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;
```
---

# #4 SWITCH-CASE
The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 
```
switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}
```
---

### Source
https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/

---
