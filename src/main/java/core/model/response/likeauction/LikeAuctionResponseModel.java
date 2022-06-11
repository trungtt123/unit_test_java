package core.model.response.likeauction;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LikeAuctionResponseModel extends BaseResponseModel{
	
	private LikeAuctionData data;
}
