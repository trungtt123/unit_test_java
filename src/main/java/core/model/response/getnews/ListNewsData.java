package core.model.response.getnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNewsData {
	
	@JsonProperty("user_id")
	private String userId;
	
	private String title;
	
	private String content;
	
	@JsonProperty("createdAt")
	private String created_at;
	
	@JsonProperty("updatedAt")
	private String updated_at;
	
}



