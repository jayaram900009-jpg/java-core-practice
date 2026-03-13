//CheckPositive.java(if):
public class CheckPositive {
    public static void main(String[] args) {
        int number = 10;

        if(number > 0) {
            System.out.println("Number is positive");
        }
    }
}

//EvenOdd.java(if - else):
public class EvenOdd {
    public static void main(String[] args) {
        int num = 7;

        if(num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}

//StudentGrade.java(if - else if -else):
public class StudentGrade {
    public static void main(String[] args) {
        int marks = 82;

        if(marks >= 90) {
            System.out.println("Grade A");
        }
        else if(marks >= 75) {
            System.out.println("Grade B");
        }
        else if(marks >= 50) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }
    }
}
//VotingEligibility.java(Nested if):
public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        boolean citizen = true;

        if(age >= 18) {
            if(citizen) {
                System.out.println("Eligible to vote");
            }
        }
    }
}
//DayName.java(switch case):
public class DayName {
    public static void main(String[] args) {

        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
//Simple Calculator using (switch case):

public class Calculator {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        char operator = '+';

        switch(operator) {

            case '+':
                System.out.println("Sum: " + (a + b));
                break;

            case '-':
                System.out.println("Difference: " + (a - b));
                break;

            case '*':
                System.out.println("Product: " + (a * b));
                break;

            case '/':
                System.out.println("Division: " + (a / b));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}





