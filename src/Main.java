import java.util.Scanner;

import static java.lang.Long.sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a, b;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        result= sum(a,b);

        System.out.println("Sum of two numbers is "+result);
        System.out.println("Difference of two numbers is "+sub(a,b));
        System.out.println("Multiplication of two numbers is "+mul(a,b));
        System.out.println("Division of two numbers is "+div(a,b));


        sc.close();

        //Setting and getting value from Person class

        Person man1 = new Person("Rahul", "Innovation", 34);
        Person man2 = new Person("Krishna","Research", 29);

        System.out.println("Man1 name is"+man1.getName()+"Age is"+man1.getAge()+"His Department is"+man1.getDepartment());
    }

    private static int sum(int a, int b) {
        return a+b;
    }
    private static int sub(int a, int b) {
        return a-b;
    }
    private static int mul(int a, int b) {
        return a*b;
    }
    private static int div(int a, int b) {
        return a/b;
    }


}