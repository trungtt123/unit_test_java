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
import core.model.response.logout.LogOutResponseModel;
import core.model.response.signup.SignUpResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
import core.constant.Constant.Request.RequestApiLogOut;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiSignUp;

public class LogOutRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_LOG_OUT;
	
	//API LOG OUT CHAY DUNG KQ
	// CHAY API LOGIN DE LAY TOKEN ROI MOI LOG OUT
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
		ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiLogOut.apiPath);
			
			rut.setInput("ACCESS_TOKEN: " + Constant.ACCESS_TOKEN);
	        rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
//	        LogOutResponseModel resObj = mapper.readValue(res.asString(), LogOutResponseModel.class);
//	        
//	        assert resObj.getCode() == 1000;
//	        assert resObj.getMessage() == "OK";
	        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	//API LOG OUT KHI KHONG CO ACCESS_TOKEN HOAC ACCESSTOKEN da logout
	// 1004 - chua dang nhap
	@Test
    public static ResponseUnitTest UnitTest001() {
    	
		ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .when()
	                .post(RequestApiLogOut.apiPath);
			
			rut.setInput("ACCESS_TOKEN: " + "Khong co access token");
	        rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
	        //LogOutResponseModel resObj = mapper.readValue(res.asString(), LogOutResponseModel.class);
	        
	        //assert resObj.getCode() == 1004;
	        
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