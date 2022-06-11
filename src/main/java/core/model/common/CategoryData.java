package core.model.common;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryData{
	
	@JsonProperty("category_id")
	private String categoryId;
	
	private String name;
	
	private String image;

	private int type;
}



