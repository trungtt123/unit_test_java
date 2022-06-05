package core.model.response.getlistauctions;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.common.AuctionData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListAuctionsData{
	
	private List<AuctionData> auctions;
	
	private int total;
	
}



