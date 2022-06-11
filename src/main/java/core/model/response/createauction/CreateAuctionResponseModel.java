package core.model.response.createauction;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAuctionResponseModel extends BaseResponseModel {
	private CreateAuctionData data;
}
