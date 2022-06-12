package core.model.response.readnotification;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNotificationData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("is_read")
	private String isRead;
	
}



