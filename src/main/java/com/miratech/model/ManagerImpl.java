/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miratech.model;

import com.miratech.training.Employee;
import com.miratech.training.Manager;
import com.miratech.training.Task;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eklyagin
 */
public class ManagerImpl implements Manager{
    private Employee employee;
    private ArrayList employeesList;

//    @Override
//    public void addEmployee(String userNick) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void addEmployeeToList (Employee employee, ArrayList employeesList){
        this.employee = employee;
        this.employeesList = employeesList;
        employeesList.add(employee);
    };

    @Override
    public void disableEmployee(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void assigneTask(Task task, Employee employee) {
        employee.addTaskToUser(task);
    }

    @Override
    public List<Task> getTaskListOfEmployee(Employee employee) {
        List<Task> list = employee.getTasksList();
        return list;
    }

    @Override
    public List<Employee> getEmployeeOfTask(Task task) {
        List<Employee> employee = (List<Employee>)task.getReporter();
        return employee;
    }

}
