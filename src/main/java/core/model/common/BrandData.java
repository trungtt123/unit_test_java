package core.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BrandData {
	
	@JsonProperty("brand_id")
	private String brandId;
	
	private String name;
	
	@JsonProperty("brand_info")
	private String brandInfo;
}	
