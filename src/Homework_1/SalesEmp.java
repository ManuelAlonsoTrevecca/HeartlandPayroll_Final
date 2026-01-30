package Homework_1;
import java.text.DecimalFormat;

public class SalesEmp {
    // Atributos privados
    private String firstName;
    private String lastName;
    private double baseSalary;
    private int salesVolume;

   
    /** Método para calcular el pago * 
     * @param commissionRate Tasa de comisión (ej. 0.02 para 2%).
     */
     
    public double computeCompensation() {
        return baseSalary + 0.02 * salesVolume;
    }
    /** Método para generar el REcibo
     */ 
     
    public String createPayStub() {
        DecimalFormat currencyFormat = new DecimalFormat("0.00");
        double salary;
        salary = computeCompensation();
        String outStr;
        outStr = "\n\t\tHEARTLAND CARS OF AMERICA\n" +
                 "\n\t" + firstName + " " + lastName +
                 "\n\tBasic Salary \t$" + currencyFormat.format(baseSalary) +
                 "\n\tSales Volume \t$" + currencyFormat.format(salesVolume) +
                 "\n\tPay          \t$" + currencyFormat.format(salary) + "\n";
        return outStr;
    
}
/**
Accessor method for first name @ return first name
@return
*/
public String getFirstName()
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
public int getSalesVolume()
{
	return salesVolume;
}

/** Métodos Setter (Los que el main llamará)
 */

public void setFirstName(String inFirstName) { firstName = inFirstName; }
public void setLastName(String inLastName) { lastName = inLastName; }
public void setBaseSalary(double inBaseSalary) { baseSalary = inBaseSalary; }
public void setSalesVolume(int inSalesVolume) { salesVolume = inSalesVolume; }
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