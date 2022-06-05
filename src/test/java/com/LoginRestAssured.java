package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import core.model.request.login.LoginRequestModel;
import core.model.response.login.LoginResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;

public class LoginRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_LOGIN;
	
	//API LOGIN CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
    	LoginRequestModel requestBody = RequestApiLogin.UnitTest000.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest(); 
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			jsonString = mapper.writeValueAsString(requestBody);
	    	Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .body(jsonString)
	                .post(RequestApiLogin.apiPath);


	        LoginResponseModel resObj = mapper.readValue(res.asString(), LoginResponseModel.class);
	        
	        rut.setInput(jsonString);
	        rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
	        
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
	        // not null user data
	        assertNotNull(resObj.getData().getUser());
	        // not null access token
	        assertNotNull(resObj.getData().getAccessToken());
	        
	        Constant.ACCESS_TOKEN = "Bearer " + resObj.getData().getAccessToken();
	        
	        

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	
	//API LOGIN NHAP KHONG DUNG DINH DANG EMAIL - MA CODE 1001
    @Test
    public static ResponseUnitTest UnitTest001() {
    	
    	LoginRequestModel requestBody = RequestApiLogin.UnitTest001.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest(); 
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .body(jsonString)
	                .post(RequestApiLogin.apiPath);

			rut.setInput(jsonString);
			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());

			
			LoginResponseModel resObj = mapper.readValue(res.asString(), LoginResponseModel.class);
			assert resObj.getCode() == 1001;
			
			
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
    
  //API LOGIN NHAP KHONG DUNG EMAIL PASSWORD - MA CODE 1002
    @Test
    public static ResponseUnitTest UnitTest002() {
    	
    	LoginRequestModel requestBody = RequestApiLogin.UnitTest002.requestBody;
    	ResponseUnitTest rut = new ResponseUnitTest(); 
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			
			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .body(jsonString)
	                .post(RequestApiLogin.apiPath);

	        //res.prettyPrint();
			rut.setInput(jsonString);
			rut.setName(listUnitTest[2]);
	        rut.setOutput(res.asPrettyString());
			
			LoginResponseModel resObj = mapper.readValue(res.asString(), LoginResponseModel.class);
			assert resObj.getCode() == 1002;
			
		}catch (JsonProcessingException e) {
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
    		case (2):
    			rut = UnitTest002();
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