package core.model.response.totallikes;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TotalLikesResponseModel extends BaseResponseModel{
	
	
	private TotalLikesData data;
}
