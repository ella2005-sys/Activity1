
package activity1;

import java.util.Scanner;
public class Activity1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        String name;
        int subjects;
        
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();
        
        double total = 0;
        
           for(int i = 1; i <= subjects; i++){
               System.out.print("Enter grade for sub"+i+ ":");
               double grade = sc.nextDouble();
               total += grade;
           }
           
           
        double ave = total / subjects;
        
        System.out.printf("\nAverage: %.2f\n", ave);
        
        if (ave>=74){
          System.out.print("PASSED!");
        }else{
          System.out.print("FAILED");
        }
           
          
    }
    
}
