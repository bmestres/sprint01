# Assignment S101

## Level 01

### Exercise 01 - Music instruments manager:

Program that manages music instruments. Practiced **inheritence** and **polymorphism**.
It also includes a **static blocs** and **initialization blocs** test.

### Exercise 02 - Cars manager:

Program that creates a Car class with certain particularities.
This exercise practices **static** and **final** modifiers applied to attributes and methods.

- <ins>Thoughts on *final* i *static* modifiers:</ins>

The attribute *power* is initialized from the constructor because not having a **static** modifier means that, although being constant, the attribute value belongs to the class instances.

The attributes *brand* and *power* cannot be modified throughout runtime because **final** modifier indicates that the attribute's value is constant.

The attributes *brand* and *model* extend to all the class instances because **static** modifier indicates that its value belongs to all, so every class instance points to that same value.

We can see that if two Car instances are created and the *model* value gets updated in one of them, it automatically updates the attribut to the rest.

## Level 02

### Exercise 01 - Smartphone with multiple functionalities

Program that combines **inheritance** - with a superclass Phone and a subclass Smartphone - and the **interface** implementation with Camera and Clock.


## Level 03

### Exercise 01 - News editorial manager

**Description** Program that manages an editorial of sport news. Implements a manager class *Redaccio* that has an array of *Redactors*. Each Redactor has his own news array.

There a different types of *Noticia*, each of which have its own particular attributes, along with the common ones. The program implements a series of CRUD and data visualization functionalities.

**Functionalities**: 
- **I/O:** Interactive options menu
- **Editors manager:** Methods for creation and removal of editors.
- **Mews manager:** Methods for creation of news.
- **Data treatment:** Compute of price and score of news according the type and attributes.
- ** Visualizing data:** Method to display all news of a given editor.

**Technologies**:
**Backend** Java

**Installation and Execution**

1. Clone repository: https://github.com/bmestres/tasca01s1.git
2. Executable paths:

**Level 1**
- <ins>exercici01</ins>: src/main/java/nivell01/exercici01/Main.java
- <ins>exercici02</ins>: src/main/java/nivell01/exercici02/Main.java

**Level 2**
- <ins>exercici01</ins>: src/main/java/nivell02/exercici01/Main.java

**Level 3**
- <ins>exercici01</ins>: src/main/java/nivell03/exercici01/Main.java

# Assignment S102

## Level 1

### Exercise 1 - Personalized exceptions and error handling
This program implements a *Sale* object that handles shopping lists and computes the total price. Its method *calculateTotal()*
is designed to throw an *EmptySaleException* if the current products list is empty.
This represents a business logic error, therefore it is implemented as a **checked exception** and inherits from *Exception*
superclass instead of *RuntimeException*. The *TestEmptySell* class handles the exceptional event by printing a message to the user.

It also implements an out-of-bounds test that forces an *IndexOutOfBoundsException* provoked by deliberately wrong access.
In this case, it's an **unchecked exception** (an error inside the program logic) and therefore the default IndexOutOfBoundsException
is thrown automatically and safely caught within the test method.

Finally, the EmptySaleException is modified to inherit from RuntimeException. This turns it in an **unchecked exception** which means
that it's not being checked by the compiler in runtime.

## Level 2

### Exercise 1 - Secure keyboard read

This program implements a *ConsoleReader* class that prompts user to input a variety of data types and returns them after making sure the format is correct.
It does that through predefined exception *InputMismatchException* and three custom exceptions *MultipleCharacterException*, *ShortStringException* and *YesNoException*.

## Level 3

### Exercise 1 -

This program manages reservations for a movie theater. It offers the user a set of options that include making or canceling a reservation,
removing all reservations from a person as well as showing all reservation's info. It uses defensive code to prevent wrong format inputs
and to prevent any input that conflicts with the business logic.

**Functionalities**:
- **I/O:** Interactive option menu. Prevent out of range and wrong format inputs by the user.
- **ReservationService:** Methods for the creation and removal of one or many reservations from a user.
- **Visualizing data:** Display reservations information per user or generally.

**Technologies**:
**Backend** Java

**Installation and Execution**

1. Clone repository: https://github.com/bmestres/sprint01.git

2. Executable paths:
- <ins>Level 1</ins>: src/main/java/tascaS102/nivell01/Main.java
- <ins>Level 2</ins>: src/main/java/tascaS102/nivell02/Main.java
- <ins>Level 3</ins>: src/main/java/tascaS102/nivell03/Main.java











