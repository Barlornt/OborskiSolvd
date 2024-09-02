package com.solvd.computer;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String postalCode;
    private String email;

    public Customer(String name, String surname, int age, String postalCode, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.postalCode = postalCode;
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
