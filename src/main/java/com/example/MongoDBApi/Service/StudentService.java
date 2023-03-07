package com.example.MongoDBApi.Service;


import com.example.MongoDBApi.Model.Student;
import com.example.MongoDBApi.Repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getSingleStudent(String firstName){
       return studentRepository.findStudentByFirstName(firstName).get();
    }
    public Student addSingleStudent(Student newStudent){
        return studentRepository.insert(newStudent);
    }
    public Student updateSingleStudent(Student requestStudent){
        Student existingStudent = studentRepository.findStudentById(requestStudent.getId()).get();

        //Populate new value from request
//        existingStudent.setFirstName(requestStudent.getFirstName());
//        existingStudent.setLastName(requestStudent.getLastName());
//        existingStudent.setEmail(requestStudent.getEmail());
//        existingStudent.setGender(requestStudent.getGender());
//        existingStudent.setAddress(requestStudent.getAddress());
//        existingStudent.setFavouriteSubjects(requestStudent.getFavouriteSubjects());
//        existingStudent.setTotalSpentInBooks(requestStudent.getTotalSpentInBooks());
//        existingStudent.setCreated(requestStudent.getCreated());
        //Or Simply do this
        existingStudent = requestStudent;
        return studentRepository.save(existingStudent);
    }

    public String deleteSingleStudent(String id){
        studentRepository.deleteById(id);
        return "{ Response: Student ID: "+ id +" Deleted }";
    }
}
