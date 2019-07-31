package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Employee;

public interface ServiceRepository extends CrudRepository<Employee, String> {

}
