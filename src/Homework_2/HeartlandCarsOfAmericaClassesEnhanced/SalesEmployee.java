package Homework_2.HeartlandCarsOfAmericaClassesEnhanced;

/**
 * Represents a sales employee with base salary and comission.
 * * @author Manuel Alonso
 * @version 2.0
 */
public class SalesEmployee extends Employee {
    private double baseSalary;
    private double salesVolume;

    /**
     * Constructor for SalesEmployee.
     * @param firstName Name
     * @param lastName Last Name
     * @param baseSalary Base Salary
     * @param salesVolume Total volume of sales made
     */
    public SalesEmployee(String firstName, String lastName, double baseSalary, double salesVolume) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.salesVolume = salesVolume;
    }

    @Override
    public double computeCompensation() {
        return baseSalary + (salesVolume * 0.02); // Example of 2% comission
    }

    @Override
    public String createPayStub() {
        return String.format("Employee: %s %s\nType: Sales\nCompensation: $%.2f", 
                firstName, lastName, computeCompensation());
    }
}