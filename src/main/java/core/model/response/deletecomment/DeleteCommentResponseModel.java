package core.model.response.deletecomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteCommentResponseModel extends BaseResponseModel {
	
	private String data;
}
