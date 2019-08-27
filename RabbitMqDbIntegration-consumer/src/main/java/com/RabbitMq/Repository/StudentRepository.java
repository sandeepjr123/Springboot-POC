package com.RabbitMq.Repository;

import org.springframework.data.repository.CrudRepository;

import com.RabbitMq.Model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
