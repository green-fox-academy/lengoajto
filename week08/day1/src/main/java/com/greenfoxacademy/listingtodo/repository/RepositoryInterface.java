package com.greenfoxacademy.listingtodo.repository;

import com.greenfoxacademy.listingtodo.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryInterface extends CrudRepository<ToDo, Long> {

}
