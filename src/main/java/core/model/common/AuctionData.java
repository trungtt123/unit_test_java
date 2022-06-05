package core.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuctionData{
	
	@JsonProperty("auction_id")
	private int auctionId;

	@JsonProperty("selling_user_id")
	private int sellingUserId;

	private String title;

	private String startDate;

	private String endDate;

	private int statusId;
	
	private String status;
	
	private CategoryData category;
}



