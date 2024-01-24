import java.util.*;

public class lab2 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Populate the employee list
        employeeList.add(new Employee("161E90", "Ramu", 35, 59000));
        employeeList.add(new Employee("171E22", "Tejas", 30, 82100));
        employeeList.add(new Employee("171G55", "Abhi", 25, 100000));
        employeeList.add(new Employee("152K46", "Jaya", 32, 85000));

        // Prompt user to choose sorting parameter
        System.out.println("Choose Sorting Parameter:");
        System.out.println("1. Age\n2. Name\n3. Salary");
        int choice = scanner.nextInt();

        // Sort the employee list based on user's choice
        switch (choice) {
            case 1:
                Collections.sort(employeeList, Comparator.comparingInt(Employee::getAge));
                break;
            case 2:
                Collections.sort(employeeList, Comparator.comparing(Employee::getName));
                break;
            case 3:
                Collections.sort(employeeList, Comparator.comparingDouble(Employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
                return;
        }

        // Display the sorted employee data
        System.out.println("\nSorted Employee Data:");
        System.out.printf("%-10s%-10s%-5s%-10s%n", "Emp ID", "Name", "Age", "Salary");
        System.out.println("----------------------------");
        for (Employee employee : employeeList) {
            employee.displayDetails();
        }

        scanner.close();
    }

}

class Employee {
    private String employeeID;
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String employeeID, String name, int age, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void displayDetails() {
        System.out.printf("%-10s%-10s%-5d%-10.2f%n", employeeID, name, age, salary);
    }
}


