package com.putul.springboot.web.service;

import com.putul.springboot.web.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;

    static {
        todos.add(new Todo(1, "putul", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "putul", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "putul", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
        List<Todo> filteredTodos = new ArrayList<>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }

    public void addTodo(String name, String course, Date targetDate,
                        boolean isDone) {
        todos.add(new Todo(++todoCount, name, course, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<Todo> iterator = todos.iterator();
        while (iterator.hasNext()) {
            Todo todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
    }

    public void updateTodo(Todo todo) {
        todos.remove(todo);
        todos.add(todo);
    }

    public Todo retrieveTodo(int id) {
        for(Todo todo : todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
