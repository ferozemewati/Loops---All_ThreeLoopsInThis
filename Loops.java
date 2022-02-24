// Print 10's table using for loop

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i*10);
        }
    }
}
*/


// Print 1 to 100 counting by for loop

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=100; i++){
            System.out.println(i);
        }
    }
}
*/


// Print triangle pattern

/*
public class Loops {
    public static void main(String[] args) {
        int a=5, i=1,j=1;
        while (i<=a){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i++;
            j=1;
        }
    }
}
*/


// print table of 2 using While Loop.

/*
public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            int table=i*2;
            System.out.println(table);
            i++;
        }
    }
}
*/


// Print any table by user input Using While Loop.

/*
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please inter any value");
        int n=sc.nextInt();
        while (i<=10){
            int table=i*n;
            System.out.println(table);
            i++;
        }
    }
}
*/


//import java.util.Scanner;
/*

public class WhileLoop{
    public static void main(String[]args){
        System.out.println("Please enter any value");
        Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(i*aa);
            i++;
        }
    }
}
*/



// Down counting print using While Loop.

/*
public class WhileLoop {
    public static void main(String[] args) {
        int i=10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
    }
}
*/


// Triangle pattern print by While loop

/*
public  class Loops {
    public static void main(String[] args) {
        int i=1,j=1;
        while (i<=5){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i++;
            j=1;
        }
    }
}
*/


// Down Triangle pattern print by While loop

/*
public  class Loops {
    public static void main(String[] args) {
        int i=5,j=1;
        while (i>=1){
            while (j<=i){
                System.out.print(" * ");
                j++;
            }
            System.out.print("\n");
            i--;
            j=1;
        }
    }
}
*/


// Any table print by For loop

/*import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(i*n);
        }
    }
}*/


// Any table print by While loop

/*
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("Please enter any value");
        Scanner sc=new Scanner(System.in);
        int aye=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(i*aye);
            i++;
        }
    }
}*/


// Print stars pattern using For Loop.

/*
public class ForLoop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/


/*
public class ForLoop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/


// table of 2 print by For loop
/*
public class Loops {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            int tb=i*2;
            System.out.println(tb);
        }
    }
}
*/

// Any table print by user input using For loop
/*
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Please enter any value");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1; i<=10; i++){
            int tb=i*n;
            System.out.println(tb);
        }
    }
}
*/

// Down counting

/*
public class ForLoop {
    public static void main(String[] args) {
        for (int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}
*/

// Name print 10 times using For loop

/*
public class ForLoop {
    public static void main(String[]args){
        for (int i=1; i<=10; i++){
            System.out.println(i + " -> Feroze Khan Mewati");
        }
    }
}
*/


// Print counting 100 to 200 using While loop

/*
public class While_Loop {
        public static void main(String[] args) {
            System.out.println("Using loops");
            int i=100;
            while (i<=200) {
                System.out.println(i);
                i++;
            }
            System.out.println("Stop running while loops!");
        }
    }
*/


// Print no. from o to 100 using While loop.

/*
public class While_Loop {
    public static void main(String[] args) {
        System.out.println("Using while Loop");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Finish running while loops");
    }
}
*/


// Print counting 0 to 100 gap by 5 using While loop.

/*
public class Loops {
    public static void main(String[] args) {
        System.out.println("Using while Loop");
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i=i+5;
        }
        System.out.println("Finish running while loops");
    }
}
*/


// print no. from 100 to 200 gap by 5 no.

/*
public class While_Loop {
    public static void main(String[] args) {
        System.out.println("Start while loop from");
        int i=100;
        while (i<200){
            System.out.println(i);
            i=i+5;
        }
        System.out.println("Finish running while loop here!");
    }
}
*/


// Find factorial no. of 5 using while loop.

/*
public class While_Loop{
    public static void main(String[] args) {
        int i=1;
        int factorial=1;
        while (i<=5){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}
*/


/*
public class While_Loop{
    public static void main(String[]args){
        int i=1;
        int factorial=1;
        while (i<=5){
            factorial *=i;
            i++;
        }
        System.out.println(factorial);
    }
}
*/


// Print pattern of triangle using While loop.

/*
public class While_Loop{
    public static void main(String[] args) {
        int a=5;
        while (a<=5){
            System.out.println("*");
            a++;
        }
        System.out.println(a);
    }
}
*/


// Print pattern of down triangle using For loop.

/*public class Loops{
    public static void main(String[] args) {
        int a=5;
        for (int i=a; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}*/


/*
public class While_Loop {
    public static void main(String[] args) {
        int a=5;
        for (int i=a; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/

// Print pattern of triangle using For loop.

/*
public class While_Loop {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i++){
            for (int j=0; j< i; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/



// Print Square pattern of stars.

/*
public class While_Loop {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i < a; i++){
            for (int j=0; j< a; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/


// Print counting 1 to 10

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

    }
}
*/

// Print down counting 1 to 10

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
}
*/


// Wap to calculate the sum of first 10 natural number

/*
public class Loops{
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
*/


/*
public class Loops {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1; i<=10; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
*/


// Wap that prompts the user to input any integer number.
// It should then print the multiplication table of that number

/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        int num = console.nextInt();
        System.out.println("Multiplication Table of " + num);
        for(int i=1; i<=10; i++) {
            System.out.println(num +" x " + i + " = " + (num*i) );
        }
    }
}
*/


// Wap to find the factorial value of any number entered through the keyboard.

/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num; // to hold user value number
        int fact=1; // to hold factorial
        System.out.println("Please enter any value");
        num= sc.nextInt();
        for (int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println(fact); // 1*2*3*4*5=120
    }
}
*/


/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value");
        int n= sc.nextInt();
        int fact=1;
        for (int i=1; i<=n; i++){
            fact*=i;
        }
        System.out.println(fact);  // 1*2*3*4*5=120
    }
}
*/


// Write a program that prompts the user to input an integer and
// then outputs the number with the digits reversed, For example
// if the input is 12345, the output should be 54321.

/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value");
        int num= sc.nextInt();
        int temp=num;
        int reminder=0;
        while (temp>0){
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp /= 10;
        }
        System.out.println("Reverse of " + num + " is " + reverse);
        }
    }
*/


    // Wap to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 24 .....

/*
import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value");
        int firstTerm=0, secondTerm=1, thirdTerm;
        int num=sc.nextInt();
        System.out.println( firstTerm + " " + secondTerm);
        for (int i=3; i<=num; i++){
            thirdTerm = firstTerm + secondTerm;
            System.out.println(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
*/


// Star Pattern
// Right Triangle Star Pattern

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
*/


// Left Triangle Star Pattern

/*
public class Loops {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i <=6; i++) {
            for (int j = 2 * (6-i); j >=0; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/


/*
public class Loops {
    public static void main(String[] args) {
        int i, j, row=6;
        for (i=0; i<row; i++){
            for (j=2*(row-i); j>=0; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/


// Print down counting 100 to 1.

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=100; i>=1; i--){
            System.out.println(i);
        }
    }
}
*/


// Print down counting 100 to 1 gap by 2 using While loop.

/*
public class Loops {
    public static void main(String[] args) {
        int i=100;
        while (i>=1){
            System.out.println(i);
            i=i-2;

        }
    }
}
*/


// Find factorial number of 5 using For loop.

/*
public class Loops {
    public static void main(String[] args) {
        int fact=1;
        for (int i=1; i<=5; i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
*/

// Find factorial number of 5 using While loop.

/*
public class Loops {
    public static void main(String[] args) {
        int i=1,fact=1;
        while (i<=4){
//            fact*=i;
//            fact*fact=i
              fact=fact*i;
            i++;
        }System.out.println(fact);
    }
}
*/


// Print table of 4 in this sequence

/*
public class Loops {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            System.out.println(4 + " * "+i + " = "+ i*4);
        }
    }
}
*/


// Print any table by user input using for loop.

/*
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter any value");
        int n= sc.nextInt();
        for (int i=1; i<=10;i++){
            System.out.println(i*n);
        }
    }
}
*/


// Pyramid Star Pattern

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<6; i++){
            for (int j=6-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
*/


//  Reverse Pyramid Star Pattern - Opposite

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=6; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<6-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/


// Print Diamond pattern  ->  Using for loop.

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=7; i++){
            for (int j=1; j<=7-i; j++)
                System.out.print(" ");
                for (int j=1; j<=2*i-1; j++)
                    System.out.print("*");
                System.out.print("\n");
            }
            for (int i=7-1; i>=1; i--){
                for (int j=1; j<=7-i; j++)
                    System.out.print(" ");
                for (int j=1; j<=2*i-1; j++)
                    System.out.print("*");
                    System.out.print("\n");
            }
    }
}
*/

/*
public class Loops {
    public static void main(String[] args) {
        for (int i=0; i<=7; i++){
            for (int j=1; j<=7-i; j++)
            System.out.print(" ");
            for (int j=1; j<=2*i-1; j++)
                System.out.print("*");
                System.out.print("\n");
            }
            for (int i=7-1; i>=1; i--){
                for (int j=1; j<=7-i; j++)
                    System.out.print(" ");
                for (int j=1; j<=2*i-1; j++)
                    System.out.print("*");
                    System.out.print("\n");
                }
            }
        }
*/


// Do while Loop

/*  The Java do-while loop is used to iterate a part of the program repeatedly,
    until the specified condition is true. If the number of iteration is not fixed
     and you must have to execute the loop at least once,it is recommended to use a
     do-while loop.*/


// DoWhileLoop ->  Example

/*
public class Loops {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}
*/

// If you pass true in the do-while loop, it will be infinitive do-while loop.
// }While(true);

/*
public class Loops{
    public static void main(String[] args) {
        do{
            System.out.println("infinitive do while loop");
        }while(true);
    }
}
*/


// This program will try to print “Hello World” 5 times.

/*class  Loops {
    public static void main(String args[]) {

        // initialisation expression
        int i = 1;
        do {

            // Print the statement
            System.out.println("Hello World");

            // update expression
            i++;
        }
        // test expression
        while (i < 6);
    }
}*/



// Dry-Running Example 1: The program will execute in the following manner.

/*      1. Program starts.
        2. i is initialized with value 1.
        3. Execution enters the loop
        3.a) "Hello World" gets printed 1st time.
        3.b) Updation is done. Now i = 2.
        4. Condition is checked. 2 < 6 yields true.
        5. Execution enters the loop
        5.a) "Hello World" gets printed 2nd time.
        5.b) Updation is done. Now i = 3.
        6. Condition is checked. 3 < 6 yields true.
        7. Execution enters the loop
        7.a) "Hello World" gets printed 3rd time
        7.b) Updation is done. Now i = 4.
        8. Condition is checked. 4 < 6 yields true.
        9. Execution enters the loop
        9.a) "Hello World" gets printed 4th time
        9.b) Updation is done. Now i = 5.
        10. Condition is checked. 5 < 6 yields true.
        11. Execution enters the loop
        11.a) "Hello World" gets printed 5th time
        11.b) Updation is done. Now i = 6.
        12. Condition is checked. 6 < 6 yields false.
        13. The flow goes outside the loop.
        Example 2:*/




