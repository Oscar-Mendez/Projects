/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author oscarmendez
 */
public class bank {
    private double money;
    
    // Returns the value in the account
    public bank() {
        money = 1000000;
    }
    // withdraw method
    public double withdrawBank(double num){
        double newBalance = money - num;
        return newBalance;
    }
    // deposit method
    public double depositBank(double num){
        double newBalance = money + num;
        return newBalance;
    }
    
    // Getter
    public double getBank()
    {
        return this.money;
    }
    
    
    
}
