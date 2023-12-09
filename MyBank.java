import java.util.Scanner;    
public class MyBank 
{     
    public static void main(String args[] )  
    {  
        int balance = 100000,PIN=9005, withdrawal_Amount, deposit_Amount;   
        Scanner input = new Scanner(System.in); 
        System.out.println("-----MY BANK ATM----");
        System.out.println("ENTER THE PIN"); 
        int x=input.nextInt();
        if(PIN==x)
        {
          while(true)  
        {   
            System.out.println(" 1.Withdrawal");  
            System.out.println("2.Deposit");  
            System.out.println("3.Balance Enquiry");  
            System.out.println("4.EXIT");  
            System.out.println("ENTER YOUR CHOICE"); 
            int choice = input.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.println("Enter money to be withdrawn");  
         withdrawal_Amount= input.nextInt();  
        if(balance>= withdrawal_Amount)  
        {   
            balance-=withdrawal_Amount;  
            System.out.println("Please collect your money");
            System.out.println("DO YOU WANT DISPLAY THE BALANCE 0 or 1");
            int ch=input.nextInt();
            if(ch==1)  {
                System.out.println("BALANCE AVAILABLE is  "+balance);
            }
            else{
                System.out.println("THANK YOU!!!");
            }
        }  
        else  
        { 
            System.out.println(" TRANSACTION CANCELLED DUE TO INSUFFICIENT BALANCE");  
        }  
        System.out.println("");  
        break;  
   
        case 2:  
        System.out.println("Enter money to be deposited");  
        deposit_Amount = input.nextInt();   
        balance+=deposit_Amount;  
        System.out.println("TRANSACTION SUCCESSFUL OF DEPOSIT   "+deposit_Amount);  
        System.out.println("");  
        break;  
        case 3:  
        System.out.println("BALANCE AVAILABLE  "+balance);  
        break;  
        case 4:  
        System.exit(0);  
            }  
        }  
    }
    else{
        System.out.println("***TRANSACTION CANCELLED DUE TO INCORRECT PIN***");
    }
    }  
}