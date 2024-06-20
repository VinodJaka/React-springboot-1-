package com.pragna.StudentSystemManagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragna.StudentSystemManagement.model.*;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
