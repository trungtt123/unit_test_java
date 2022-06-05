package core.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemData {
	
	@JsonProperty("item_id")
	private int itemId;
	private String name;
	
	@JsonProperty("buying_user_id")
	private String buyingUserId;
	private String brand;
	private String series;
	private String description;
	
	@JsonProperty("selling_info")
	private String sellingInfo;
	
	@JsonProperty("starting_price")
	private String startingPrice;
	private String mainImage;
	private List<String> images;
}
