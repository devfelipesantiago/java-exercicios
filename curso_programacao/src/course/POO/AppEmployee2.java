package course.POO;

import course.entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppEmployee2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee2> employee = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int register = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < register; i++) {
            System.out.println();
            System.out.println("Employee #"+ (i+1) +": ");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employee.add(new Employee2(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        sc.nextLine();

        Employee2 emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee2 result : employee) {
            System.out.println(result);
        }

        sc.close();
    }
}
