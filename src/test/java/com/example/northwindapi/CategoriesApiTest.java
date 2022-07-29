package com.example.northwindapi;

import com.example.northwindapi.annotations.CategoryObject;
import com.example.northwindapi.annotations.ProductObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.*;
import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class CategoriesApiTest {
    private static final int port = 8123;

    @Test
    public void testDelete() {
        try {
            URL url = new URL("http://localhost:" + port + "/customer/by-id/1");
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            httpConn.setDoOutput(true);
            httpConn.setRequestMethod("DELETE");
            OutputStreamWriter out = new OutputStreamWriter(
                    httpConn.getOutputStream());
            out.write("Resource content");
            out.close();
            httpConn.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetCategory() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            CategoryObject result = objectMapper.readValue(
                    new URL("http://localhost:" + port + "/category/by-id/1"),
                    CategoryObject.class
            );
            Assertions.assertEquals(1, result.getId());
            Assertions.assertTrue(result.getCategoryName().length() > 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
