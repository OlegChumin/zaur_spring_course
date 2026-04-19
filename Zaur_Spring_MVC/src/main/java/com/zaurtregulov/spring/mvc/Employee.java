package com.zaurtregulov.spring.mvc;

import com.zaurtregulov.spring.mvc.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 256,  message = "name must be [2..256] symbols!") // минимальная и максимальная длина имени в символах
    private String name;

//    @NotNull(message = "surname is mandatory field") // marked surname as mandatory field
//    @NotEmpty(message = "surname is mandatory field and cannot be null")
    @NotBlank(message = "surname is mandatory field and cannot be null")
    private String surname;

//    @NotBlank(message = "salary cannot be empty or null")
    @Min(value = 2800, message = "must be > 2799 USD")
    @Max(value = 16_000, message = "must be less 15_999 USD")
    private int salary;
    private String department;

    private Map<String, String> departmentsList;

    private String carBrand;

    private Map<String, String> carBrandsList;

    private String languages;

    private Map<String, String> languagesList;

    @Pattern(regexp = "\\+?\\d{2}-?\\d{3}-?\\d{3}-?\\d{2}-?\\d{2}", message = "please use pattern +XX XXX XXX XX XX")
    private String phoneNumber;

    @CheckEmail //(value = "abc.com", message = "email must ends with abc.com!")
    private String email;

    public Employee() {
        departmentsList = new LinkedHashMap<>();
        departmentsList.put("IT", "Information Technology");
        departmentsList.put("HR", "Human resources");
        departmentsList.put("SALES", "Sales department");

        carBrandsList = new LinkedHashMap<>();
        carBrandsList.put("Tesla","Tesla>");
        carBrandsList.put("BMW","BMW>");
        carBrandsList.put("Audi","Audi>");
        carBrandsList.put("Mercedes-Benz","Mercedes>");
        carBrandsList.put("Toyota","Toyota>");

        languagesList = new LinkedHashMap<>();
        languagesList.put("English", "EN>");
        languagesList.put("Deutsch", "DE>");
        languagesList.put("Russian", "RU>");
        languagesList.put("French", "FR>");
        languagesList.put("Spanish", "ES>");
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

    public Map<String, String> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(Map<String, String> departmentsList) {
        this.departmentsList = departmentsList;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrandsList() {
        return carBrandsList;
    }

    public void setCarBrandsList(Map<String, String> carBrandsList) {
        this.carBrandsList = carBrandsList;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(Map<String, String> languagesList) {
        this.languagesList = languagesList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
