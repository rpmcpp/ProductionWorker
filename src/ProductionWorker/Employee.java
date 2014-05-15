/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      ProductionWorker Class Demo Program                                       *
 ********************************************************/
package ProductionWorker;

/**
 * @author RPM
 */
public class Employee {
    
    String empName,     // To hold employe name, number and hire date
           empNum,
           empHireDate;
    // Default Employee constructor to enter info later
    public Employee(){
    }
    
    // Employee constructor accepts employe name, number and hire date
    public Employee(String name, String num, String hireDate)
   {
      empName = name;
      empNum = num;
      empHireDate = hireDate;
      
       
   }
   // Method to return employee name 
   public String getEmpName()
   {
       return empName;
   } 
   
   // Method to return employee number
   public String getEmpNum()
   {
       return empNum;
   }
   
   // Method to return employee hire date
   public String getEmpHireDate()
   {
       return empHireDate;
   }
   
   // Method to return employee info string
    @Override
   public String toString()
   {
      String str; // To hold a string
   
      str = "Employee Name: " + empName +
            "\nEmployee Number: " + empNum +
            "\nEmploye Hire Date: " + empHireDate;
      
      return str;
   }  
}
