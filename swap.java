import java.util.*;
public class swap {
    public static void main(String args[])
    {
        int a,b;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number a:");
        a=ob.nextInt();

        System.out.println("Enter the number b:");
        b=ob.nextInt();

        System.out.println("Before swapping a = "+a+" , b = "+b+"");

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After swapping:");
        System.out.println("a is "+a+" and b is "+b+"");
    }
    
}
