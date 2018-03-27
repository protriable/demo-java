package com.protry.controller;

import com.protry.StartApplicationTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class HelloControllerTest extends StartApplicationTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/hello");
    }

    @Test
    public void index() {

        String allUrl = this.base + "/index";

        ResponseEntity<String> response = template.getForEntity(allUrl, String.class);

        assertThat(response.getBody(), equalTo("Greetings from Spring Boot!"));
    }

    @Test
    public void value() {
        String allUrl = this.base + "/value";

        ResponseEntity<String> response = template.getForEntity(allUrl, String.class);

        assertThat(response.getBody(), equalTo("test AND 22"));
    }
}