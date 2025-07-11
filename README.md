```
# 👔 Employee Management System (Java)

A simple console-based **Employee Management System** built using core Java **Collections** like `ArrayList`, `HashMap`, and `HashSet`.

This mini app allows users to manage employees by performing operations such as **add**, **search**, **delete**, and **display** employee records.

## ✅ Features

- 📥 Add a new employee (ID, name, role, salary)
- 🔍 Search an employee by their ID
- ❌ Delete an employee by ID
- 📃 Display all employee records
- 🔒 Ensures unique Employee IDs using `HashSet`
- 🚀 Fast search & delete using `HashMap`

## 🧱 Technologies Used

- Java (JDK 8+)
- Collections: `ArrayList`, `HashSet`, `HashMap`
- `Scanner` for user input

## 🧑‍💻 How to Run

1. Clone or download this repo
2. Open a terminal in the project folder
3. Compile and run:
```
javac EmployeeManagementSystem.java
java EmployeeManagementSystem
```
## 📸 Sample Output

```
--- Employee Management System ---
1. Add Employee
2. Search Employee by ID
3. Delete Employee by ID
4. Display All Employees
5. Exit
Choose option: 1
Enter Employee ID: 101
Enter Name: Priya Sharma
Enter Role: Software Engineer
Enter Salary: 70000
Employee added successfully.

--- Employee Management System ---
Choose option: 1
Enter Employee ID: 102
Enter Name: Ravi Verma
Enter Role: HR Manager
Enter Salary: 85000
Employee added successfully.

--- Employee Management System ---
Choose option: 4
All Employees:
ID: 101, Name: Priya Sharma, Role: Software Engineer, Salary: ₹70000.0
ID: 102, Name: Ravi Verma, Role: HR Manager, Salary: ₹85000.0

--- Employee Management System ---
Choose option: 2
Enter Employee ID to search: 101
Employee Found: ID: 101, Name: Priya Sharma, Role: Software Engineer, Salary: ₹70000.0

--- Employee Management System ---
Choose option: 3
Enter Employee ID to delete: 101
Employee deleted.

--- Employee Management System ---
Choose option: 4
All Employees:
ID: 102, Name: Ravi Verma, Role: HR Manager, Salary: ₹85000.0
```
