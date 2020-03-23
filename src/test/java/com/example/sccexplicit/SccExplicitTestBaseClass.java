package com.example.sccexplicit;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest(classes = {SccExplicitTestBaseClass.class, SccExplicitApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class SccExplicitTestBaseClass {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 9997;
    }

}
