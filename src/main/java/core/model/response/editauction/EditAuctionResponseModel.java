package core.model.response.editauction;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAuctionResponseModel extends BaseResponseModel {
	private EditAuctionData data;
}
