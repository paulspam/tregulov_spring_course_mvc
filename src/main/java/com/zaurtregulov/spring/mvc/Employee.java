package com.zaurtregulov.spring.mvc;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2, max = 30, message = "name must be 2-30 symbols")
    private String name;

//    @NotNull(message = "surname must be not null")
//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surname;

    private int salary;
    private String department;
    private Map<String, String> departmens;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departmens = new HashMap<>();
        departmens.put("IT", "Information Technology");
        departmens.put("HR", "Human Resources");
        departmens.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "VBMW");
        carBrands.put("Audi", "VAudi");
        carBrands.put("MB", "VMercrdes-Benz");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Deutch", "DE");
        languageList.put("French", "FR");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
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
