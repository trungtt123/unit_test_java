package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import core.model.request.login.LoginRequestModel;
import core.model.request.signup.SignUpRequestModel;
import core.model.response.login.LoginResponseModel;
import core.model.response.signup.SignUpResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiSignUp;

public class SignUpRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_SIGN_UP;
	
	//API SIGN UP CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
    	SignUpRequestModel requestBody = RequestApiSignUp.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			jsonString = mapper.writeValueAsString(requestBody);

			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .body(jsonString)
	                .post(RequestApiSignUp.apiPath);
			
			rut.setInput(jsonString);
	        rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());

	        SignUpResponseModel resObj = mapper.readValue(res.asString(), SignUpResponseModel.class);
	        /* Tam thoi khong kiem tra unit test nay
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage() == "OK";
	        
	        // not null user data
	        assertNotNull(resObj.getData());
	        */
	        

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	
	//API SIGNUP NHAP KHONG DUNG DINH DANG EMAIL - MA CODE 1001
	@Test
    public static ResponseUnitTest UnitTest001() {
    	
    	SignUpRequestModel requestBody = RequestApiSignUp.UnitTest001.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			jsonString = mapper.writeValueAsString(requestBody);

			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .body(jsonString)
	                .post(RequestApiSignUp.apiPath);
			
			rut.setInput(jsonString);
	        rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
	        
			SignUpResponseModel resObj = mapper.readValue(res.asString(), SignUpResponseModel.class);
	        
	        assert resObj.getCode() == 1001;

	        assertNull(resObj.getData());

	        
	        
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
    
    
	public static ResponseUnitTest runUnitTest(int unitTestId) {
    	
    	ResponseUnitTest rut = new ResponseUnitTest();
    	switch (unitTestId) {
    		case (0):
    			rut = UnitTest000();
    			break;
    		case (1):
    			rut = UnitTest001();
    			break;
    		default: 
    			break;
    	}
    	return rut;
    	
    	
    }
    public static List<ResponseUnitTest> run(int checkUnit, int unitTestId) {
    	
    	init();
    	List<ResponseUnitTest> listRut = new ArrayList<ResponseUnitTest>();
    	if (checkUnit == 0) {
    		for (int i = 0; i < listUnitTest.length; i++) {
    			ResponseUnitTest rut = runUnitTest(i);
    			listRut.add(rut);
    		}
    	}
    	else {
    		ResponseUnitTest rut = runUnitTest(unitTestId);
    		listRut.add(rut);
    	}
    	return listRut;
    }
 

}