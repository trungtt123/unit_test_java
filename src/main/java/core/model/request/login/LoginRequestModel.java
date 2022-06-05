package core.model.request.login;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestModel {
	private String email;
	private String password;
	public LoginRequestModel(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public LoginRequestModel() {
		
	}
}
