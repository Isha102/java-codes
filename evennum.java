import java.util.*;
public class evennum{
    public static void main(String args[])
    {
        int a,b;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the first number:-");
        a=in.nextInt();

        System.out.println("enter the second number:-");
        b=in.nextInt();

        System.out.println("Even numbers between '+a+' and '+b+'");

        if(a<b)
        {
            for(int i=a;i<=b;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        }
        else if(a>b){
            for(int i=a;i>=b;i--)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        }
        else
        {
            if(a%2==0)
            {
                System.out.println("even number is a :-"+a);
            }
            else{
                System.out.println("no numbers.");
            }
        }

    }
}