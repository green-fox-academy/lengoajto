package com.greenfoxacademy.listingtodo.repository;

import com.greenfoxacademy.listingtodo.model.Asignee;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryInterface extends CrudRepository<Asignee, Long> {

}
