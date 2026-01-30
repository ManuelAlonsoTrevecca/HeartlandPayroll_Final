package Homework_1;
import java.util.Scanner;

public class HeartlandCarsOfAmericaPayRoll 
{
    public static void main(String[] args) 
    {
    	
        // 1. Declaración de variables de referencia (Objetos)
    	
        FullTimeEmp fullTimeEmployee;
        PartTimeEmp partTimeEmployee;
        SalesEmp salesEmployee;

        // 2. Declaración de variables para capturar entrada
        
        char inputEmployeeType;
        String inputFirstName; 
        String inputLastName;
        double inputBaseSalary;
        double inputPayPerHour;
        int inputSalesVolume;
        int inputHoursWorked;

        Scanner scannedInfo = new Scanner(System.in);

        System.out.print("Enter Employee Type (F, P, S): ");
        inputEmployeeType = scannedInfo.next().charAt(0);

        switch (Character.toUpperCase(inputEmployeeType)) {
            case 'F':
                System.out.print("Enter First Name, Last Name, Base Salary, Hours: ");
                System.out.flush();
                inputFirstName = scannedInfo.next();
                inputLastName = scannedInfo.next();
                inputBaseSalary = scannedInfo.nextDouble();
                inputHoursWorked = scannedInfo.nextInt();

                fullTimeEmployee = new FullTimeEmp();
                fullTimeEmployee.setFirstName(inputFirstName);
                fullTimeEmployee.setLastName(inputLastName);
                fullTimeEmployee.setBaseSalary(inputBaseSalary);
                fullTimeEmployee.setHoursWorked(inputHoursWorked);

                System.out.print(fullTimeEmployee.createPayStub());
                break;

            case 'P':
                System.out.print("Enter First Name, Last Name, Pay per hour, Hours: ");
                System.out.flush();
                inputFirstName = scannedInfo.next();
                inputLastName = scannedInfo.next();
                inputPayPerHour = scannedInfo.nextDouble();
                inputHoursWorked = scannedInfo.nextInt();

                partTimeEmployee = new PartTimeEmp();
                partTimeEmployee.setFirstName(inputFirstName);
                partTimeEmployee.setLastName(inputLastName);
                partTimeEmployee.setPayPerHour(inputPayPerHour);
                partTimeEmployee.setHoursWorked(inputHoursWorked);

                System.out.print(partTimeEmployee.createPayStub());
                break;

            case 'S':
                System.out.print("Enter First Name, Last Name, Base Salary, Sales Volume: ");
                System.out.flush();
                inputFirstName = scannedInfo.next();
                inputLastName = scannedInfo.next();
                inputBaseSalary = scannedInfo.nextDouble();
                inputSalesVolume = scannedInfo.nextInt();

                salesEmployee = new SalesEmp();
                salesEmployee.setFirstName(inputFirstName);
                salesEmployee.setLastName(inputLastName);
                salesEmployee.setBaseSalary(inputBaseSalary);
                salesEmployee.setSalesVolume(inputSalesVolume);

                System.out.print(salesEmployee.createPayStub());
                break;
        } // Cierre del switch
        scannedInfo.close();
    } // Cierre del main
} // Cierre de la clase
