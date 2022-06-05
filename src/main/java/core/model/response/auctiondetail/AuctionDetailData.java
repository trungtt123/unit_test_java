package core.model.response.auctiondetail;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.common.BidData;
import core.model.common.BuyingUserData;
import core.model.common.CategoryData;
import core.model.common.CommentData;
import core.model.common.ItemData;
import core.model.common.SellingUserData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuctionDetailData {
	
	@JsonProperty("auctions")
	private AuctionData auctions;

	@JsonProperty("category")
	private CategoryData category;
	
	@JsonProperty("items")
	private ItemData items;
	
	@JsonProperty("selling_user")
	private SellingUserData sellingUserData;
	
	@JsonProperty("max_bid")
	private String maxBid;
	
	@JsonProperty("bids")
	private BidData bids;
	
	@JsonProperty("comments")
	private CommentData comments;

}
