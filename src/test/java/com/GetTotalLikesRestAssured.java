package com;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import core.model.request.login.LoginRequestModel;
import core.model.response.BaseParamsModel;
import core.model.response.getlistauctions.AuctionsResponseModel;
import core.model.response.getlistlikes.ListLikesResponseModel;
import core.model.response.login.LoginResponseModel;
import core.model.response.totallikes.TotalLikesResponseModel;
import core.model.responseunittest.ResponseUnitTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import static io.restassured.RestAssured.*;


import core.constant.Constant;
//import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiLogin;
import core.constant.Constant.Request.RequestApiAuctionsByStatus;
import core.constant.Constant.Request.RequestApiGetListLikes;
import core.constant.Constant.Request.RequestApiGetTotalLikes;;

public class GetTotalLikesRestAssured extends BaseRestAssuredClass{

	private static String[] listUnitTest = Constant.API_GET_TOTAL_LIKES_OF_AUCTION;
	
	//API CHAY DUNG KQ
	@Test
    public static ResponseUnitTest UnitTest000() {

    	ResponseUnitTest rut = new ResponseUnitTest();
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString;
		try {
			
			Response res = given()
	                .contentType(ContentType.JSON)
	                .when()
	                .get(RequestApiGetTotalLikes.apiPath + "/" + RequestApiGetTotalLikes.UnitTest000.auctionId);

//			rut.setInput(params.toString());
			rut.setName(listUnitTest[0]);
	        rut.setOutput(res.asPrettyString());
			
			TotalLikesResponseModel resObj = mapper.readValue(res.asString(), TotalLikesResponseModel.class);
      
	        assert resObj.getCode() == 1000;
	        assert resObj.getMessage().equals("OK");
	        System.out.println(resObj);
	        // not null auction
	        assertNotNull(resObj.getData());
	        // not null total    

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