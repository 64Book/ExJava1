package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Scanner input
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter numberDouble : ");
        double d = sc.nextDouble();

        System.out.print("Enter String : ");
        String s = sc.next();

        System.out.print("Enter numInt: ");
        int i = sc.nextInt();

        System.out.println("Number is " + d);
        System.out.println("String is " + s);
        System.out.println("numInt is " + i);
    }
}
