import java.util.*;
public class ascii {
    public static void main(String args[])
    {
        int num;
        char ch;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a char:");
        ch=sc.next().charAt(0);

        System.out.println("Enter a number:");
        num=sc.nextInt();

        int value=ch;
        System.out.println("char value of "+ch+" covert to:"+value);
        System.out.println("decimal value of "+num+" convert to:"+(char)num);


    }
}
