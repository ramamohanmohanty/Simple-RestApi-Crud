package org.jt.curd.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee_Details")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    private String empName;
    private String empMail;
    private double salary;
}
