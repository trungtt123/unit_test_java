package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import core.model.request.getnotifications.GetNotificationsRequestModel;
import core.model.request.login.LoginRequestModel;
import core.model.response.BaseParamsModel;
import core.model.response.getlistauctions.AuctionsResponseModel;
import core.model.response.getlistlikes.ListLikesResponseModel;
import core.model.response.login.LoginResponseModel;
import core.model.response.getnews.ListNewsResponseModel;
import core.model.response.getnotifications.ListNotificationsResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiAuctionsByStatus;
import core.constant.Constant.Request.RequestApiGetListLikes;
import core.constant.Constant.Request.RequestApiGetNews;
import core.constant.Constant.Request.RequestApiGetNotifications;;

public class GetNotificationsRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_GET_NOTIFICATIONS;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {
    	
    	Map<String, String> params = RequestApiGetNotifications.UnitTest000.params;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	GetNotificationsRequestModel requestBody = RequestApiGetNotifications.UnitTest000.requestBody;
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .params(params)
	                .when()
	                .get(RequestApiGetNotifications.apiPath);

			rut.setInput(params.toString());
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
	        ListNotificationsResponseModel resObj = mapper.readValue(res.asString(), ListNotificationsResponseModel.class);
      
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
	        // not null auction
	        //assertNotNull(resObj.getData().getNews());
	        // not null total
	        //assertNotNull(resObj.getData().getTotal());    

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return rut;
    }
	
	@Test
    public static ResponseUnitTest UnitTest001() {
    	
    	Map<String, String> params = RequestApiGetNotifications.UnitTest001.params;
    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	GetNotificationsRequestModel requestBody = RequestApiGetNotifications.UnitTest000.requestBody;
    	String jsonString;
		try {
			jsonString = mapper.writeValueAsString(requestBody);
			Response res = given().header("Authorization", Constant.ACCESS_TOKEN)
	                .contentType(ContentType.JSON)
	                .body(jsonString)
	                .params(params)
	                .when()
	                .get(RequestApiGetNotifications.apiPath);

			rut.setInput(params.toString());
			rut.setName(listUnitTest[1]);
	        rut.setOutput(res.asPrettyString());
			
	        ListNotificationsResponseModel resObj = mapper.readValue(res.asString(), ListNotificationsResponseModel.class);
      
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
	        // not null auction
	        //assertNotNull(resObj.getData().getNews());
	        // not null total
	        //assertNotNull(resObj.getData().getTotal());    

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