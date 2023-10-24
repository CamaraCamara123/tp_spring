package com.ensa.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ensa.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);
@Query("select year(s.dateNaissance) as annee, count(*) as nbr from Student s group by year(s.dateNaissance) order by year(s.dateNaissance)")
Collection<?> findNbrStudentByYear();
}
