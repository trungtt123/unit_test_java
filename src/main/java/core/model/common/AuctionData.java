package core.model.common;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionData{
	
	@JsonProperty("auction_id")
	private int auctionId;

	@JsonProperty("selling_user_id")
	private int sellingUserId;

	private String title;

	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;

	private int statusId;
	
	private String status;
	
	private CategoryData category;
	
	@JsonProperty("is_liked")
	private boolean isLiked;
}



