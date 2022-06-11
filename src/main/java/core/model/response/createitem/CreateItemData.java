package core.model.response.createitem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateItemData {
	
	@JsonProperty("auction_id")
	private String auctionId;
	
	@JsonProperty("brand_id")
	private int brandId; 
	
	private String series;
	
	private String name;

	private String description;
	
	private List<String> images;
}
