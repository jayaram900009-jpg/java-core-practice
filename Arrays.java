//Print All Elements of an Array:
public class PrintArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//Find the Sum of Array Elements:
public class SumArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}

//Find the Average of Array Elements:
public class AverageArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Average = " + average);
    }
}

//Find the Largest Element in an Array:
public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 15};

        int largest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}

//Find the Smallest Element in an Array:
public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 15};

        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest Element = " + smallest);
    }
}

//Count Even Numbers in an Array:
public class CountEven {
    public static void main(String[] args) {

        int[] arr = {10, 21, 32, 43, 54};

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even numbers count = " + count);
    }
}


//Count Odd Numbers in an Array:
public class CountOdd {
    public static void main(String[] args) {

        int[] arr = {10, 21, 32, 43, 54};

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Odd numbers count = " + count);
    }
}

//Reverse an Array:
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Print Elements at Even Index Positions:
public class EvenIndex {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

//Print Elements at Odd Index Positions:
public class OddIndex {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
