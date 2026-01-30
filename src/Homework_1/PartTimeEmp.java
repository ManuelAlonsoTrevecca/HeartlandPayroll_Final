package Homework_1;
import java.text.DecimalFormat;
public class PartTimeEmp {
	
    /** Atributos privados para seguridad de los datos
     * 
     */
    private String firstName;
    private String lastName;
    private double payPerHour;
    private int hoursWorked;

   
    /** Método para calcular el pago
     */ 
    public double computeCompensation() {
        return payPerHour * hoursWorked;
    }
    /** Método para generar el REcibo
     */ 
    
    public String createPayStub() {
        DecimalFormat currencyFormat = new DecimalFormat("0.00");
        double salary;
        salary= computeCompensation();
        String outStr;
        outStr = "\n\t\tHEARTLAND CARS OF AMERICA\n" +
               "\n\t" + firstName + " " + lastName +
               "\n\tSalary/Hour \t$" + currencyFormat.format(payPerHour) +
               "\n\tHours Worked\t" + hoursWorked +
               "\n\tPay         \t$" + currencyFormat.format(salary) + "\n";
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
    public double getPayperHour()
    {
    	return payPerHour;
    }
    public int getHoursWorked()
    {
    	return hoursWorked;
    }
    /** Métodos Setter (Los que el main llamará)
     */
    
    public void setFirstName(String inFirstName) { firstName = inFirstName; }
    public void setLastName(String inLastName) { lastName = inLastName; }
    public void setPayPerHour(double inPayPerHour) { payPerHour = inPayPerHour; }
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