package com.zaurtregulov.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private String department;
    private Map<String, String> departmens;
    private String carBrand;
    private Map<String, String> carBrands;
    public Employee() {
        departmens = new HashMap<>();
        departmens.put("IT", "Information Technology");
        departmens.put("HR", "Human Resources");
        departmens.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "VBMW");
        carBrands.put("Audi", "VAudi");
        carBrands.put("MB", "VMercrdes-Benz");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmens() {
        return departmens;
    }

    public void setDepartmens(Map<String, String> departmens) {
        this.departmens = departmens;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
