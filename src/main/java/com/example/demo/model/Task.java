package com.example.demo.model;

import java.time.LocalDate;

public class Task {
    private int id;
    private String content;
    private LocalDate deadline;

    //true - task has done, otherwise - false
    private boolean status;
    private int category_id;

    public Task(int id, String content, LocalDate deadline, boolean status, int category_id) {
        this.id = id;
        this.content = content;
        this.deadline = deadline;
        this.status = status;
        this.category_id = category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }
}
