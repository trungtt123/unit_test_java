package core.model.request.createcomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentRequestModel {
	
	private String content;
	
	@JsonProperty("comment_last_id")
	private int commentLastId;
	
}
