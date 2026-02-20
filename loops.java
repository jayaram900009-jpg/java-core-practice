//Level 1 – Basic Loop Practice
//Print Numbers from 1 to 10
public class numbers {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) { //for loop
            System.out.println(i);
        }
    }
}


//Print Numbers from 10 to 1
public class reversenumber {
    public static void main(String[] args) {
        int n = 10;
        while(n >= 1) {       // while loop
            System.out.println(n);
            n--;
        }
    }
}
//Print Even Numbers from 1 to 50
public class evennumbers {
    public static void main(String[] args) {
        int n = 50;
        for(int i=1;i<=50;i++) {  //forloop
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
//Print Odd Numbers from 1 to 50
public class odd {
    public static void main(String[] args) {
        int n = 1;
        while(n<=50) {   //while loop
            if(n % 2 != 0) 
            System.out.println(n);
            n++;
        }
    }
}
