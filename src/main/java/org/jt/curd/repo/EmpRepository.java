package org.jt.curd.repo;

import org.jt.curd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee,Integer> {
}
