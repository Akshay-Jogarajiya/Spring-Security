package com.security.springsecurity.Controller;

import com.security.springsecurity.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Akshay", "Java"),
            new Student(2, "Paresh", "JavaScript")
    ));

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("/students")
    public void addStudents(@RequestBody Student student) {
        students.add(student);
    }
}
