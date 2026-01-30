package Homework_2.HeartlandCarsOfAmericaClassesEnhanced;

/**
 * Represents a partial time employee paid per hour
 * * @author Manuel Alonso
 * @version 2.0
 */
public class PartTimeEmployee extends Employee {
    private double payPerHour;
    private int hoursWorked;

    /**
     * Constructor for PartTimeEmployee.
     * @param firstName Name
     * @param lastName Last Name
     * @param payPerHour Payment per every hour
     * @param hoursWorked Hours worked over the period
     */
    public PartTimeEmployee(String firstName, String lastName, double payPerHour, int hoursWorked) {
        super(firstName, lastName);
        this.payPerHour = payPerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double computeCompensation() {
        return payPerHour * hoursWorked;
    }

    @Override
    public String createPayStub() {
        return String.format("Employee: %s %s\nType: Part-Time\nCompensation: $%.2f", 
                firstName, lastName, computeCompensation());
    }
}