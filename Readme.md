# 📚 Student Attendance Management System

> **A Java Console-Based Application for Recording and Monitoring Student Attendance**

<p align="center">

![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge\&logo=openjdk\&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue?style=for-the-badge)
![Console Application](https://img.shields.io/badge/Application-Console-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

</p>

---

# 📖 Overview

The **Student Attendance Management System** is a **Java console-based application** developed to simplify classroom attendance management.

The system allows teachers to record attendance for multiple students over multiple working days, maintain attendance records, calculate attendance percentages, and automatically identify students with attendance shortages.

The project demonstrates the use of **Java fundamentals**, including arrays, loops, conditional statements, user input handling, and menu-driven programming.

---

# ✨ Features

* 👨‍🎓 Add student details
* 📝 Mark attendance for multiple working days
* 📋 View complete attendance records
* 📊 Calculate attendance percentage
* ⚠️ Identify students with attendance below 75%
* ✅ Prevent duplicate attendance marking for the same day
* 📅 Support for multiple students and multiple days
* 🖥️ Interactive menu-driven interface

---

# 🛠 Tech Stack

* Java
* Object-Oriented Programming (OOP)
* Java Scanner Class
* Arrays
* Console-Based Interface

---

# 🚀 Functionalities

## 1️⃣ Student Registration

The system stores:

* Roll Number
* Student Name

for every student in the class.

---

## 2️⃣ Attendance Recording

Teachers can:

* Select a working day
* Mark each student as:

  * **Present (1)**
  * **Absent (0)**

The system prevents attendance from being marked more than once for the same day.

---

## 3️⃣ Attendance Records

Displays attendance status for every student across all working days.

Example:

```
Roll No: 101
Name: Mohit

Day 1 : Present
Day 2 : Absent
Day 3 : Present
```

If attendance has not yet been recorded for a day, the system displays:

```
Not Marked
```

---

## 4️⃣ Attendance Percentage

The application automatically calculates:

```
Attendance Percentage =
(Present Days / Total Marked Days) × 100
```

Students with attendance below **75%** are flagged as:

```
**SHORTAGE**
```

---

# 🧠 Concepts Used

This project demonstrates:

* Arrays
* Two-Dimensional Arrays
* Loops
* Conditional Statements
* User Input
* Menu-Driven Programming
* Java Scanner
* Percentage Calculation
* Basic Data Management

---

# 📂 Project Structure

```
Java-Mini-Project/

│── AttendanceSystem.java
│── README.md
│── Output.pdf
```

---

# ▶️ How to Run

## Clone the Repository

```bash
git clone https://github.com/mohit2814v/Java-Mini-Project.git
```

---

## Navigate to the Project Folder

```bash
cd Java-Mini-Project
```

---

## Compile

```bash
javac AttendanceSystem.java
```

---

## Run

```bash
java AttendanceSystem
```

---

# 💻 Sample Workflow

```
Enter Total Days

↓

Enter Number of Students

↓

Enter Student Details

↓

Main Menu

1. Mark Attendance

2. View Attendance

3. Attendance Percentage

4. Exit
```

---

# 📷 Output

The repository includes an **Output.pdf** file containing sample execution of the application.

You can also add screenshots here:

```
screenshots/

attendance-menu.png

attendance-report.png

percentage-report.png
```

---

# 🎯 Learning Outcomes

This project helped strengthen understanding of:

* Java Programming
* Console Application Development
* Data Storage using Arrays
* Multi-dimensional Arrays
* Menu-driven Programs
* Input Validation
* Attendance Calculation Logic
* Problem Solving
* Basic Software Design

---

# 🔮 Future Improvements

Possible future enhancements include:

* GUI using Java Swing or JavaFX
* Database integration (MySQL/PostgreSQL)
* Student Login System
* Teacher Authentication
* Attendance Reports in PDF
* Excel Export
* Search Student by Roll Number
* Update/Delete Student Records
* Monthly Attendance Reports
* Cloud-Based Attendance System

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a feature branch.

```bash
git checkout -b feature-name
```

3. Commit your changes.

```bash
git commit -m "Added new feature"
```

4. Push your changes.

```bash
git push origin feature-name
```

5. Open a Pull Request.

---

# 👨‍💻 Author

**Mohit Gupta**

**GitHub**

https://github.com/mohit2814v

**LinkedIn**

https://www.linkedin.com/in/mohit-gupta-2814v/

---

# ⭐ Support

If you found this project helpful, consider giving it a **⭐ Star** on GitHub.

It helps others discover the project and encourages future development.

---

# 📄 License

This project is licensed under the **MIT License**.

---

<p align="center">

### 📚 "Good software solves problems. Great software makes everyday tasks simpler."

**Built with ❤️ using Java**

</p>
