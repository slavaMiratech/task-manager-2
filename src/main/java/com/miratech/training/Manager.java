package com.miratech.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsytnyk on 17.12.2015.
 */
public interface Manager {
    ArrayList employeesList = new ArrayList();
    public void addEmployeeToList (Employee employee, ArrayList employeesList);
    void disableEmployee (Employee employee);
    void assigneTask (Task task, Employee employee);
    List<Task> getTaskListOfEmployee (Employee employee);
    List<Employee> getEmployeeOfTask (Task task);
    //
}
