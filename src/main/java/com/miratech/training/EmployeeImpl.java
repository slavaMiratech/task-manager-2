package com.miratech.training;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeImpl implements Employee {
    private long id;
    private boolean isActive;

    //TODO sorted by priority
    private List<Task> userTask;

    public EmployeeImpl(long id) {
        this.id = id;
    }

    public EmployeeImpl(long id, List<Task> userTask) {
        this.id = id;
        this.userTask = userTask;
    }

    public long getId() {
        return id;
    }

    public List<Task> getUserTask() {
        return userTask;
    }

    public void addUserTasks(List<Task> userTask) {
        this.userTask = userTask;
    }

    public void addTaskToUser(Task task) {
        userTask.add(task);
    }

    public void deleteTaskFromUser(Task task) {
        Iterator<Task> it = userTask.iterator();
        while (it.hasNext()) {
            Task next = it.next();
            if (next.equals(task))
                it.remove();
        }
    }

    @Override
    public boolean isEmployeeActive() {
        return isActive;
    }

    @Override
    public Task getCurrentTask() {
        //TODO
//        for (Task t: userTask) {
//   ****         if status in progress, not corrent :)
//            if ("in_progress".equals(t.getStatus()))
//                return t;
//        }
        return null;
    }

    @Override
    public List<Task> getTasksList() {
        return userTask;
    }


    @Override
    public boolean startTaskProgress(int taskId) {
        //TODO
//        for(Task t: userTask) {
//            if (t.getTaskID().equals(taskId)) {
//                t.setStatus("in_progress");
//                    isActive = false;
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public boolean completeTask(int taskNumber) {
        //TODO !!!
//        for(Task t: userTask) {
//            if (t.getTaskID().equals(taskId)) {
//                t.setStatus("complite");
//        isActive = true;
//                return true;
//            }
//        }
        return false;
    }

    @Override
    public boolean openTask(int taskId) {
//        for(Task t: userTask) {
//            if (t.getTaskID().equals(taskId)) {
//                t.setStatus("open");
//                isActive = true;
//                return true;
//            }
//        }
        return false;
    }


    @Override
    public void addTaskToEmployee(Employee emp, Task task) {
        emp.addTaskToUser(task);
    }

    @Override
    public void reportTime(Task taskId, Date time) {
        //TODO :)
        taskId.setEndDate(time);
    }

    @Override
    public TaskReport getWorkingTimeByTask(Date startDate, Date endDate, int taskId) {
        return null;
    }

    @Override
    public TaskReport getWorkingTime(Date startDate, Date endDate) {
        return null;
    }
}
