package core.constant;

import java.time.LocalDateTime;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;
import java.time.format.DateTimeFormatter;

import core.model.request.createauction.CreateAuctionRequestModel;
import core.model.request.createcomment.CreateCommentRequestModel;
import core.model.request.createitem.CreateItemRequestModel;
import core.model.request.editauction.EditAuctionRequestModel;
import core.model.request.getnotifications.GetNotificationsRequestModel;
import core.model.request.login.LoginRequestModel;
import core.model.request.signup.SignUpRequestModel;


public class Constant {
	public static final String[] LIST_API_URL = {
			 "https://auctions-app-2.herokuapp.com/api",
			 "https://auctions-app-2.herokuapp.com/api123"
	};
	public static String API_URL = "https://auctions-app-2.herokuapp.com/api";
	public static String ACCESS_TOKEN;
	 
	public static final String[] LIST_API = {
			 "API_LOGIN",
			 "API_SIGN_UP",
			 "API_LOG_OUT",
			 "API_LIST_AUCTIONS_BY_STATUS",
			 "API_LIST_AUCTIONS_BY_USER",
			 "API_GET_AUCTIONS_DETAIL",
			 "API_SEARCH",
			 "API_CREATE_AUCTION",
			 "API_EDIT_AUCTION",
			 "API_GET_LIST_BRANDS",
			 "API_GET_LIST_CAGORIES",
			 "API_GET_LIST_BIDS_OF_AUCTION",
			 "API_CREATE_ITEM",
			 "API_GET_LIST_COMMENTS_OF_AUCTION",
			 "API_CREATE_COMMENT",
			 "API_DELETE_COMMENT",
			 "API_LIKE_AUCTION",
			 "API_GET_LIST_LIKES",
			 "API_GET_TOTAL_LIKES_OF_AUCTION",
			 "API_GET_NEWS",
			 "API_READ_NEWS",
			 "API_GET_NOTIFICATIONS",
			 "API_READ_NOTIFICATION",
			 "API_GET_SLIDER"
	};
	 
	public static final String[] API_LOGIN = {
			"API_LOGIN_UNIT_TEST_000",
			"API_LOGIN_UNIT_TEST_001",
			"API_LOGIN_UNIT_TEST_002"
	};	 
	public static final String[] API_SIGN_UP = {
			"API_SIGN_UP_UNIT_TEST_000",
			"API_SIGN_UP_UNIT_TEST_001",
	};	 
	public static final String[] API_LOG_OUT = {
			"API_LOG_OUT_UNIT_TEST_000",
			"API_LOG_OUT_UNIT_TEST_001",
	};
	public static final String[] API_LIST_AUCTIONS_BY_STATUS = {
			"API_LIST_AUCTIONS_BY_STATUS_UNIT_TEST_000",
			"API_LIST_AUCTIONS_BY_STATUS_UNIT_TEST_001",
	};
	public static final String[] API_LIST_AUCTIONS_BY_USER = {
			"API_LIST_AUCTIONS_BY_USER_UNIT_TEST_000",
			"API_LIST_AUCTIONS_BY_USER_UNIT_TEST_001",
			"API_LIST_AUCTIONS_BY_USER_UNIT_TEST_002"
	};
	public static final String[] API_GET_AUCTIONS_DETAIL = {
			"API_GET_AUCTIONS_DETAIL_UNIT_TEST_000",
			"API_GET_AUCTIONS_DETAIL_UNIT_TEST_001",
	};
	public static final String[] API_SEARCH = {
			"API_SEARCH_UNIT_TEST_000",
			"API_SEARCH_UNIT_TEST_001",
	};
	public static final String[] API_CREATE_AUCTION = {
			"API_CREATE_AUCTION_UNIT_TEST_000",
			"API_CREATE_AUCTION_UNIT_TEST_001",
			"API_CREATE_AUCTION_UNIT_TEST_002",
			"API_CREATE_AUCTION_UNIT_TEST_003"
	};
	public static final String[] API_EDIT_AUCTION = {
			"API_EDIT_AUCTION_UNIT_TEST_000",
			"API_EDIT_AUCTION_UNIT_TEST_001",
			"API_EDIT_AUCTION_UNIT_TEST_002",
			"API_EDIT_AUCTION_UNIT_TEST_003"
	};
	public static final String[] API_GET_LIST_BRANDS = {
			"API_GET_LIST_BRANDS_UNIT_TEST_000",
	};
	public static final String[] API_GET_LIST_CATEGORIES = {
			"API_GET_LIST_CATEGORIES_UNIT_TEST_000",
	};
	public static final String[] API_GET_LIST_BIDS_OF_AUCTION = {
			"API_GET_LIST_BIDS_OF_AUCTION_UNIT_TEST_000",
			"API_GET_LIST_BIDS_OF_AUCTION_UNIT_TEST_001"
	};
	public static final String[] API_CREATE_ITEM = {
			"API_CREATE_ITEM_UNIT_TEST_000",
			"API_CREATE_ITEM_UNIT_TEST_001"
	};
	public static final String[] API_GET_LIST_COMMENTS_OF_AUCTION = {
			"API_GET_LIST_COMMENTS_UNIT_TEST_000"
	};
	public static final String[] API_CREATE_COMMENT = {
			"API_CREATE_COMMENT_UNIT_TEST_000",
			"API_CREATE_COMMENT_UNIT_TEST_001",
			"API_CREATE_COMMENT_UNIT_TEST_002"
	};
	public static final String[]  API_DELETE_COMMENT = {
			"API_DELETE_COMMENT_UNIT_TEST_000",
			"API_DELETE_COMMENT_UNIT_TEST_001"
	};
	public static final String[]  API_LIKE_AUCTION = {
			"API_LIKE_AUCTION_UNIT_TEST_000"
	};
	public static final String[]  API_LIST_LIKES = {
			"API_LIST_LIKES_UNIT_TEST_000",
			"API_LIST_LIKES_UNIT_TEST_001"
	};
	public static final String[]  API_GET_TOTAL_LIKES_OF_AUCTION = {
			"API_GET_TOTAL_LIKES_UNIT_TEST_000",
	};
	public static final String[]  API_GET_NEWS = {
			"API_GET_NEWS_UNIT_TEST_000",
			"API_GET_NEWS_UNIT_TEST_001"
	};
	public static final String[]  API_READ_NEWS = {
			"API_READ_NEWS_UNIT_TEST_000"
	};
	public static final String[] API_GET_NOTIFICATIONS = {
			"API_GET_NOTIFICATIONS_UNIT_TEST_000",
			"API_GET_NOTIFICATIONS_UNIT_TEST_001"
	};
	public static final String[] API_READ_NOTIFICATION = {
			"API_READ_NOTIFICATION_UNIT_TEST_000"
	};
	public static final String[] API_GET_SLIDER = {
			"API_GET_SLIDER_UNIT_TEST_000"
	};
	
	public static class Request {
		
		// define input api login
		public static class RequestApiLogin {
			public static String apiPath = "/login"; 
			public static class UnitTest000 {
				public static LoginRequestModel requestBody 
				= new LoginRequestModel( "hungyasuo@gmail.com", "123456");
			}
			public static class UnitTest001 {
				public static LoginRequestModel requestBody 
				= new LoginRequestModel( "email@gmai.123com", "123456");
			}
			public static class UnitTest002 {
				public static LoginRequestModel requestBody 
				= new LoginRequestModel( "email-khong-ton-tai@gmail.com", "123456");
			}
		}
		// khi test đổi gmail ở unit test 000
		// define input api sign up
		public static class RequestApiSignUp {
			public static String apiPath = "/signup"; 
			public static class UnitTest000 {				
				public static SignUpRequestModel requestBody 
				= new SignUpRequestModel("hungyasuo2@gmail.com", "123456","123456","Việt Nam","Nguyễn Việt Hưng","01234567",null);			
			}
			// dang ki tai khoan da ton tai
			public static class UnitTest001 {				
				public static SignUpRequestModel requestBody 
				= new SignUpRequestModel("hungyasuo@gmail.com", "123456","123456","Việt Nam","Hưng","01234567",null);			
			}
		}
		// define input api log out 
		public static class RequestApiLogOut {
			public static String apiPath = "/logout"; 
			
		}
		// define input api acution by status
		public static class RequestApiAuctionsByStatus {
			public static String apiPath = "/auctions/listAuctionsByStatus";
			public static class UnitTest000 {				
				public static int typeId = 1;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "1");
				}
			}
			public static class UnitTest001 {				
				public static int typeId = 3;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "2");
				    params.put("count", "2");
				}
				
			}
			
		}
		// define input api auction by status
		public static class RequestApiAuctionsByUser {
			public static String apiPath = "/auctions/listAuctionsByUser";
			public static class UnitTest000 {				
				public static int typeId = 1;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "1");
				}
			}
			public static class UnitTest001 {				
				public static int typeId = 4;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
				
			}
			public static class UnitTest002 {				
				public static int typeId = 4;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
				
			}
		}
		// define input api auction by status
		public static class RequestApiGetAuctionsDetail {
			public static String apiPath = "/auctions/detail";
			public static class UnitTest000 {				
				public static int auctionId = 1;
			}
			public static class UnitTest001 {				
				public static int auctionId = 4;
			}
		}
		public static class RequestApiSearch {
			public static String apiPath = "/search";
			public static class UnitTest000 {				
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("type", "4");
				    params.put("key", "a");
				}
			}
			public static class UnitTest001 {				
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("type", "1");
				    params.put("key", "x");
				}
			}
		}
		// do title yêu cầu phải là title duy nhất nên thêm biến random để dạo title ngẫu nhiên :))
		public static class RequestApiCreateAuction {
			public static String apiPath = "/auctions/create";
			public static class UnitTest000 {				
				public static CreateAuctionRequestModel requestBody = new CreateAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(1);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title " + ranNum);
				}
			}
			// thoi gian sai
			public static class UnitTest001 {				
				public static CreateAuctionRequestModel requestBody = new CreateAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					String todayString = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					//LocalDateTime tomorrow = today.plusDays(1);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					requestBody.setCategoryId(1);
					requestBody.setStartDate(todayString);
					requestBody.setEndDate(todayString);
					requestBody.setTitleNi("Day la title " + ranNum);
				}
			}
			// loi chua login 
			public static class UnitTest002 {				
				public static CreateAuctionRequestModel requestBody = new CreateAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(1);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title " + ranNum);
				}
			}
			// khong ton tai category
			public static class UnitTest003 {				
				public static CreateAuctionRequestModel requestBody = new CreateAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(8);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title");
				}
			}
		}
		// tài khoản hungyasuo có các auction là 57, 58 (có thể dùng api get auction by user để xem)
		public static class RequestApiEditAuction {
			public static String apiPath = "/auctions/edit";
			
			public static class UnitTest000 {				
				public static int auctionId = 57;
				public static EditAuctionRequestModel requestBody = new EditAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(1);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title da sua " + ranNum);
				}
			}
			// thoi gian sai
			public static class UnitTest001 {
				public static int auctionId = 57;
				public static EditAuctionRequestModel requestBody = new EditAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					String todayString = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					//LocalDateTime tomorrow = today.plusDays(1);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					requestBody.setCategoryId(1);
					requestBody.setStartDate(todayString);
					requestBody.setEndDate(todayString);
					requestBody.setTitleNi("Day la title da sua " + ranNum);
				}
			}
			// categoryId khong ton tai
			public static class UnitTest002 {	
				public static int auctionId = 57;
				public static EditAuctionRequestModel requestBody = new EditAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(99);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title da sua " + ranNum);
				}
			}
			// auctionId đã được duyệt thì không thể thay đổi (tài khoản này chưa được admin duyệt auction nào
			// nên auctionId để tạm là 12 (auctionId của ai đó ko biết :)) )
			public static class UnitTest003 {	
				public static int auctionId = 12;
				public static EditAuctionRequestModel requestBody = new EditAuctionRequestModel();
				static {
					LocalDateTime today = LocalDateTime.now();
					LocalDateTime startDay = today.plusDays(1);
					LocalDateTime endDay = today.plusDays(2);
					Random rand = new Random();
					int ranNum = rand.nextInt(1000);
					String startString = startDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					String endString = endDay.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					requestBody.setCategoryId(1);
					requestBody.setStartDate(startString);
					requestBody.setEndDate(endString);
					requestBody.setTitleNi("Day la title da sua " + ranNum);
				}
			}
		}
		public static class RequestApiGetListBrands {
			public static String apiPath = "/brands";
		}
		public static class RequestApiGetListCategories {
			public static String apiPath = "/categories";
		}
		public static class RequestApiGetListBids {
			public static String apiPath = "/bids";
			public static class UnitTest000 {				
				public static int auctionId = 1;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "1");
				}
			}
			public static class UnitTest001 {				
				public static int auctionId = 1;
				
			}
		}
		// auctionId của tài khoản này là 57, 58
		public static class RequestApiCreateItem {
			public static String apiPath = "/items/create";
			// api chạy đúng
			public static class UnitTest000 {				
				public static int auctionId = 57; // auction này đã được thêm items, muốn test unit test này hãy tạo auction khác
				public static CreateItemRequestModel requestBody = new CreateItemRequestModel();
				static {
					requestBody.setName("Tên sản phẩm");
					requestBody.setStartingPrice(10);
					requestBody.setBrandId(1);
					requestBody.setDescription("Mô tả");
				}
			}
			// brand_id không có trong danh sách
			public static class UnitTest001 {				
				public static int auctionId = 57; // auction này đã được thêm items, muốn test unit test này hãy tạo auction khác
				public static CreateItemRequestModel requestBody = new CreateItemRequestModel();
				static {
					requestBody.setName("Tên sản phẩm");
					requestBody.setStartingPrice(10);
					requestBody.setBrandId(9);
					requestBody.setDescription("Mô tả");
				}
			}	
		}
		public static class RequestApiGetListComments {
			public static String apiPath = "/comments";
			public static class UnitTest000 {				
				public static int auctionId = 1;
			}
			
		}
		public static class RequestApiCreateComment {
			public static String apiPath = "/comments/create";
			// trường hợp bỏ lỡ comment api chạy đúng
			public static class UnitTest000 {				
				public static int auctionId = 1;
				public static CreateCommentRequestModel requestBody = new CreateCommentRequestModel();
				static {
					requestBody.setContent("Bình luận");
					requestBody.setCommentLastId(1);
					
				}
			}
			// trường hợp auction_id đã hết phiên đấu giá 
			public static class UnitTest001 {				
				public static int auctionId = 21; 
				public static CreateCommentRequestModel requestBody = new CreateCommentRequestModel();
				static {
					requestBody.setContent("Bình luận");
					requestBody.setCommentLastId(1);
				}
			}	
			// trường hợp không nhập comment_last_id
			public static class UnitTest002 {				
				public static int auctionId = 1; 
				public static CreateCommentRequestModel requestBody = new CreateCommentRequestModel();
				static {
					requestBody.setContent("Bình luận");
					//requestBody.setCommentLastId(1);
				}
			}	
		}
		public static class RequestApiDeleteComment {
			public static String apiPath = "/comments/delete";
			// api chạy đúng
			public static class UnitTest000 {				
				public static int commentId = 145; // commentId này đã bị xóa khi test, mở api get list comment để tìm commentId khác của user này
			}
			// trường hợp xóa comment của người khác
			public static class UnitTest001 {				
				public static int commentId = 121; 
			}	
		}
		public static class RequestApiLikeAuction {
			public static String apiPath = "/updateLike";
			// api chạy đúng
			public static class UnitTest000 {				
				public static int auctionId = 57; 
			}
			
		}
		public static class RequestApiGetListLikes {
			public static String apiPath = "/likes";
			public static class UnitTest000 {
				public static int statusId = 4;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
			}
			// khong login
			public static class UnitTest001 {
				public static int statusId = 4;
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
			}
		}
		public static class RequestApiGetTotalLikes {
			public static String apiPath = "/totalLikes";
			// api chạy đúng
			public static class UnitTest000 {				
				public static int auctionId = 1; 
			}
			
		}
		public static class RequestApiGetNews {
			public static String apiPath = "/news";
			public static class UnitTest000 {
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
			}
			public static class UnitTest001 {
				public static Map<String, String> params;
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				}
			}
		}
		public static class RequestApiReadNews {
			public static String apiPath = "/news/read";
			public static class UnitTest000 {
				public static int newId = 1;
			}
		}
		public static class RequestApiGetNotifications {
			public static String apiPath = "/notifications";
			public static class UnitTest000 {
				public static Map<String, String> params;
				public static GetNotificationsRequestModel requestBody = new GetNotificationsRequestModel();
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				    requestBody.setIsNotRead("1");
				}
			}
			public static class UnitTest001 {
				public static Map<String, String> params;
				public static GetNotificationsRequestModel requestBody = new GetNotificationsRequestModel();
				static {
					params = new HashMap<String, String>();
					params.put("index", "1");
				    params.put("count", "10");
				    requestBody.setIsNotRead("0");
				}
			}
		}
		// auctionDenyId chính là những auctionId của user
		public static class RequestApiReadNotification {
			public static String apiPath = "/notifications/read";
			public static class UnitTest000 {
				public static int auctionDenyId = 57;
			}
		}
		public static class RequestApiGetSlider {
			public static String apiPath = "/slider";
		}
	}
}
