package core.model.response.createcomment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCommentData2 {
	private List<CreateCommentData> comments;
	private String total;
}
