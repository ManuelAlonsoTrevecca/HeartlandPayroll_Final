package Homework_2.HeartlandCarsOfAmericaClassesEnhanced;

/**
 * Abstract class which represents the basic structure for an employeeClase
 * Define the common attribute and the compensation method
 * * @author Manuel Alonso
 * @version 2.0
 */
public abstract class Employee {
    protected String firstName;
    protected String lastName;

    /**
     * Constructor with parameters
     * @param firstName First name of the employee
     * @param lastName Last name of the employee
     */
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Abstract method to calculate the compensation
     * Must be implemented by the subclasses
     * @return Total amount to pay the employee
     */
    public abstract double computeCompensation();

    /**
     * Create the receipt of payment(Pay Stub) of the employee 
     * @return A formatted string with the payment information
     */
    public abstract String createPayStub();
}