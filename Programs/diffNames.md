Java allows the class name to differ from the name of the source file. This flexibility in naming conventions is useful for organizing and structuring Java projects. Here's a simple demonstration:

#### Source Code

**ClassNameDifferent.java**:

```java
// Source file name: SourceFileDifferent.java
public class ClassNameDifferent {
    public static void main(String[] args) {
        System.out.println("Class name: ClassNameDifferent");
        System.out.println("Source file name: SourceFileDifferent.java");
    }
}
```

#### Compilation and Execution

To compile and run this Java program, follow these steps:

1. **Save the Code**: Copy the above `ClassNameDifferent.java` code into a file named `SourceFileDifferent.java`.

2. **Compile the Program**:
   Open your terminal or command prompt, navigate to the directory where `SourceFileDifferent.java` is located, and execute the following commands to compile and run the Java source file:
   ```cmd
   javac SourceFileDifferent.java
   java ClassNameDifferent
   ```

#### Expected Output

Upon running the program (`java ClassNameDifferent`), this is the output:

```
Class name: ClassNameDifferent
Source file name: SourceFileDifferent.java
```
