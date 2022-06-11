package core.model.response.totallikes;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TotalLikesData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("total_liked")
	private String totalLike;
}
