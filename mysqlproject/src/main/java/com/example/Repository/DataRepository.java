package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.DataEntity;

@Repository
public interface DataRepository extends CrudRepository<DataEntity, Long> {
	@Query(value = "select * from student s where s.age =?1 and s.name = ?2", nativeQuery = true)
	List<DataEntity> findAllStudents(Integer age, String myName);

//	@Query(value = "select * from student s where s.class_name  = ?1")
//	List<DataEntity> findAllStudents(Integer className);
}
