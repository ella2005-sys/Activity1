
package activity1;

import java.util.Scanner;
import banking.bankingClass;

public class Main {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        bankingClass bank = new bankingClass();
        int attemp = 3;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = in.nextInt();
        
        switch(choice){
            case 1:
                while( attemp != 0){
       
                
                System.out.print("Enter your Account No: ");
                int accountNo = in.nextInt();

                System.out.print("Enter your Pin: ");
                int pin = in.nextInt();
              
                    if(bank.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                        System.exit(0);
                    }else{
                        attemp--;
                        System.out.println("Login Failed" +attemp);
                    }
                    if (attemp == 0){
                        System.out.println("Try Again!");
                    }
                
                }
                break;
                
            case 2:  
                break;
            case 3:
                
                break;
            default:
        
        }
    }
    }






























































































































    
       
        
            

