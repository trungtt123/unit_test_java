package core.model.response.createcomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentResponseModel2 extends BaseResponseModel {
	
	private CreateCommentData2 data;
}
