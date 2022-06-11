package core.model.response.createauction;

import core.model.common.AuctionData;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAuctionData extends AuctionData {
	private String reason; 
}
