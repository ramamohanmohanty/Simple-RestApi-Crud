package org.jt.curd.controller;

import lombok.RequiredArgsConstructor;
import org.jt.curd.model.Employee;
import org.jt.curd.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp")
//@RequiredArgsConstructor
public class EmpController {
    @Autowired
    private EmpService empService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return empService.addEmployee(employee);
    }
    @PutMapping("/update/{empId}")
    public Employee updateEmployee(@PathVariable int empId,@RequestBody Employee employee){
        return empService.updateEmployee(empId, employee);
    }

    @GetMapping("/getAll")
    public List<Employee> getEmployee(){
        return empService.retriveEmployee();
    }

    @GetMapping("/getById/{empId}")
    public Employee getEmployeeById(@PathVariable int empId){
        return empService.getById(empId);
    }

    @DeleteMapping("/delete/{empId}")
    public void deleteEmployee(@PathVariable int empId){
        empService.deleteEmployee(empId);
    }
}
