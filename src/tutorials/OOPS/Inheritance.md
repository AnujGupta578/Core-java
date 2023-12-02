Java Inheritance (Subclass and Superclass)
In Java, it is possible to inherit attributes and methods from one class to another. We group the 
"inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from


To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):

Did you notice the protected modifier in Vehicle?

We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

Why And When To Use "Inheritance"?
It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.


A Java interface can only contain method signatures and fields. The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.

You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). You need to write a class called MyCalculator which implements the interface.

divisorSum function just takes an integer as input and return the sum of all its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.

Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only. Your class shouldn't be public.