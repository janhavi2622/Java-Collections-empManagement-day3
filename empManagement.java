package day3;
import java.util.*;

public class empManagement {  
    static class Employee {
        int id;
        String name;
        String role;
        double salary;

        Employee(int id, String name, String role, double salary) {
            this.id = id;
            this.name = name;
            this.role = role;
            this.salary = salary;
        }

        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Role: " + role + ", Salary: ₹" + salary;
        }
    }

    static ArrayList<Employee> employeeList = new ArrayList<>();
    static HashSet<Integer> employeeIDs = new HashSet<>();
    static HashMap<Integer, Employee> employeeMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. Delete Employee by ID");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: searchEmployee(); break;
                case 3: deleteEmployee(); break;
                case 4: displayAll(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid option.");
            }
        }
    }

    static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        if (employeeIDs.contains(id)) {
            System.out.println("Employee ID already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, role, salary);
        employeeList.add(emp);
        employeeIDs.add(id);
        employeeMap.put(id, emp);

        System.out.println("Employee added successfully.");
    }

    static void searchEmployee() {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("Employee Found: " + employeeMap.get(id));
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        if (employeeMap.containsKey(id)) {
            Employee emp = employeeMap.remove(id);
            employeeIDs.remove(id);
            employeeList.remove(emp);
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    static void displayAll() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("All Employees:");
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }
}

