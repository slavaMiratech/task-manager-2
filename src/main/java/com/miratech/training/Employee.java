package com.miratech.training;

import java.util.Date;
import java.util.List;

public interface Employee {
    long getId();
    List<Task> getUserTask();

    boolean isEmployeeActive();

    void addTaskToUser(Task task);
    void addUserTasks(List<Task> userTask);

    void deleteTaskFromUser(Task task);

    Task getCurrentTask();
    List<Task> getTasksList();

    boolean startTaskProgress(int taskId);
    boolean completeTask(int taskId);
    boolean openTask(int taskId);

    void addTaskToEmployee(Employee emp, Task task);

    void reportTime(Task taskId, Date time);

    TaskReport getWorkingTimeByTask(Date startDate, Date endDate, int taskId);
    TaskReport getWorkingTime(Date startDate, Date endDate);

}