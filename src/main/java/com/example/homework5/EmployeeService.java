package com.example.homework5;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String fristName, String secondName);

    Employee remove(String fristName, String secondName);

    Employee find(String fristName, String secondName);

    Collection<Employee> findAll();
}
