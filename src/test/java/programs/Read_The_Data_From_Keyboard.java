package programs;

import java.util.Scanner;

public class Read_The_Data_From_Keyboard {

    public static void main(String[] args) {

        //Addition of 2 Integer Numbers
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number for addition");
        a = sc.nextInt();
        System.out.println("Enter the Second Number for addition");
        b = sc.nextInt();
        c=a+b;
        System.out.println("Sum of two integer numbers are " + c);

        //Addition of 2 Strings
        String d,e,f;
        System.out.println("Enter the First String for addition");
        d=sc.next();
        System.out.println("Enter the Second String for addition");
        e=sc.next();
        f=d+e;
        System.out.println("Sum of two Strings are " + f);

    }

}
