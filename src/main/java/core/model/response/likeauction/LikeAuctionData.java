package core.model.response.likeauction;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeAuctionData {
	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("auction_id")
	private String auctionId;
	@JsonProperty("is_liked")
	private boolean isLiked;
}
