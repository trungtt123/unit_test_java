package core.model.response.getlistcomments;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListCommentsResponseModel extends BaseResponseModel {
	private ListCommentsData data;
	
}
