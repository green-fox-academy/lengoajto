package com.greenfoxacademy.listingtodo.repository;

import com.greenfoxacademy.listingtodo.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository <Todo, Long> {

}
