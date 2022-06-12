package core.model.response.getslider;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SliderData {
	
	@JsonProperty("slider_id")
	private String sliderId;
	
	private String image;
	
}



