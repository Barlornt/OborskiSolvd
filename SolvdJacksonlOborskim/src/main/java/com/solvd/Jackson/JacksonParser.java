package com.solvd.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.solvd.model.EmployeeList;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        try {
            EmployeeList employeeList = mapper.readValue(new File("src/main/resources/employees.json"), EmployeeList.class);

            mapper.writeValue(new File("src/main/resources/output_employees.json"), employeeList);

            System.out.println("Successfully parsed and serialized JSON");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
