package core.model.response.search;

import java.util.List;

import core.model.common.SearchData;
import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchResponseModel extends BaseResponseModel{
	private List<SearchData> data;
}
