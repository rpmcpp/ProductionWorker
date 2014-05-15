/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      ProductionWorker Class Demo Program                                       *
 ********************************************************/

package ProductionWorker;

/**
 * @author RPM
 */
public class ProductionWorker extends Employee {
    
   int workerShift;                     // To test for shift
   double hourlyPayRate;                // Holds hourly pay rate
   public static int DAY_SHIFT = 1;     // Translate shift to int code
   public static int NIGHT_SHIFT = 2;
   
   // Default Production Woirker constructor to enter info later 
   public ProductionWorker()
   {
      
   }
   
   // Production Worker constructor accepts employe name, number and hire date
   // for SuperClass Employee and shift and payrate for itself
   public ProductionWorker(String name, String num, String hireDate, int shift, double payRate)
   {
      
      super(name, num, hireDate); 
       
      workerShift = shift;
      hourlyPayRate = payRate;
      
   }
   
   // Method to set employee shift
   public void setWorkerShift(int shift)
   {
        workerShift = shift;
   } 
   
   // Method to set employee hourly pay rate
   public void setHourlyPayRate(double payRate)
   {
        hourlyPayRate = payRate;
   }
   
   // Method to set employee name
   public void setEmpName(String name)
   {
       empName = name;
   } 
   
   // Method to set employee number
   public void setEmpNum(String num)
   {
       empNum = num;
   }
   
   // Method to set employee hire date
   public void setEmpHireDate(String hireDate)
   {
       empHireDate = hireDate;
   } 
   
   // Method to return employee shift
   public int getWorkerShift()
   {
       return workerShift;
   }
   
   // Method to return employee hourly rate
   public double getHourlyPayRate()
   {
       return hourlyPayRate;
   }
   
   
   // Method to return string with production worker info
   // appended to employee info
   @Override
   public String toString()
   {
      String str; // To hold a string

      // Create a string representing this production
      // worker's Employee info plus shift and pay rate
      str = super.toString() + "\nEmployee Shift: ";
      
      // Check for shift      
      if (workerShift == 1)
            str = str + "Day";
      if (workerShift == 2)
            str = str + "Night";  
              
      str = str + "\nEmployee Pay Rate: $" + hourlyPayRate;  

      // Return the string.
      return str;
   }
   
   
    
}
