import java.util.Scanner;
class taskthree
{
    static int user = 0;
    static double limitAmount = 0;
    public static void main(String[] args)
    {
        for(int i=0;;i++)
        {
            Scanner read = new Scanner(System.in);
            System.out.print("Welcome To Banking User Interface !! \n1- deposit\n2- withdraw\n3- checkbalance\n4- Exit\nEnter your Choice: ");
            int choice = read.nextInt();
            int user = 0;
            if(choice == 1)
            {
                System.out.print("Enter the Amount to deposit: ");
                int d_amount = read.nextInt();
                deposit(d_amount);
            }
            else if(choice == 2)
            {
                System.out.print("Enter the Amount to deposit: ");
                int w_amount = read.nextInt();
                withdraw(w_amount);
                
            }
            else if(choice == 3)
            {
               checkBalance();
                
            }
            else if(choice == 4)
            {
                System.out.println("Thank You for Visiting The User Interface for Banking :)");
                break;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
    }
    
    public static void deposit(int amount)
    {
        System.out.println(user+amount + " was added sucessfully.");
        user+=amount;
    }
    public static void withdraw(int amount)
    {
        if(limitAmount + amount<=100000){
            if(user>=amount){
                System.out.println((double)amount + " was withdrawed sucessfully.");
                user-=amount;
                limitAmount+=amount;
                System.out.println(limitAmount + " is your current limit");
            }else{
            System.out.println("Your Transaction was failed because you're withrawl was more than balance and your current balance is: "+checkBalance());
            }
        }
        else
        {
          System.out.println("Your Transaction was failed because you're withrawl was reached limit");  
        }
        
    }
    public static double checkBalance()
    {
        System.out.println((double)user + " is the balace now.");
        return(user);
    }
}