package org.jt.curd.service;

import lombok.RequiredArgsConstructor;
import org.jt.curd.model.Employee;
import org.jt.curd.repo.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@RequiredArgsConstructor
public class EmpService {
    @Autowired
    private EmpRepository empRepository;

    public Employee addEmployee(Employee employee){
       return empRepository.save(employee);
    }
    public Employee updateEmployee(int empId,Employee employee){
        Employee employee1 = empRepository.findById(empId).orElseThrow();
        employee1.setEmpName(employee.getEmpName());
        employee1.setEmpMail(employee.getEmpMail());
        employee1.setSalary(employee.getSalary());

        return empRepository.save(employee1);
    }

    public List<Employee> retriveEmployee(){
        return empRepository.findAll();
    }


    public Employee getById(int empId){
        return empRepository.findById(empId).orElseThrow();
    }
    public void deleteEmployee(int empId){
        empRepository.deleteById(empId);
    }
}
