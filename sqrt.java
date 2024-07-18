import java.util.*;
public class sqrt{
    public static void main(String args[])
    {
        int n;
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter a number:");
        n=ob.nextInt();

        System.out.println("The square root of "+n+" is :"+squareroot(n));
        
    }

    public static int squareroot(int num)
    {
        int t,squareroot=num/2;

        do{
            t=squareroot;
            squareroot=(t+(num/t))/2;
        }
        while((t-squareroot)!=0);
            return squareroot;
    }

    
}
