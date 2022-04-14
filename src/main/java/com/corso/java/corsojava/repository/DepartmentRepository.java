package com.corso.java.corsojava.repository;

import com.corso.java.corsojava.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, String> {

    // Finding a department inserting id and name
    @Query(value = "SELECT * FROM DEPARTMENTS WHERE id = id AND name = name", nativeQuery = true)
    Department findByIdAndName(String id, String name);

    // Finding a department inserting name and country
    @Query(value = "SELECT * FROM DEPARTMENTS WHERE name = name AND country = country", nativeQuery = true)
    Department findByNameAndCountry(String name, String country);
}
