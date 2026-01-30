package Homework_2.HeartlandCarsOfAmericaPayRollEnhanced;

import Homework_2.HeartlandCarsOfAmericaClassesEnhanced.*;
import java.io.*;
import java.util.Scanner;


/**
 * HeartlandCarsOfAmericaPayRoll_Enhanced - Batch application to process 
 * payroll from a data file and calculate employee averages.
 * @author Manuel Alonso
 * @version 2.0
 */
public class HeartlandCarsOfAmericaPayRoll_Enhanced {

    /**
     * Main method that reads employee.dat and generates payroll.dat.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Variables for accumulators and final statistics
        int countF = 0, countP = 0, countS = 0;
        double sumSalF = 0, sumHrsF = 0;
        double sumRateP = 0, sumHrsP = 0;
        double sumSalS = 0, sumSalesS = 0;

        try {
            // Configuration of files of input and output 
            File inputFile = new File("employee.dat");
            Scanner sc = new Scanner(inputFile);
         // --- This line is key to avoid the error ---
            sc.useLocale(java.util.Locale.US);
            
            PrintWriter writer = new PrintWriter(new FileWriter("payroll.dat"));
            Employee emp = null;

            while (sc.hasNext()) {
                String type = sc.next().toUpperCase();
                
                // Option to end the processing
                if (type.equals("Q")) break;

                String fname = sc.next();
                String lname = sc.next();

                if (type.equals("F")) {
                    double salary = sc.nextDouble();
                    int hours = sc.nextInt();
                    // Use of the constructor with parameters
                    emp = new FullTimeEmployee(fname, lname, salary, hours);
                    countF++; sumSalF += salary; sumHrsF += hours;

                } else if (type.equals("P")) {
                    double rate = sc.nextDouble();
                    int hours = sc.nextInt();
                    emp = new PartTimeEmployee(fname, lname, rate, hours);
                    countP++; sumRateP += rate; sumHrsP += hours;

                } else if (type.equals("S")) {
                    double salary = sc.nextDouble();
                    double sales = sc.nextDouble();
                    emp = new SalesEmployee(fname, lname, salary, sales);
                    countS++; sumSalS += salary; sumSalesS += sales;
                }

                if (emp != null) {
                    // Write in the file of output payroll.dat
                    writer.println("HEARTLAND CARS OF AMERICA");
                    writer.println(emp.createPayStub());
                    writer.println("---------------------------------------");
                }
            }

            // --- SHOW THE AVERAGE IN CONSOLE (System.out)  ---
            System.out.println("\nFINAL PROCESSING SUMMARY");
            if (countF > 0) {
                System.out.printf("Processed %d full-time employees:\n", countF);
                System.out.printf("Average base salary = $%.2f, average hours worked = %.1f\n", (sumSalF/countF), (sumHrsF/countF));
            }
            if (countP > 0) {
                System.out.printf("Processed %d part-time employees:\n", countP);
                System.out.printf("Average pay per hour = $%.2f, average hours worked = %.1f\n", (sumRateP/countP), (sumHrsP/countP));
            }
            if (countS > 0) {
                System.out.printf("Processed %d sales employees:\n", countS);
                System.out.printf("Average base salary = $%.2f, average sales volume = %.1f\n", (sumSalS/countS), (sumSalesS/countS));
            }

            // Gracefully close files 
            sc.close();
            writer.close();
            System.out.println("\nProcessing complete. results saved to 'payroll.dat'.");

        } catch (IOException e) {
            System.out.println("Error: Could not process files. " + e.getMessage());
            e.printStackTrace(); // This will tell us the exact line if it keeps giving an error
    }
}
}