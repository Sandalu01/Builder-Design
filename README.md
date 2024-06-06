# Builder Design Pattern 

## Overview

The Builder design pattern is a creational design pattern that allows you to construct complex objects step by step. 
It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

In this example, we demonstrate the Builder design pattern using a `Computer` class.

## Classes

### `Computershop`
The `Computershop` class represents a computer with attributes like brand, RAM, display size, and display space.

```java
public class ComputerShop {
    public static void main(String[] args) {
        // Creating computers using constructor
        Computer sandalu = new Computer("Asus", 8, 30, 500);
        Computer nimal = new Computer("Mac", 4, 56, 855);

        // Applying the builder pattern
        Computer kamal = new ComputerBuilder().setBrand("MacBook").setRam(16).setDisplaySpace(256).getComputer();
        Computer ranil = new ComputerBuilder().setRam(45).setDisplaySpace(456).getComputer();

        // Printing computer details
        System.out.println(sandalu);
        System.out.println(nimal);
        System.out.println(kamal);
        System.out.println(ranil);
    }
}

```

##Benefits of the Builder Pattern

Flexibility: The builder pattern allows for greater flexibility in constructing complex objects.
Readability: The code is easier to read and understand, as it separates the construction process from the representation.
Maintainability: It is easier to maintain and extend the construction process without affecting the client code.


