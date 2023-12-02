package practice;

public class InheritanceEx {
}


//  Did you notice the protected modifier in Vehicle?
//
//  We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.
//
//  Why And When To Use "Inheritance"?
//  - It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

class Vehicle {
  protected String brand = "ford";

  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";

  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}

//  Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
class Animal {
  void walk() {
    System.out.println("I am walking");
  }

  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

//This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:

class Bird extends Animal {
  void fly() {
    System.out.println("I am flying");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

//Finally, we can create a Bird object that can both fly and walk.

class Solution {
  public static void main(String[] args) {

//    Bird bird = new Bird();
//    bird.walk();
//    bird.fly();


    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}

//
//  This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.
//
//        The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify
//        the main method accordingly so that the code prints the following lines:
