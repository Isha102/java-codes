import java.util.*;
public class smallest
{
    public static void main(String args[])
    {
        int a,b,c,smallest,temp;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number");
        a=ob.nextInt();

        System.out.println("Enter b number");
        b=ob.nextInt();

        System.out.println("Enter c number:-");
        c=ob.nextInt();

        temp=a<b?a:b;
        smallest=c<temp?c:temp;

        System.out.println("The smallest number is:-"+smallest);
    }
}