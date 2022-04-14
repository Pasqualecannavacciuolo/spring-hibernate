package com.corso.java.corsojava.service;


import com.corso.java.corsojava.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Optional findById(String id);
    List<Student> findAll();
    void deleteById(String id);
}
