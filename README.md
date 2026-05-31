# Employee Management System

## Overview

Employee Management System is a desktop application developed using Java Swing and MySQL. The system provides an efficient way to manage employee records through a user-friendly graphical interface. It allows administrators to add, update, view, and remove employee information while maintaining data securely in a MySQL database.

---

## Features

### Authentication Module

* User Login
* User Signup
* Secure credential verification
* Database-based authentication

### Employee Management

* Add Employee Details
* View Employee Information
* Update Employee Records
* Remove Employee Records

### Employee Information

* Employee ID
* Name
* Father's Name
* Date of Birth
* Salary
* Address
* Phone Number
* Email Address
* Educational Qualification
* Designation
* Aadhaar Number

### User Interface

* Java Swing-based GUI
* Interactive forms
* Easy navigation
* User-friendly design

---

## Technologies Used

| Technology    | Purpose                  |
| ------------- | ------------------------ |
| Java          | Application Development  |
| Swing         | Graphical User Interface |
| MySQL         | Database Management      |
| JDBC          | Database Connectivity    |
| IntelliJ IDEA | Development Environment  |

---

## Project Structure

```text
src
│
├── employee
│   └── management
│       └── system
│           ├── Splash.java
│           ├── Login.java
│           ├── Signup.java
│           ├── Main_class.java
│           ├── AddEmployee.java
│           ├── UpdateEmployee.java
│           ├── RemoveEmployee.java
│           ├── View_Employee.java
│           └── conn.java
│
└── icons
    ├── front.gif
    ├── second.jpg
    ├── LoginB.jpg
    ├── delete.png
    ├── home.jpg
    ├── print.jpg
    └── rback.png
```

---

## Database Setup

### Create Database

```sql
CREATE DATABASE employeemanagementsystem;
```

### Use Database

```sql
USE employeemanagementsystem;
```

### Create Login Table

```sql
CREATE TABLE login(
    username VARCHAR(50),
    password VARCHAR(50)
);
```

### Create Employee Table

```sql
CREATE TABLE employee(
    name VARCHAR(50),
    fname VARCHAR(50),
    dob VARCHAR(30),
    salary VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(50),
    education VARCHAR(50),
    designation VARCHAR(50),
    aadhar VARCHAR(20),
    empID VARCHAR(20)
);
```

---

## JDBC Configuration

Update your database credentials inside `conn.java`:

```java
Connection connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/employeemanagementsystem",
    "root",
    "your_password"
);
```

---

## Required Libraries

Add the following libraries to your project:

### MySQL Connector

```text
mysql-connector-java
```

### JCalendar

```text
jcalendar
```

### RS2XML (Optional)

```text
rs2xml
```

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/Shubhamraj1909/Employee_Mangement_System.git
```

2. Open the project in IntelliJ IDEA.

3. Configure MySQL database.

4. Add required libraries.

5. Run:

```text
Splash.java
```

---

## Screens

* Splash Screen
* Login Page
* Signup Page
* Dashboard
* Add Employee
* Update Employee
* Remove Employee
* View Employee Details

---

## Future Enhancements

* Password Encryption
* Role-Based Access Control
* Employee Attendance Management
* Payroll Management
* Report Generation
* Email Notifications
* Cloud Database Integration

---

## Author

**Shubham Raj**

MCA Student
Central University of Karnataka

GitHub:
https://github.com/Shubhamraj1909

---

## License

This project is developed for educational and learning purposes.
