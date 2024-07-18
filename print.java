import java.util.*;
public class print
{
    public static void main(String args[])
    {
        String name,dob,m_num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:-");
        name=sc.nextLine();

        System.out.print("Enter your date-of-birth:-");
        dob=sc.nextLine();

        System.out.println("Enter your mobile-number:-");
        m_num=sc.nextLine();

        System.out.println("Name-"+name);
        System.out.println("Date-Of-birth-"+dob);
        System.out.println("Mobile number-"+m_num);
    }
}