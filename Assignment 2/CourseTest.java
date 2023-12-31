
/**

Study the following program with constructor usage, and write only the missing part in the answer window:

????   // Your code

public class CourseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code, name;
       
        // Populate course 1 details
        code = sc.nextLine();    // Input course code   
        name = sc.nextLine();    // Input course name
        Course c1 = new Course(code, name); // Parameterised constructor
    
        // Populate course 2 details
        code = sc.nextLine();    // Input course code   
        name = sc.nextLine();    // Input course name
       
        Course c2 = new Course();      // Non-parameterised constructor
        c2.setCourse(code, name);
       
        // Display course details   
        System.out.printf("Courses:\n%s\n%s\n", c1.getCourse(), c2.getCourse());
    }
}


Consider a sample run:

Input:
ES-CS201
Programming for Problem Solving
PCC-CS503
Object Oriented Programming

Output:
Courses:
ES-CS201 | Programming for Problem Solving
PCC-CS503 | Object Oriented Programming


Notes:

1. Avoid displaying extra characters or input / output prompts while taking input or displaying output, which are otherwise needed for an interactive program.


2. Ensure to indent the blocks and underlying lines with appropriate number of tab / space character(s. 
This will improve readability. of your program. Write 1-2 comments in small programs and more while writing medium to large programs.

3. Powered with Programming Assistant Grading Assistant (PAGA) implementation by UD for automatically checking your assignments. 
Each time you modify the program, ensure to click "Check". This will evaluate your program with hidden test cases and provide immediate feedback.
For example:

Input	                                                         Result
CS201                                                          Courses:               
Basic Computation and Principles of Computer Programming       CS201 | Basic Computation and Principles of Computer Programming               
CS504D                                                         CS504D | Object Oriented Programming              
Object Oriented Programming




*/

import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code, name;
        code = sc.nextLine();
        name = sc.nextLine();
        Course c1 = new Course(code, name);

        code = sc.nextLine();
        name = sc.nextLine();
        Course c2 = new Course();
        c2.setCourse(code, name);

        System.out.printf("Courses:\n%s\n%s\n", c1.getCourse(), c2.getCourse());
    }
}

class Course {
    String code;
    String name;

    Course() {
        code = "";
        name = "";
    }

    Course(String c, String n) {
        code = c;
        name = n;
    }

    String getCourse() {
        return (code + " | " + name);
    }

    void setCourse(String c, String n) {
        code = c;
        name = n;
    }
}