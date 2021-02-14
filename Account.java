/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.util.Scanner;

/**
 *
 * @author oscarmendez
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        bank act = new bank();
        
        
        // Asks the user if they want to withdraw or deposit
        
        System.out.print("What would you like to do today"
                + " withdaw, deposit, or view balance? ");
        String action = input.nextLine();
        
        if (action.equalsIgnoreCase("view balance"))
        {
            System.out.println("current balance: " + act.getBank());
        }
        // Withdraws
        else if (action.equalsIgnoreCase("withdraw"))
        {
            System.out.println("Whats the amount you would like to withdraw: ");
            double withdrawAmount = input.nextDouble();
            System.out.print("Current balance: " + act.withdrawBank(withdrawAmount));
        }
        // Deposit
        else if (action.equalsIgnoreCase("deposit"))
        {
            System.out.println("What amount would you like to deposit: ");
            double depositAmount = input.nextDouble();
            System.out.print("Current balance: "+ act.depositBank(depositAmount));
        }
        
        
        
        

    }
    
}
