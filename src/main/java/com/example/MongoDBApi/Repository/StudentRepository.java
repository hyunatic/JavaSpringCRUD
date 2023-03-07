package com.example.MongoDBApi.Repository;

import com.example.MongoDBApi.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
    Optional<Student> findStudentByEmail(String email);
    Optional<Student> findStudentByFirstName(String firstName);
    Optional<Student> findStudentById(String id);
}
