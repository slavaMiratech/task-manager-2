package com.miratech.training;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 09.02.2016.
 */
public class TaskImplTest {
    String id = "001_br";
    String summary = "Test Summary";
    String description = "Test Description";
    Priority priority = Priority.MAJOR;
    Integer effort = 10;
    Date endDate = Date.valueOf("2016-02-15");

    @Test
    public void testGetTaskID() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue("Task ID should be "+id+" but is "+task.getTaskID(), task.getTaskID().equals(id));
    }

    @Test
    public void testGetStatus() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue("Task Status should be 'New' but is "+task.getStatus(), task.getStatus().equals(Status.NEW));
    }

    @Test
    public void testSetStatus() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.setStatus(Status.IN_PROGRESS);
        Assert.assertTrue("Task Status should be 'In Progress' but is "+task.getStatus(), task.getStatus().equals(Status.IN_PROGRESS));
        task.setStatus(Status.CLOSED);
        Assert.assertTrue("Task Status should be 'Closed' but is "+task.getStatus(), task.getStatus().equals(Status.CLOSED));
        task.setStatus(Status.NEW);
        Assert.assertTrue("Task Status should be 'New' but is "+task.getStatus(), task.getStatus().equals(Status.NEW));
    }

    @Test
    public void testGetAssignee() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new EmployeeImpl(1000));
        employeeList.add(new EmployeeImpl(2000));
        employeeList.add(new EmployeeImpl(3000));

        task.setAssignee(employeeList.get(0));
        task.setAssignee(employeeList.get(1));
        task.setAssignee(employeeList.get(2));
        Assert.assertTrue(task.getAssignee().equals(employeeList));
    }

    @Test
    public void testSetAssignee() throws Exception {

    }

    @Test
    public void testRemoveAssignee() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new EmployeeImpl(1000));
        employeeList.add(new EmployeeImpl(2000));
        employeeList.add(new EmployeeImpl(3000));

        task.setAssignee(employeeList.get(0));
        task.setAssignee(employeeList.get(1));
        task.setAssignee(employeeList.get(2));

        task.removeAssignee(employeeList.get(1));
        Assert.assertFalse(task.getAssignee().contains(employeeList.get(1)));
    }

    @Test
    public void testGetPriority() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue(task.getPriority().equals(priority));
    }

    @Test
    public void testSetPriority() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.setPriority(Priority.CRITICAL);
        Assert.assertTrue(task.getPriority().equals(Priority.CRITICAL));
    }

    @Test
    public void testGetDescription() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue(task.getDescription().equals(description));
    }

    @Test
    public void testSetDescription() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.setDescription(description+"upd");
        Assert.assertTrue(task.getDescription().equals(description+"upd"));
    }

    @Test
    public void testGetSummary() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue(task.getSummary().equals(summary));
    }

    @Test
    public void testSetSummary() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.setSummary(summary+"upd");
        Assert.assertTrue(task.getSummary().equals(summary+"upd"));
    }

    @Test
    public void testGetEndDate() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        Assert.assertTrue(task.getEndDate().equals(endDate));
    }

    @Test
    public void testSetEndDate() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.setEndDate(Date.valueOf("2016-03-20"));
        Assert.assertTrue(task.getEndDate().equals(Date.valueOf("2016-03-20")));
    }

    @Test
    public void testAddProgress() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.addProgress(3);
        Assert.assertTrue(task.getProgress().equals(3));
        Assert.assertTrue(task.getStatus().equals(Status.IN_PROGRESS));
        task.addProgress(7);
        Assert.assertTrue(task.getProgress().equals(10));
        Assert.assertTrue(task.getStatus().equals(Status.CLOSED));
    }

    @Test
    public void testGetProgress() throws Exception {
        Task task = new TaskImpl(id, summary, description, priority, effort, endDate);
        task.addProgress(3);
        Assert.assertTrue(task.getProgress().equals(3));
    }

    @Test
    public void testMaintainStatus() throws Exception {
        TaskImpl task = new TaskImpl(id, summary, description, priority, 0, endDate);
        task.maintainStatus();
        Assert.assertTrue(task.getStatus().equals(Status.CLOSED));
    }
}