/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package javaapplication4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TaskTest {
@Test
public void testTaskDescription() {
Task task = new Task("This is a task description", 10);
assertEquals("This is a task description", task.getDescription());
}
@Test
public void testTaskID() {
Task task = new Task("This is a task description", 10);
assertEquals("AD:1:BYN", task.getTaskID());
}
@Test
public void testTotalHours() {
Task task1 = new Task("This is a task description", 10);
Task task2 = new Task("This is another task description", 12);
assertEquals(18, Task.getTotalHours(task1, task2));
}
@Test
public void testMultipleTasks() {
Task[] tasks = new Task[5];
tasks[0] = new Task("This is a task description", 10);
tasks[1] = new Task("This is another task description", 12);
tasks[2] = new Task("This is a third task description", 55);
tasks[3] = new Task("This is a fourth task description", 11);
tasks[4] = new Task("This is a fifth task description", 1);
assertEquals(89, Task.getTotalHours(tasks));
}
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TaskManagerTest {
    @Test
    public void testDeveloperArrayIsCorrectlyPopulated() {
        String[] expectedDevelopers = {"Mike Smith", "Edward Harrington", "Samantha Paulson", "Glenda Oberholzer"};
        String[] actualDevelopers = TaskManager.DEVELOPERS;
        assertArrayEquals(expectedDevelopers, actualDevelopers);
    }
    @Test
    public void testDisplayDeveloperAndDurationForTaskWithLongestDuration() {
        String expectedDeveloper = "Glenda Oberholzer";
        int expectedDuration = 11;
        String actualDeveloper = TaskManager.getDeveloperOfTaskWithLongestDuration();
        int actualDuration = TaskManager.getDurationOfTaskWithLongestDuration();
        assertEquals(expectedDeveloper, actualDeveloper);
        assertEquals(expectedDuration, actualDuration);
    }
    @Test
    public void testSearchForTasks() {
        String expectedTaskName = "Create Login";
        String expectedDeveloper = "Mike Smith";
        String actualTaskName = TaskManager.searchForTask("Create Login");
        String actualDeveloper = TaskManager.getDeveloperOfTask(actualTaskName);
        assertEquals(expectedTaskName, actualTaskName);
        assertEquals(expectedDeveloper, actualDeveloper);
    }
    @Test
    public void testSearchAllTasksAssignedToDeveloper() {
        String expectedTaskName = "Create Reports";
        String actualTaskName = TaskManager.searchForTasksAssignedToDeveloper("Samantha Paulson");
        assertEquals(expectedTaskName, actualTaskName);
    }
    @Test
    public void testDeleteTaskFromArray() {
        String expectedTaskName = "Create Reports";
        TaskManager.deleteTask(expectedTaskName);
        assertFalse(TaskManager.containsTask(expectedTaskName));
    }
    @Test
    public void testDisplayReport() {
        String expectedReport = "Developer\tTask Name\tTask Duration\tTask Status\n" +
                "Mike Smith\tCreate Login\t10\tDone\n" +
                "Edward Harrington\tCreate User\t20\tIn Progress\n" +
                "Samantha Paulson\tCreate Reports\t30\tNot Started";
        String actualReport = TaskManager.displayReport();
        assertEquals(expectedReport, actualReport);
    }
}
