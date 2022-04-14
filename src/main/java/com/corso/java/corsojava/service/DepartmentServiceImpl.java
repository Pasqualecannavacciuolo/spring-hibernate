package com.corso.java.corsojava.service;

import com.corso.java.corsojava.domain.Department;
import com.corso.java.corsojava.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;

    // Finding a department inserting id and name
    @Override
    public Department findByIdAndName(String id, String name) {
        return departmentRepository.findByIdAndName(id, name);
    }

    // Finding a department inserting name and country
    @Override
    public Department findByNameAndCountry(String name, String country) {
        return departmentRepository.findByNameAndCountry(name, country);
    }
}
