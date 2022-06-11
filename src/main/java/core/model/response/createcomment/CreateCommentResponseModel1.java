package core.model.response.createcomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentResponseModel1 extends BaseResponseModel {
	
	private CreateCommentData1 data;
}
