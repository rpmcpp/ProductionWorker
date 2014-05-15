/********************************************************
 *      Robert McGirr                                   *
 *      CSC-262                                         *
 *      ProductionWorker Class Demo Program                                       *
 ********************************************************/
package ProductionWorker;


public class WorkerDemo
{

    /**
     * @param args
     */
    public static void main(String[] args)
   {
      String shift;
      
      
      
      // Create a ProductionWorker object and pass the initialization
      // data to the constructor.
      ProductionWorker pw =
           new ProductionWorker("John Smith", "123-A", "11-15-2005",
                                ProductionWorker.DAY_SHIFT, 16.50);
      
      // Display the data.
      System.out.println("Here's the first production worker.");
      System.out.println(pw);
      
      // Create another ProductionWorker object and use the
      // set methods.
      ProductionWorker pw2 = new ProductionWorker();
      pw2.setEmpName("Joan Jones");
      pw2.setEmpNum("222-L");
      pw2.setEmpHireDate("12-12-2005");
      pw2.setWorkerShift(ProductionWorker.NIGHT_SHIFT);
      pw2.setHourlyPayRate(18.50);
      
      // Display the data.
      System.out.println("\nHere's the second production worker.");
      System.out.println(pw2);
   }
}
