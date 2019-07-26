import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee{
    public static void main(String[] args) {
        // Employee emp1 = new Employee( 1234, "Andrew", "Vu", 9000);

        // System.out.println(emp1.toString());
        // System.out.println("First  Name: " + emp1.getFirstName());
        // System.out.println("Last Name: " + emp1.getLastName());
        // System.out.println("Full Name: " + emp1.getName());
        // System.out.println("Salary before raise: " + emp1.getSalary());
        // System.out.println("Annual salary before raise: " + emp1.getAnnualSalary());
        // emp1.raiseSalary(5);
        // System.out.println("Salary after 5% raise: " + emp1.getSalary());
        // System.out.println("Annual salary after raise: " + emp1.getAnnualSalary());
        // System.out.println(emp1.toString());

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for(int i = 0; i < 5; i++){
            System.out.print("Please enter youre Employee ID: ");
            int empID = sc.nextInt();
            System.out.print("Please enter youre First Name: ");
            String firstName = sc.next();
            System.out.print("Please enter youre Last Name: ");
            String lastName = sc.next();
            System.out.print("Please enter your salary: ");
            int salary = sc.nextInt();
            employees.add(new Employee(empID, firstName, lastName, salary));
        }
  
        // Employee emp1 = new Employee( empID, firstName, lastName, salary);
        // if(emp1 != null){
        //     System.out.println("NEW EMPLOYEE HAS BEEN ADDED");
        // }
        // System.out.println(emp1.toString());
        
        for(Employee employee: employees){
            System.out.println(employee.toString());
        }
        

        
        sc.close();
    }
}