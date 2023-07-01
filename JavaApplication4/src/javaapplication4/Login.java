/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner; 
public class Account;
public class Login;
public class EasyKanban; 
{ private String username; private String password; private String firstName; private String lastName; public Account(String username, String password, String firstName, String lastName) 
{ this.username = username; 
this.password = password;
 this.firstName = firstName; 
this.lastName = lastName; }

 public String getUsername() { return username; } 

public void setUsername(String username)
 
{ this.username = username; } 

public String getPassword() { return password; } 


public void setPassword(String password) 
{ this.password = password; } 

public String getFirstName() { return firstName; } 

public void setFirstName(String firstName) { this.firstName = firstName; } 

public String getLastName() { return lastName; }
 
public void setLastName(String lastName) { this.lastName = lastName; } 

public static void main(String[] args) 

{ Scanner scanner = new Scanner(System.in); 

System.out.println("Enter username: "); 

String username = scanner.nextLine(); 

System.out.println("Enter password: "); 
String password = scanner.nextLine(); 

System.out.println("Enter first name: "); 
String firstName = scanner.nextLine(); 

System.out.println("Enter last name: "); 
String lastName = scanner.nextLine(); 

Account account = new Account(username, password, firstName, lastName); System.out.println("Username: " + account.getUsername()); 
System.out.println("Password: " + account.getPassword());
 System.out.println("First Name: " + account.getFirstName()); 
System.out.println("Last Name: " + account.getLastName()); }


{ Scanner input = new Scanner(System.in); 
System.out.print("Enter username: "); 
String username = input.nextLine(); 
System.out.print("Enter password: "); 
String password = input.nextLine(); 
if (username.equals("admin") && password.equals("password")) 
{ System.out.println("Welcome admin, it is great to see you again."); 
System.out.println("Please enter your first name: "); String firstName = input.nextLine(); System.out.println("Please enter your last name: "); String lastName = input.nextLine(); System.out.println("Your full name is " + firstName + " " + lastName); } else { System.out.println("Username or password incorrect, please try again."); } } 
}



public class Login {
    public static boolean checkUserName(String username) {
        // Check if the username contains an underscore and is no more than 10 characters long
        if (username.contains("_") && username.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkPasswordComplexity(String password) {
        // Check if the password meets the following password complexity rules:
        // - At least eight characters long
        // - Contains a capital letter
        // - Contains a number
        // - Contains a special character
        // (You can add more rules if you want)
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*[^a-zA-Z0-9].*")) {
            return true;
        } else {
            return false;
        }
    }
    public static String registerUser(String username, String password) {
        // Register the user and return the appropriate message
        if (!checkUserName(username)) {
            return "Invalid username format";
        } else if (!checkPasswordComplexity(password)) {
            return "Password does not meet complexity requirements";
        } else {
            // Save the user to the database
            // ...
            return "User registered successfully";
        }
    }
    public static boolean loginUser(String username, String password) {
        // Check if the login details match the stored details
        // ...
        if (username.equals("myusername") && password.equals("mypassword")) {
            return true;
        } else {
            return false;
        }
    }
    public static String returnLoginStatus(boolean loginStatus) {
        // Return the appropriate message based on the login status
        if (loginStatus) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }
}
{ public static void main(String[] args { Scanner input = new Scanner(System.in); 
System.out.println("Welcome to EasyKanban!"); int choice = 0; while (choice != 3) 
{ System.out.println("Choose an option:"); 
    System.out.println("1. Add task"); 
    System.out.println("2. Show report"); 
    System.out.println("3. Quit"); 
    choice = input.nextInt(); switch (choice)}
{ case 1: System.out.println("Enter task name:"); String taskName = input.nextLine();
 System.out.println("Enter task description:"); String taskDescription = input.nextLine(); 
System.out.println("Enter developer name:"); String developerName = input.nextLine(); 
System.out.println("Enter task duration:"); int taskDuration = input.nextInt(); 
System.out.println("Enter task status:"); String taskStatus = input.nextLine(); 
System.out.println("Task successfully captured!"); 
break; case 2: System.out.println("Coming soon!"); 
break; case 3: System.out.println("Exiting..."); break; default: System.out.println("Invalid option!"); } 
} 
}
 }

import javax.swing.JOptionPane; 
public class TaskManagement { public static void main(String[] args) 
{ String taskStatus; String developerDetails; int taskNumber; String taskName; String taskDescription; String taskID; int duration; 
int totalHours = 0; 
do { taskStatus = JOptionPane.showInputDialog("Enter task status (to be completed, in progress, completed):");
 developerDetails = JOptionPane.showInputDialog("Enter developer details:");
 taskNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter task number:")); taskName = JOptionPane.showInputDialog("Enter task name:"); 
taskDescription = JOptionPane.showInputDialog("Enter task description:"); 
taskID = createTaskID(taskName, taskNumber); 
duration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration:")); 
if (checkTaskDescription(taskDescription)) { JOptionPane.showMessageDialog(null, printTaskDetails(taskStatus, developerDetails, taskNumber, taskName, taskDescription, taskID, duration)); 
totalHours += duration; } 
else { JOptionPane.showMessageDialog(null, "Task description cannot exceed 50 characters."); } }
 while (JOptionPane.showConfirmDialog(null, "Enter another task?", "Task Management", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION); JOptionPane.showMessageDialog(null, "Total hours: " + totalHours); } 
public static boolean checkTaskDescription(String taskDescription) 
{ return taskDescription.length() <= 50; } 
public static String createTaskID(String taskName, int taskNumber) { return taskName.substring(0, 2) + taskNumber; }
 public static String printTaskDetails(String taskStatus, String developerDetails, int taskNumber, String taskName, String taskDescription, String taskID, int duration)
 { return "Task Status: " + taskStatus + "\nDeveloper Details: " + developerDetails + "\nTask Number: " + taskNumber + "\nTask Name: " + taskName + "\nTask Description: " + taskDescription + "\nTask ID: " + taskID + "\nDuration: " + duration; }

import java.util.Scanner;
public class TaskManager {
    private static final String[] DEVELOPERS = {"John", "Jane", "Jack"};
    private static final String[] TASK_NAMES = {"Task 1", "Task 2", "Task 3"};
    private static final int[] TASK_IDS = {1, 2, 3};
    private static final int[] TASK_DURATIONS = {10, 20, 30};
    private static final String[] TASK_STATUSES = {"Done", "In Progress", "Not Started"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Display the Developer, Task Names and Task Duration for all tasks with the status of done.
        System.out.println("Developer\tTask Name\tTask Duration");
        for (int i = 0; i < TASK_NAMES.length; i++) {
            if (TASK_STATUSES[i].equals("Done")) {
                System.out.println(DEVELOPERS[i] + "\t" + TASK_NAMES[i] + "\t" + TASK_DURATIONS[i]);
            }
        }
        // Display the Developer and Duration of the class with the longest duration.
        int longestDuration = 0;
        int longestDurationIndex = 0;
        for (int i = 0; i < TASK_DURATIONS.length; i++) {
            if (TASK_DURATIONS[i] > longestDuration) {
                longestDuration = TASK_DURATIONS[i];
                longestDurationIndex = i;
            }
        }
        System.out.println("The developer of the class with the longest duration is " + DEVELOPERS[longestDurationIndex] + " and the duration is " + TASK_DURATIONS[longestDurationIndex]);
        // Search for a task with a Task Name and display the Task Name, Developer and Task Status.
        System.out.println("Enter the task name to search for:");
        String taskName = scanner.nextLine();
        for (int i = 0; i < TASK_NAMES.length; i++) {
            if (TASK_NAMES[i].equals(taskName)) {
                System.out.println(DEVELOPERS[i] + "\t" + TASK_NAMES[i] + "\t" + TASK_STATUSES[i]);
            }
        }
        // Search for all tasks assigned to a developer and display the Task Name and Task Status.
        System.out.println("Enter the developer name to search for:");
        String developerName = scanner.nextLine();
        for (int i = 0; i < TASK_NAMES.length; i++) {
            if (DEVELOPERS[i].equals(developerName)) {
                System.out.println(TASK_NAMES[i] + "\t" + TASK_STATUSES[i]);
            }
        }
        // Delete a task using the Task Name.
        System.out.println("Enter the task name to delete:");
        String taskNameToDelete = scanner.nextLine();
        for (int i = 0; i < TASK_NAMES.length; i++) {
            if (TASK_NAMES[i].equals(taskNameToDelete)) {
                TASK_NAMES[i] = null;
                TASK_STATUSES[i] = null;
            }
        }
        // Display a report that lists the full details of all captured tasks.
        System.out.println("Developer\tTask Name\tTask Duration\tTask Status");
        for (int i = 0; i < TASK_NAMES.length; i++) {
            if (TASK_NAMES[i] != null) {
                System.out.println(DEVELOPERS[i] + "\t" + TASK_NAMES[i] + "\t" + TASK_DURATIONS[i] + "\t" + TASK_STATUSES[i]);
            }
        }
    }
}

    
}
