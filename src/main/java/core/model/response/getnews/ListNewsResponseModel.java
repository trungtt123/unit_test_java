package core.model.response.getnews;

import java.util.List;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNewsResponseModel extends BaseResponseModel{
	
	private NewsData data;
}



