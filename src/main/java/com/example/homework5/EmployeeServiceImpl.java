package com.example.homework5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employeeList;

    public EmployeeServiceImpl(){
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee add(String fristName, String secondName) {
        Employee employee = new Employee(fristName,  secondName);
        if (employeeList.contains(employee)){
            throw new EmployeeAlreadyAddedException();
        }
        employeeList.add(employee);
        return employee;
    }

    @Override
    public Employee remove(String fristName, String secondName) {
        Employee employee = new Employee(fristName,  secondName);
        if (employeeList.contains(employee)){
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Employee find(String fristName, String secondName) {
        Employee employee = new Employee(fristName,  secondName);
        if (employeeList.contains(employee)){
            return employee;
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public Collection<Employee> findAll() {
        return new ArrayList<>(employeeList);
    }
}
