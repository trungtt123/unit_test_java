package core.model.response.getlistbids;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListBidsResponseModel extends BaseResponseModel {
	private ListBidsData data;
	
}
