package core.model.response.editauction;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAuctionData{
	@JsonProperty("auction_id")
	private String auctionId;

	@JsonProperty("selling_user_id")
	private int sellingUserId;

	private String title;

	@JsonProperty("start_date")
	private String startDate;

	@JsonProperty("end_date")
	private String endDate;

	private String status;
	
	private String reason;
	
	@JsonProperty("category_id")
	private  String categoryId;
}
