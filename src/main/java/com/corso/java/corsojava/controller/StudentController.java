package com.corso.java.corsojava.controller;

import com.corso.java.corsojava.domain.Student;
import com.corso.java.corsojava.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path="/{id}")
    ResponseEntity<Student> findById(@PathVariable String id) {
        Optional<Student> student = studentService.findById(id);
        return new ResponseEntity<Student>((Student) studentService.findById(id).get(), HttpStatus.OK);
    }

    @GetMapping(path="/")
    ResponseEntity<?> findAll() {
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(path="/{id}")
    ResponseEntity<Void> deleteById(@PathVariable String id) {
        studentService.deleteById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
