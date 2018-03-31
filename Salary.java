import java.util.*;
/*****************************************************************************
 * 4.14.2
 * Kelly
 ****************************************************************************/
public class Salary {                         
   public static void main (String [] args) { 
      Scanner scnr = new Scanner(System.in);
      int hourlyWage = 0;
      int workHoursPerWeek = 0;      
      int workWeeksPerYear = 0;
      
      int annualSalary; 
      int monthlySalary; 
      final int MONTHS_PER_YEAR = 12;            
      
      System.out.println("Enter hourly wage: ");
      hourlyWage = scnr.nextInt();
      
      System.out.println("Enter work hours per week: ");
      workHoursPerWeek = scnr.nextInt();
      
      System.out.println("Enter work weeks per year: ");
      workWeeksPerYear = scnr.nextInt();
      
      annualSalary = hourlyWage * workHoursPerWeek * workWeeksPerYear;
      System.out.print("Annual salary is: ");         
      System.out.println(annualSalary);  
      
      monthlySalary = annualSalary/MONTHS_PER_YEAR;
      System.out.print("Monthly salary is: ");
      System.out.println(monthlySalary); 
   } 
}
    
   