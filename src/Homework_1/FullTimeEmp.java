package Homework_1;
import java.text.DecimalFormat;
public class FullTimeEmp {
	  /** Atributos privados para seguridad de los datos
	   */
    private String firstName;
    private String lastName;
    private double baseSalary;
    private int hoursWorked;
   
    /** Método para relaizar el calculo de salario
     */ 
    
    public double computeCompensation() {
        double compensation;
        double payPerHour = baseSalary / 80;
        if (hoursWorked > 80) {
            compensation = baseSalary + (hoursWorked - 80) * 1.5 * payPerHour;
        } else {
            compensation = baseSalary;
        }
        return compensation;
    }
    /** Método para generar el recibo
     */ 
     
    public String createPayStub() 
    {
    	DecimalFormat currencyFormat = new DecimalFormat("0.00");
    	double salary;
    	salary = computeCompensation();
    	String outStr;
    	outStr = "\n\t\tHEARTLAND CARS OF AMERICA\n" +
    	               "\n\t" + firstName + " " + lastName +
    	               "\n\tBasic Salary \t$" + currencyFormat.format(baseSalary) +
    	               "\n\tHours Worked \t" + hoursWorked +
    	               "\n\tPay          \t$" + currencyFormat.format(salary) + "\n";
        return outStr;
    }
    /**
     Accessor method for first name @ return first name
     @return
     */
    
    public String getFirstNAme()
    {
    	 return firstName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    public double getBaseSalary()
    {
    	return baseSalary;
    }
    public int getHoursWorked()
    {
    	return hoursWorked;
    }
    
    /** Métodos Setter (Los que el main llamará)
     */
    
    public void setFirstName(String inFirstName) { firstName = inFirstName; }
    public void setLastName(String inLastName) { lastName = inLastName; }
    public void setBaseSalary(double inBaseSalary) { baseSalary = inBaseSalary; }
    public void setHoursWorked(int inHoursWorked) { hoursWorked = inHoursWorked; }
    
    /**
     * Método para el formato del nombre de usuario
     */
    
    public String toString()
    {
    	String str;
    	str = firstName +" " +lastName;
    	return str;
    }
}