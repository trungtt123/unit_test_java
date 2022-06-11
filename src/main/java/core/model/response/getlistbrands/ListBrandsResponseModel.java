package core.model.response.getlistbrands;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListBrandsResponseModel extends BaseResponseModel {
	private ListBrandsData data;
}
