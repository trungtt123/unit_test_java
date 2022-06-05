package com;

import org.junit.Before;

import io.restassured.RestAssured;
import core.constant.Constant;

public class BaseRestAssuredClass {
	
	@Before
    public static void init() {
        RestAssured.baseURI = Constant.API_URL;
    }
}
