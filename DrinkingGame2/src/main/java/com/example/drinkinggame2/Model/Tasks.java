package com.example.drinkinggame2.Model;

import java.util.ArrayList;

public class Tasks {
    private String name;
    private ArrayList<Tasks> taskList = new ArrayList<>();

    public Tasks(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tasks> getTaskList() {
        return taskList;
    }

    public void setTaskList(ArrayList<Tasks> taskList) {
        this.taskList = taskList;
    }
}
