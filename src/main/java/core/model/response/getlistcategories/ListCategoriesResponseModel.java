package core.model.response.getlistcategories;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListCategoriesResponseModel extends BaseResponseModel {
	private ListCategoriesData data;
}
