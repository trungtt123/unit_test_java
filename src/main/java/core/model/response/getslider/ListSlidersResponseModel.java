package core.model.response.getslider;

import java.util.List;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListSlidersResponseModel extends BaseResponseModel{
	
	private List<SliderData> data;
}



