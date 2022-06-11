package core.model.response.createcomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("user_id")
	private int userId; 
	
	private String content;
	
	@JsonProperty("updated_at")
	private String updatedAt;
}
