package com.todo.todo_App;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private boolean completed;

    //constructor created
    public ToDo(){
    }

    public ToDo(String title){
        this.title = title;
    }

    public ToDo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;

    }

    //getters

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }


}
