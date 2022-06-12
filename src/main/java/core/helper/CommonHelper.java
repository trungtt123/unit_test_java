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
	    	case(6):
	    		System.out.println("List unit test of API_SEARCH");
	    		for (int i = 0; i < Constant.API_SEARCH.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_SEARCH[i]);
	    		break;
	    	case(7):
	    		System.out.println("List unit test of API_CREATE_AUCTION");
	    		for (int i = 0; i < Constant.API_CREATE_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_CREATE_AUCTION[i]);
	    		break;
	    	case(8):
	    		System.out.println("List unit test of API_EDIT_AUCTION");
	    		for (int i = 0; i < Constant.API_EDIT_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_EDIT_AUCTION[i]);
	    		break;
	    	case(9):
	    		System.out.println("List unit test of API_GET_LIST_BRANDS");
	    		for (int i = 0; i < Constant.API_GET_LIST_BRANDS .length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_LIST_BRANDS[i]);
	    		break;
	    	case(10):
	    		System.out.println("List unit test of API_GET_LIST_CATEGORIES");
	    		for (int i = 0; i < Constant.API_GET_LIST_CATEGORIES.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_LIST_CATEGORIES[i]);
	    		break;
	    	case(11):
	    		System.out.println("List unit test of API_GET_LIST_CATEGORIES");
	    		for (int i = 0; i < Constant.API_GET_LIST_BIDS_OF_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_LIST_BIDS_OF_AUCTION[i]);
	    		break;
	    	case(12):
	    		System.out.println("List unit test of API_CREATE_ITEM");
	    		for (int i = 0; i < Constant.API_CREATE_ITEM.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_CREATE_ITEM[i]);
	    		break;
	    	case(13):
	    		System.out.println("List unit test of API_GET_LIST_COMMENTS_OF_AUCTION");
	    		for (int i = 0; i < Constant.API_GET_LIST_COMMENTS_OF_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_LIST_COMMENTS_OF_AUCTION[i]);
	    		break;
	    	case(14):
	    		System.out.println("List unit test of API_CREATE_COMMENT");
	    		for (int i = 0; i < Constant.API_CREATE_COMMENT.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_CREATE_COMMENT[i]);
	    		break;
	    	case(15):
	    		System.out.println("List unit test of API_DELETE_COMMENT");
	    		for (int i = 0; i < Constant.API_DELETE_COMMENT.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_DELETE_COMMENT[i]);
	    		break;
	    	case(16):
	    		System.out.println("List unit test of API_LIKE_AUCTION");
	    		for (int i = 0; i < Constant.API_LIKE_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LIKE_AUCTION[i]);
	    		break;
	    	case(17):
	    		System.out.println("List unit test of API_LIST_LIKES");
	    		for (int i = 0; i < Constant.API_LIST_LIKES.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_LIST_LIKES[i]);
	    		break;
	    	case(18):
	    		System.out.println("List unit test of API_GET_TOTAL_LIKES_OF_AUCTION");
	    		for (int i = 0; i < Constant.API_GET_TOTAL_LIKES_OF_AUCTION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_TOTAL_LIKES_OF_AUCTION[i]);
	    		break;
	    	case(19):
	    		System.out.println("List unit test of API_GET_NEWS");
	    		for (int i = 0; i < Constant.API_GET_NEWS.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_NEWS[i]);
	    		break;
	    	case(20):
	    		System.out.println("List unit test of API_READ_NEWS");
	    		for (int i = 0; i < Constant.API_READ_NEWS.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_READ_NEWS[i]);
	    		break;
	    	case(21):
	    		System.out.println("List unit test of API_GET_NOTIFICATIONS");
	    		for (int i = 0; i < Constant.API_GET_NOTIFICATIONS.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_NOTIFICATIONS[i]);
	    		break;
	    	case(22):
	    		System.out.println("List unit test of API_READ_NOTIFICATION");
	    		for (int i = 0; i < Constant.API_READ_NOTIFICATION.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_READ_NOTIFICATION[i]);
	    		break;
	    	case(23):
	    		System.out.println("List unit test of API_GET_SLIDER");
	    		for (int i = 0; i < Constant.API_GET_SLIDER.length; i++)
	    	    	System.out.println(i + " --- " + Constant.API_GET_SLIDER[i]);
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
