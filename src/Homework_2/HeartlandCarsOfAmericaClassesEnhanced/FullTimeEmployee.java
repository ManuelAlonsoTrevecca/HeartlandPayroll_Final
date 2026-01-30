package Homework_2.HeartlandCarsOfAmericaClassesEnhanced;

/**
 * Represents a full time employee with base salary and extra hours.
 * * @author Manuel Alonso
 * @version 2.0
 */
public class FullTimeEmployee extends Employee {
    private double baseSalary;
    private int hoursWorked;

    /**
     * Constructor for FullTimeEmployee.
     * @param firstName Name
     * @param lastName Last Name
     * @param baseSalary Monthly base salary
     * @param hoursWorked Total hours worked
     */
    public FullTimeEmployee(String firstName, String lastName, double baseSalary, int hoursWorked) {
        super(firstName, lastName);
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computeCompensation() {
        if (hoursWorked <= 80) {
            return baseSalary;
        } else {
            double hourlyRate = baseSalary / 80.0;
            return baseSalary + ((hoursWorked - 80) * (hourlyRate * 1.5));
        }
    }

    @Override
    public String createPayStub() {
        return String.format("Employee: %s %s\nType: Full-Time\nCompensation: $%.2f", 
                firstName, lastName, computeCompensation());
    }
}