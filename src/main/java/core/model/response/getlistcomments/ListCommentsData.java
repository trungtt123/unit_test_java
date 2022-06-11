package core.model.response.getlistcomments;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.common.BidData;
import core.model.common.BrandData;
import core.model.common.BuyingUserData;
import core.model.common.CategoryData;
import core.model.common.CommentData;
import core.model.common.ItemData;
import core.model.common.SellingUserData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListCommentsData {
	

	private List<CommentData> comments;

	private String total;

}
