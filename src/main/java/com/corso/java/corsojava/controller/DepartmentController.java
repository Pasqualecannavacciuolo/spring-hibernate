package com.corso.java.corsojava.controller;

import com.corso.java.corsojava.domain.Department;
import com.corso.java.corsojava.domain.Student;
import com.corso.java.corsojava.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="/api/v2")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    // Finding a department inserting id and name
    @GetMapping(path="/departById")
    ResponseEntity<Department> findByIdAndName(@RequestParam String id, @RequestParam String name) {
        return new ResponseEntity<>( departmentService.findByIdAndName(id, name), HttpStatus.OK);
    }

    // Finding a department inserting name and country
    @GetMapping(path="/departByNameCountry")
    ResponseEntity<Department> findByNameAndCountry(@RequestParam String name, @RequestParam String country) {
        return new ResponseEntity<>( departmentService.findByNameAndCountry(name, country), HttpStatus.OK);
    }
}
