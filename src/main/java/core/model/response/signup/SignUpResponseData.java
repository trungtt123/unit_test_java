package core.model.response.signup;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpResponseData {
	private String email;
	private String password;
	@JsonProperty("re_pass")
	private String rePass;
	private String address;
	private String name;
	private String phone;
	private String avatar;
	private String role;
	

	public SignUpResponseData() {
		
	}
}
