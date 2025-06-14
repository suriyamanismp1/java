import java.util.*;
public class ATMSystem {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.println("Automatic teller machine ");
        System.out.println("Choose 1 for withdraw ");
        System.out.println("Choose 2 for Deposit ");
        System.out.println("choose 3 for AccBalance ");
        System.out.println("select your option you will option");

        int n=s.nextInt();
        int balance=10000,deposit,withdraw;
        switch(n){
            case 1:{
                System.out.println("Enter the withdraw money ");
                withdraw=s.nextInt();
                if(balance>withdraw){
                    System.out.println("Collect money from moneySlot ");
                }
                else{
                    System.out.println("Insufficient balance\n");
                }
                break;
            }
            case 2:{
                System.out.println("Enter the money to deposited ");
                deposit=s.nextInt();
                balance+=deposit;
                System.out.println("The amount is successfully \n");
                break;
            }
            case 3:{
                System.out.println("balance history is ");
                System.out.println(balance);
                break;
            }
            case 4:{
                break;
            }
        }
    }
}
