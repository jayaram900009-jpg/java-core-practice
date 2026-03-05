//Swap Two Numbers Without Using a Third Variable:
import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

//Find Largest of Three Numbers:
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        }
        else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        }
        else {
            System.out.println("Largest number is: " + c);
        }
    }
}
//Convert Celsius to Fahrenheit:
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;   // formola : f =(c x 9/5)+32

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}


//Calculate Simple Interest:
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100; //formula of simple intrest

        System.out.println("Simple Interest = " + si);
    }
}
