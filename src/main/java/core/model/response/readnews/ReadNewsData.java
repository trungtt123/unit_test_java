package core.model.response.readnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReadNewsData {
	
	@JsonProperty("new_id")
	private String newId;
	
	@JsonProperty("is_read")
	private String isRead;
	
}



