package core.model.response.getnews;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewsData {
	
	private List<NewsData> news;
	private String total;
	
}



