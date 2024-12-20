package java8.Interview;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;

    public Employee(int id, String name, int age, long salary, String gender,
                    String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Amritesh", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Shashank", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Rohit", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Prince", 32, 125, "F", "Marketing", "Chennai", 2013));

        empList.add(new Employee(5, "Khushi", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Dipti", 24, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Aman", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Karan", 23, 145, "M", "Banking", "Trivandam", 2015));
        empList.add(new Employee(9, "Gaurav", 25, 160, "M", "Gov", "Blore", 2010));

        //1. Group the Employees by city.
        Map<String,List<Employee>> empByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("Employee by city :: \n"+empByCity);

        //2.Group the Employees by age.
        Map<Integer,List<Employee>> empByAge = empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Employee by age :: \n"+empByAge);

        //3. Find the count of male and female employees present in the organization.
        Map<String,Long> noOfMaleAndFemaleEmployees = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("Count of male and female employees present in the organization:: \n" + noOfMaleAndFemaleEmployees);

        //4.Print the names of all departments in the organization.
        System.out.println("Names of all departments in the organization ");
        empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

        //5. Print employee details whose age is greater than 28.
        System.out.println("Employee details whose age is greater than 28");
        empList.stream().filter(e->e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);

//        //6.Print Average age of Male and Female Employees.
        Map<String, Double> avgAge = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("Average age of Male and Female Employees:: " + avgAge);

        //7.Print the number of employees in each department.
        Map<String,Long> countByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println("No of employees in each department");
        for(Map.Entry<String,Long> entry : countByDept.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //7.1 department name with employee
        Map<String, List<Employee>> countByDept1 = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
        countByDept1.forEach((deptName,employeeList)->{
            System.out.println("Department: " +deptName);
            employeeList.forEach(System.out::println);
        });

        //8.Find oldest employee.
        Optional<Employee> oldestEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmp.get();
        System.out.println("Oldest employee details:: \n" + oldestEmployee);

        //9. Find youngest female employee.
        Optional<Employee> youngestEmp = empList.stream().filter(e->e.getGender() == "F").min(Comparator.comparingInt(Employee::getAge));
        Employee youngestEmployee = youngestEmp.get();
        System.out.println("Youngest female employee details:: \n" + youngestEmployee);

        //10.

    }
}