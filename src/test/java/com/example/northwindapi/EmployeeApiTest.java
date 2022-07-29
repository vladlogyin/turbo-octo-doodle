package com.example.northwindapi;

import com.example.northwindapi.annotations.EmployeeObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class EmployeeApiTest {

    @Test
    @DisplayName("Check Last Name")
    public void checkEmployeeLastName() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            EmployeeObject result = mapper.readValue(
                    new URL("http://localhost:8123/employee/by-id/1"),
                    EmployeeObject.class);
            Assertions.assertEquals("Davolio",result.getLastName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
