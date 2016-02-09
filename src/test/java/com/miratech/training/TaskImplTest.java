package com.miratech.training;

import org.fest.assertions.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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

    Task task = new TaskImpl(id, summary, description, priority, effort, endDate);


    @Test
    public void testGetTaskID(String id) throws Exception {
        Assert.assertTrue("Task ID should be "+id+" but is "+task.getTaskID(), task.getTaskID().equals(id));
    }

    @Test
    public void testGetStatus() throws Exception {
        Assert.assertTrue("Task Status should be 'New' but is "+task.getStatus(), task.getStatus().equals(Status.NEW));
    }

    @Test
    public void testSetStatus() throws Exception {
        task.setStatus(Status.IN_PROGRESS);
        Assert.assertTrue("Task Status should be 'In Progress' but is "+task.getStatus(), task.getStatus().equals(Status.IN_PROGRESS));
        task.setStatus(Status.CLOSED);
        Assert.assertTrue("Task Status should be 'Closed' but is "+task.getStatus(), task.getStatus().equals(Status.CLOSED));
        task.setStatus(Status.NEW);
        Assert.assertTrue("Task Status should be 'New' but is "+task.getStatus(), task.getStatus().equals(Status.NEW));
    }

    @Test
    public void testGetAssignee() throws Exception {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new EmployeeImpl(1000));
        employeeList.add(new EmployeeImpl(2000));
        employeeList.add(new EmployeeImpl(3000));

        task.setAssignee(employeeList.get(0));
        task.setAssignee(employeeList.get(1));
        task.setAssignee(employeeList.get(2));
        Assertions.assertThat(task.getAssignee()).isEqualTo(employeeList);
    }

    @Test
    public void testSetAssignee() throws Exception {

    }

    @Test
    public void testRemoveAssignee() throws Exception {

    }

    @Test
    public void testGetPriority() throws Exception {

    }

    @Test
    public void testSetPriority() throws Exception {

    }

    @Test
    public void testGetDescription() throws Exception {

    }

    @Test
    public void testSetDescription() throws Exception {

    }

    @Test
    public void testGetSummary() throws Exception {

    }

    @Test
    public void testSetSummary() throws Exception {

    }

    @Test
    public void testGetEndDate() throws Exception {

    }

    @Test
    public void testSetEndDate() throws Exception {

    }

    @Test
    public void testAddProgress() throws Exception {

    }

    @Test
    public void testGetProgress() throws Exception {

    }

    @Test
    public void testMaintainStatus() throws Exception {

    }
}