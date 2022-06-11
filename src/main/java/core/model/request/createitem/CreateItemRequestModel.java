package core.model.request.createitem;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateItemRequestModel {
	private String name;
	
	@JsonProperty("starting_price")
	private int startingPrice;
	
	@JsonProperty("brand_id")
	private int brandId; 
	
	private String description;
	
	private String series;
	
	private List<String> images;
}
