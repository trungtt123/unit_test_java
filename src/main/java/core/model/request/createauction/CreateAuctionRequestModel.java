package core.model.request.createauction;

import java.time.LocalDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAuctionRequestModel {
	
	@JsonProperty("category_id")
	private int categoryId;
	
	@JsonProperty("start_date")
	private String startDate;
	
	@JsonProperty("end_date")
	private String endDate;
	
	@JsonProperty("title_ni")
	private String titleNi;
	
	public CreateAuctionRequestModel() {
		
	}
}
