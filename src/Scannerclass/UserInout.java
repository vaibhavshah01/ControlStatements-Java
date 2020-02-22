package Scannerclass;

import java.util.Scanner;

public class UserInout
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name =s.next();
        System.out.println("Enter Your Age:");
        int age=s.nextInt();
        System.out.println("Enter Your pH No:");
        long phno=s.nextLong();
        System.out.println("Enter Your Gender:");
        char gender=s.next().charAt(0);


    }
}
