package org.Student.StudentDao;

import org.Student.Entity.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentModel, Integer>{

}
