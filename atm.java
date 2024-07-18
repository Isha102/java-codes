import java.util.*;
public class atm {
    public static void main(String args[])
    {
        int balance=100000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true){

        System.out.println("Enter 1 for withdrawal.");
        System.out.println("enter 2 for deposit.");
        System.out.println("enter 3 to check balance.");
        System.out.println("Enter 4 for exit the application.");
        System.out.println("Enter your choice:-");

        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            System.out.println("Enter the money to withdraw:-");
            withdraw=sc.nextInt();
            if(withdraw<=balance)
            {
                int amount=balance-withdraw;
                System.out.println("Collect your amount.");
                System.out.println("The remaining balance is:-"+amount);

            }
            else
            {
                System.out.println("insuffiecient balance");
            }    
            break;

            case 2:
            System.out.println("enter the amount to deposit.");
            deposit=sc.nextInt();
            balance=balance +deposit;
            System.out.println("deposit successful the available balance is:-"+balance);

            break;

            case 3:
            System.out.println("The available balanace is:-"+balance);
            break;

            case 4:
            System.out.println("Are you sure you want to exit.");
            System.exit(0);
        }
    }


        }
            
}
