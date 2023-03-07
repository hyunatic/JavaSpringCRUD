package com.example.MongoDBApi.Controller;

import com.example.MongoDBApi.Model.Student;
import com.example.MongoDBApi.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FunctionalInterface
interface StudentList{
    public List<Student> Invoke(String value);
}
@RestController
@RequestMapping("api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @GetMapping(path = "")
    public List<Student> fetchAll(){
        return studentService.getAllStudents();
    }
    @GetMapping(path = "/{firstName}")
    public Student fetchOne(@PathVariable(value="firstName") String firstName){
        return studentService.getSingleStudent(firstName);
    }
    @PostMapping(path = "/insert")
    public Student insertOne(@RequestBody Student newStudent){
        return studentService.addSingleStudent(newStudent);
    }
    @PutMapping(path = "/update")
    public Student updateOne(@RequestBody Student requestStudent){
        return studentService.updateSingleStudent(requestStudent);
    }
    @DeleteMapping(path = "/delete/{id}")
    public String deleteOne(@PathVariable(value="id") String studentId){
        return studentService.deleteSingleStudent(studentId);
    }
}
