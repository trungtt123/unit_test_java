package core.model.response.getlistlikes;

import java.util.List;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListLikesResponseModel extends BaseResponseModel{
	
	private ListAuctionsData data;
}



