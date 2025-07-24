package com.todo.todo_App;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepositry extends JpaRepository<ToDo, Long> {

}
