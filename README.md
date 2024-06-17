# Object Oriented Programming Lab (OOPs) - JAVA Practical Lab Programs
Welcome to the repository for Object Oriented Programming Lab (OOPs) - JAVA

# Programs

## Index
- [Day 1 (07/03/2024)](#day-1-07032024)
- [Day 2 (28/03/2024)](#day-2-28032024)
- [Day 3 (04/04/2024)](#day-3-04042024)
- [Day 4](#day-4)
- [Day 6 (25/04/2024)](#day-6-25042024)
- [Day 7 (26/04/2024)](#day-7-26042024)
- [Lastest / Extra](#lastest--extra)


## Day 1 (07/03/2024)

1. Write a program in Java to print a message ```"Welcome"```. [Link to code](Programs/Welcome.java)

2. Write a program in Java to calculate the area of a rectangle or the area of a circle using system input variables. [Link to code](Programs/systemArea.java)

3. Write a program in Java to calculate Simple Interest using ```Scanner``` class. [Link to code](Programs/simpleInterest.java)

4. Write a program in Java to find whether an integer input by user is positive, negative or zero. [Link to code](Programs/checkNumber.java)

## Day 2 (28/03/2024)

1. Write a Java program to show the class name and the source file name may be different. [Link to code](Programs/diffNames.java)

2. Write two Java programs with the same instance variable ```EmpID```, ```EmpName``` and ```CreditScore```, where in the first program ```main``` will be present in the same class and in the second program the ```main``` will be in a different class. Initialize the objects in both cases using instance variables.
   [Link to code 1](Programs/sameEmp.java)
   [Link to code 2](Programs/diffEmp.java)

## Day 3 (04/04/2024)

1. Write a program in Java to implement a default constructor to show the default value of variables. [eg: - 0, null, etc] (declaration of constructor is not required). [Link to code](Programs/defConst.java)

2. Write a program in Java to implement a default constructor to show the given values of the variables by the user. [Link to code](Programs/valConst.java)

3. Write a program in Java to implement a parameterized constructor. [Link to code](Programs/parConst.java)

4. Write a program of constructor overloading by changing the sequence of parameters. [Link to code](Programs/ConsO2.java)

5. Write a program of constructor overloading by changing the number of parameters. [Link to code](Programs/ConsO1.java)

6. Write a program of constructor overloading by changing the data of parameters. [Link to code](Programs/constO3.java)

## Day 4

### Funtion Overloading
> [!NOTE]
> Forgot the program names so here's only the programs
> 1. Overload function ```sum``` with no return type. [Link to code](Programs/functionOverloading1.java)
> 
> 2. Overload function ```sum``` with return type. [Link to code](Programs/methodOverloading.java)
> 
> 3. Overload function by changing the number and data types of parameters. Class name ```Figure``` [Link to code](Programs/overloadFigures.java)
> 
> 4. Overload function by changing the data type and sequence of parameters. Class name ```Person``` [Link to code](Programs/overloadPerson.java)

## Day 6 (25/04/2024)

1. Write a Java program of single inheritance with a class ```Emp``` of salary 80,500 (variable) and a sub-class ```Programmer``` with bonus 25,000 (variable) and print the salary and bonus of the programmer. [Link to code](Programs/inheritEmp.java)

2. Write a Java program of single inheritance with a superclass ```Animal``` and a method ```eat()```. Now create a sub-class ```Dog``` with method ```bark()``` and print both the method statements (content of the method) in another class. [Link to code](Programs/inheritAnimal.java)

3. Write a program in Java to implement a chain of inheritance or multilevel inheritance where there is a parent class ```Animal1``` with ```eat()``` method. Now create a child class ```Dog1``` with ```bark()``` method and then create a class ```Babydog``` - which is derived from ```Dog``` class with ```weep()``` method. Now print all the statements of the methods in another class ```TestAnimal1```. [Link to code](Programs/inheritPuppy.java)

4. Write a program in Java to implement hierarchical inheritance with a base class ```Animal2``` with ```eat()``` method. Now create two derived/extended classes ```Dog1``` and ```Cat1``` with ```bark()``` and ```meow()``` respectively. Now print all the methods' statements of 3 classes in another class ```TestAnimal2```. [Link to code](Programs/inheritDogCat.java)

5. Write a Java program to create a base class ```B``` and print the values of two variables ```i``` and ```j``` in that class with a ```display()``` method. Now create a class ```Derive``` that inherits the previous base class with a variable and a method ```sumijk()``` and print the sum of ```i```, ```j``` and ```k``` in the ```Derive``` class and also print the values of ```i```, ```j``` and ```k```. (object initialized by reference variable). [Link to code](Programs/inheritB.java)

6. Write a program of hierarchical inheritance to create a superclass ```Building``` that stores the number of floors, number of bedrooms and total area. [Link to code](Programs/inheritBuild.java)   
Create two derived classes from ```Building``` class with the following attributes:
   
    | **BHK2**              | **BHK3**              |
    |-----------------------|-----------------------|
    | Number of bedroom | Number of Bedroom     |
    | Number of bathroom | Number of Bathroom    |
    | Number of floors  | Number of Floor       |
    | Total Area       | Number of Balcony     |
    |                  | Total Area            |

    NB: Use ```super``` keyword in derived classes to invoke immediate parent class constructor.

## Day 7 (26/04/2024)

1. Create a class ```Circle``` to implement single inheritance with method overriding having one data member ```radius``` in double and a method ```getArea()``` to return the area of the circle. Now create a subclass ```Cylinder``` having another data member ```height```. The ```Cylinder``` will override the ```getArea()``` method to return the surface area of the cylinder. Create objects of ```Circle``` and ```Cylinder``` classes in another class and show the area of the circle and surface area of the cylinder. [Link to code](Programs/overCircle.java)

2. Write a Java program of method overriding to create a class ```Vehicle``` with a method ```run()``` and now create a class ```Bike``` which inherits the ```Vehicle``` class with the same method ```run()```. The ```run``` method of ```Bike``` class overrides the ```run()``` method of ```Vehicle``` class. Now show the output after overriding. [Link to code](Programs/overBike.java)

3. Write a program in Java to create a class ```Bank``` that provides the functionality to display the rate of interest. Rate of Interest varies according to the bank. Next create 3 sub-classes ```SBI```, ```ICICI``` and ```Axis``` to implement hierarchical inheritance with method overriding, that extend the ```Bank``` class and show the rate of interest as follows:
    - ROI of ```SBI``` is 8%
    - ROI of ```ICICI``` is 7%
    - ROI of ```Axis``` is 9%
 [Link to code](Programs/overBank.java)

4. Write a Java program to find the largest number of an array, taking input from the user using command-line argument. [Link to code](Programs/comandLine.java)

5. Write a program in Java to make a super-class ```Figure``` that will store the various geometric figures, now define a method ```area()``` that will calculate the area of a triangle and the area of a rectangle. [Link to code](Programs/)

6. Write a program in Java to implement abstraction having an abstract class ```Shape``` with an abstract method ```draw()```. Create 2 derived classes ```Rectangle``` and ```Circle``` that extend ```Shape``` class and print ```Drawing Rectangle``` and ```Drawing Circle``` by overriding the method ```draw()```. [Link to code](Programs/)

7. Create an abstract class ```Bike``` with an abstract method ```run()``` and a concrete method ```gearChange()```. Now create a class ```TVS``` that extends ```Bike``` with a method ```run()``` and print "Bike is Running Safely" and "Gear Change". [Link to code](Programs/)

8. Create an abstract class ```Tiger``` with two abstract methods ```eat()``` and ```sleep()```. Now create a class ```Cat``` that extends ```Tiger``` and define methods ```eat()``` and ```sleep()``` in that class and print "Cat is Eating" and "Cat is Sleeping". [Link to code](Programs/)

9. Write a program to create an abstract class ```Vegetable``` with two abstract methods ```color()``` and ```whereGrow()```. Create two subclasses ```Peanut``` and ```Tomato``` that extend ```Vegetable``` class and print the color of ```Peanut``` and ```Tomato```, and their locations of growing. [Link to code](Programs/)

10. Write a program in Java to create an abstract class ```Account``` having four instance variables ```account_balance```, ```account_holder_name```, ```account_number``` and ```address```. Now this abstract class ```Account``` contains one abstract method ```depositedBalance()``` and a non-abstract method ```accountDetails()```. Create a subclass ```SavingsAccount``` that extends ```Account``` and display ```depositedAmount```, ```RateofInterest```, ```newBalance``` and ```accountDetails()```. [Link to code](Programs/)

## Lastest / Extra

1. Write a Java program with one Try and multiple Catch block. [Link to code](Programs/tryCatch.java)

2. Write a Java program with one Try and multiple Catch block with different user defined exception with finally block. [Link to code](Programs/error.java)

3. Write a java program to create 2 concurrent Thread. [Link to code](Programs/thread.java)
