public class TestEmployee{
    public static void main(String[] args) {
        Employee emp1 = new Employee( 1234, "Andrew", "Vu", 9000);

        System.out.println(emp1.toString());
        System.out.println("First  Name: " + emp1.getFirstName());
        System.out.println("Last Name: " + emp1.getLastName());
        System.out.println("Full Name: " + emp1.getName());
        System.out.println("Salary before raise: " + emp1.getSalary());
        System.out.println("Annual salary before raise: " + emp1.getAnnualSalary());
        emp1.raiseSalary(5);
        System.out.println("Salary after 5% raise: " + emp1.getSalary());
        System.out.println("Annual salary after raise: " + emp1.getAnnualSalary());
        System.out.println(emp1.toString());
    }
}