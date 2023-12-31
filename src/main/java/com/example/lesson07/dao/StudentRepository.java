package com.example.lesson07.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson07.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
	// 순수한 JPA
	
	// JPQL => Entity한테 요청한다.
	
	// Spring Data JPA
	// save(객체)
	// findById(id)
	// delete(객체);
	// findAll();
	
	public List<StudentEntity> findAllByOrderByIdDesc();
	public List<StudentEntity> findTop2ByOrderByIdDesc();
	public List<StudentEntity> findByName(String name);
	public List<StudentEntity> findByNameIn(List<String> names);
	public List<StudentEntity> findByNameAndDreamJob(String name111, String dreamJob);
	public List<StudentEntity> findByEmailContaining(String email);
	public List<StudentEntity> findByNameStartingWith(String name);
	public List<StudentEntity> findByIdBetween(int n1, int n2);
	
	// JPQL 직접 작성
	//@Query(value = "select st from new_student st where st.dreamJob = :dreamJob")
	
	// native query => DB 쿼리문으로 직접 수행 
	@Query(value = "select * from new_student where dreamJob=:dreamJob", nativeQuery = true)
	public List<StudentEntity> findByDreamJob(@Param("dreamJob") String dreamJob);
	
	
}





