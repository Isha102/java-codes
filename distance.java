import java.util.*;
public class distance
{
    public static void main(String args[])
    {
        int dist,rate=0;
        Scanner ob = new Scanner (System.in);
        System.out.println("enter the distance:-");
        dist=ob.nextInt();

        if(dist<=5)
        {
            rate=100;
            System.out.println("the amount is:-"+rate);
        }
        else if(dist>5)
        {
            System.out.println("The teaversal is not permitted.");
        }
    }
}