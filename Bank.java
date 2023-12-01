/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author kishore ch
 */
public class Bank {
    public int accountNo;
    public int pin;
    public String name;
    public float BankBalance;
    public int deposite;
    public int withdraw;
    public int enqurie;
    public String transaction_history;
    public int transfer;
    
    
      Scanner sn=new Scanner (System.in);
      
    
    
    Bank()
    {
      
        
        System.out.println("Enter the account number");
        accountNo=sn.nextInt();
        System.out.println("Enter the Pin");
        pin=sn.nextInt();
       
                
    }
    
    void checking()
    {
    if(accountNo==1234567 && pin==1225 )
    {
       
     do{
        System.out.println("Please select the option Withdraw select\n1.Bank Balance \n2.Withdraw \n3.Deposit \n4.Transfer \n5.Quit");
        int select=sn.nextInt();
       
        
            switch (select)
            {
                case 1:
                    BankBalance=50000.00f+deposite-withdraw-transfer;
                    System.out.println("BankBalance is " +(BankBalance));
                    break;
                    
                case 3:
                    System.out.println("Enter the amount deposit");
                      deposite=sn.nextInt();

                     System.out.println("Deposite is Sucessfully");
                     break;
                     
                case 2:
                    System.out.println("Enter the amount withdraw");
                     withdraw=sn.nextInt();
                    if(BankBalance>=withdraw)
                     {
                      System.out.println("Withdraw is sucessfully");
                     }
                      else
                      {
                        System.out.println("Invalid Plese Check BankBalance");
                      }
                    break;
                    
                case 4:
                     System.out.println("Enter the account number");
                     System.out.println("Enter the amount");
                     transfer= sn.nextInt();
                     if(BankBalance>=transfer)
                      {
                        System.out.println("Amount tranfer is successfully");
                      }
                     else
                      {
                          System.out.println("Failed insufficient funds");
                      }
                     break;
                     
                case 5:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Inavalid input");

            }
            
            System.out.println("Any enquires select 0 no enquries select any number");
             enqurie=sn.nextInt();

          }while(enqurie==0);
        
    }
    else
     {
        System.out.println("Bank details wrong");
        
     }
        
    }
 }
 class details
{
     public static void main(String []args)
     {
         Bank b=new Bank();
         b.checking();
         
         
        
         
     }
    
}
