package core.helper;



import java.util.List;

import core.constant.Constant;
import core.model.responseunittest.ResponseUnitTest;

public class CommonHelper {
	public static void showListUnitTest(int apiId) {
		
		switch (apiId){
	    	case(0):
	    		System.out.println("List unit test of API_LOGIN");
	    		for (int i = 0; i < Constant.API_LOGIN.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LOGIN[i]);
	    		break;
	    	case(1):
	    		System.out.println("List unit test of API_SIGN_UP");
	    		for (int i = 0; i < Constant.API_SIGN_UP.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_SIGN_UP[i]);
	    		break;
	    	case(2):
	    		System.out.println("List unit test of API_LOG_OUT");
	    		for (int i = 0; i < Constant.API_LOG_OUT.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LOG_OUT[i]);
	    		break;
	    	case(3):
	    		System.out.println("List unit test of API_LIST_AUCTIONS_BY_STATUS");
	    		for (int i = 0; i < Constant.API_LIST_AUCTIONS_BY_STATUS.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LIST_AUCTIONS_BY_STATUS[i]);
	    		break;
	    	case(4):
	    		System.out.println("List unit test of API_LIST_AUCTIONS_BY_USER");
	    		for (int i = 0; i < Constant.API_LIST_AUCTIONS_BY_USER.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LIST_AUCTIONS_BY_USER[i]);
	    		break;
	    	case(5):
	    		System.out.println("List unit test of API_GET_AUCTIONS_DETAIL");
	    		for (int i = 0; i < Constant.API_GET_AUCTIONS_DETAIL.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_AUCTIONS_DETAIL[i]);
	    		break;
	    	default:
	    		break;
		}
	}
	public static void printListResponseUnittest(List<ResponseUnitTest> listRut) {
		for (ResponseUnitTest rut : listRut) {
			System.out.println("---------------------------START-----------------------------");
			System.out.println(rut.getName());
			System.out.println("Input: ");
			System.out.println(rut.getInput());
			System.out.println("Output: ");
			System.out.println(rut.getOutput());
			System.out.println("---------------------------DONE------------------------------");
		}
	}
}
