Java Operators
Operators are used to perform operations on variables and values.

In the example below, we use the + operator to add together two values:

int x = 100 + 50;

Although the + operator is often used to add together two values, like in the example above, it can also be used to add
together a variable and a value, or a variable and another variable:

int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)

Java divides the operators into the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Bitwise operators


Java Comparison Operators
Comparison operators are used to compare two values (or variables). This is important in programming, because it helps
us to find answers and make decisions.

The return value of a comparison is either true or false. These values are known as Boolean values, and you will learn
more about them in the Booleans and If..Else chapter.

In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

int x = 5;
int y = 3;
System.out.println(x > y); // returns true, because 5 is higher than 3

Operator	Name Example
==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y


Java Logical Operators
You can also test for true or false values with logical operators.

Logical operators are used to determine the logic between variables or values:


