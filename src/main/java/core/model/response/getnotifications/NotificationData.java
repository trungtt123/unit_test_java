package core.model.response.getnotifications;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationData{

	private List<DenyData> denys;

	@JsonProperty("total_not_read")
	private String totalNotRead;
	
	@JsonProperty("total")
	private String total;
}
