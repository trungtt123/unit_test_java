package core.model.response.getnotifications;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DenyData{

	private String title;

	@JsonProperty("start_date")
	private String startDate;

	@JsonProperty("end_date")
	private String endDate;
	
	private String reason;
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("updated_at")
	private String updatedAt;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("is_read")
	private String isRead;
}
