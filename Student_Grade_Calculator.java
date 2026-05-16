import java.util.*;
import java.util.Scanner;
public class Student_Grade_Calculator {
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int numgrade = sc.nextInt();
        
        //putting number in array................
        int[] grades = new int[numgrade];
        int sum = 0 ; 
        for(int i = 0 ; i<numgrade ; i++){
            System.out.println("Enter grade "+ (i+1)+": ");
            grades[i] =  sc.nextInt();

            // Adding the grade.................
            sum+=grades[i];
        }
        double average = (double)sum/numgrade;
        System.out.println("Average :- " + average);
    }
    
}
