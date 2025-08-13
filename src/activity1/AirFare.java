
package activity1;

import java.util.Scanner;

public class AirFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        float result = 0;
        float discount; 
        
        System.out.println("Distance (km): ");
        int distance = sc.nextInt();
        
        
        System.out.println("Class 1. Economy Class");
        System.out.println("Class 2. Business Class");
        System.out.println("Select class number: ");
        int c = sc.nextInt();
        
        
        
        switch (c) {
            case 1:
                result = 250*distance;
                if(distance >= 1000){
                    result = result * (float) 0.1;
                    result = result - distance;
                }   System.out.printf("Total fare: %.2f\n", result);
                break;
            case 2:
                result = 500 * distance;
                if(distance >= 1000){
                    discount = result * (float) 0.1;
                    result = result - discount;
                }   System.out.printf("Total fare: %.2f\n", result);
                break;
            default:
                System.out.println("Invalid Class! Try Again!");
                break;
        }
        
        
        
        
        
    }
    
}
