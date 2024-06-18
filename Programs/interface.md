## Program

Write a simple calculator program in Java that performs basic arithmetic operations (addition, subtraction, multiplication, and division) for two user-provided numbers


## Code

```java
public interface Calculator {

  double add(double a, double b);

  double subtract(double a, double b);

  double multiply(double a, double b);

  double divide(double a, double b);
}

public class SimpleCalculator implements Calculator {

  @Override
  public double add(double a, double b) {
    return a + b;
  }

  @Override
  public double subtract(double a, double b) {
    return a - b;
  }

  @Override
  public double multiply(double a, double b) {
    return a * b;
  }

  @Override
  public double divide(double a, double b) {
    // This function does not handle division by zero
    return a / b;
  }
}

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Simple Calculator");

    while (true) {
      System.out.print("Enter first number: ");
      double num1 = scanner.nextDouble();

      System.out.print("Enter operator (+, -, *, /): ");
      char operator = scanner.next().charAt(0);

      System.out.print("Enter second number: ");
      double num2 = scanner.nextDouble();

      SimpleCalculator calculator = new SimpleCalculator();
      double result;

      switch (operator) {
        case '+':
          result = calculator.add(num1, num2);
          break;
        case '-':
          result = calculator.subtract(num1, num2);
          break;
        case '*':
          result = calculator.multiply(num1, num2);
          break;
        case '/':
          result = calculator.divide(num1, num2);
          break;
        default:
          System.out.println("Invalid operator!");
          continue;
      }

      System.out.println("Result: " + result);

      System.out.print("Continue? (y/n): ");
      char choice = scanner.next().charAt(0);
      if (choice != 'y' && choice != 'Y') {
        break;
      }
    }

    scanner.close();
    System.out.println("Goodbye!");
  }
}
```


## Output

```
Simple Calculator
Enter first number: 5
Enter operator (+, -, *, /): +
Enter second number: 3
Result: 8.0
Continue? (y/n): y
Enter first number: 10
Enter operator (+, -, *, /): *
Enter second number: 4
Result: 40.0
Continue? (y/n): n
Goodbye!
```
