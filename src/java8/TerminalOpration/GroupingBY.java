package java8.TerminalOpration;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBY {
    public static void main(String[] args) {

        List<Employee> Employees = Arrays.asList(
                new Employee(1,"Amritesh","IT",80000000),
                new Employee(1,"Diptee","MBA",50000),
                new Employee(1,"Shashank","IT",4508073),
                new Employee(1,"Akash","Medical",3052748),
                new Employee(1,"Vikram","PWD",49746),
                new Employee(1,"Rohit","PWD",60000)
        );
        Map<String,List<Employee>> EmployeeByDepartment =
                Employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        //Print
        EmployeeByDepartment.forEach((department, employeesList) -> {
            System.out.println("Department: " +department);
            employeesList.forEach(System.out::println);
        });
        Map<Boolean,List<Employee>> EmployeeBySalary =
                Employees.stream()
                        .collect(Collectors.partitioningBy(Employee->Employee.getSalary()>60000));

        System.out.println("Employee Salary > 60000");
        EmployeeBySalary.get(true).forEach(System.out::println);

        System.out.println("Employee Salary <= 60000");
        EmployeeBySalary.get(false).forEach(System.out::println);

    }
}
