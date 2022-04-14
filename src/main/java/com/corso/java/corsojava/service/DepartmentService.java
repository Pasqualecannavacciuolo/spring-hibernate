package com.corso.java.corsojava.service;

import com.corso.java.corsojava.domain.Department;

public interface DepartmentService {
    Department findByIdAndName(String id, String name);
    Department findByNameAndCountry(String name, String country);
}
