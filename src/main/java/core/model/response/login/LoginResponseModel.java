package core.model.response.login;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseModel extends BaseResponseModel{
	
	private LoginResponseData data;
}



