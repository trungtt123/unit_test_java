package core.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponseModel {
	private int code;
	private String message;
}
