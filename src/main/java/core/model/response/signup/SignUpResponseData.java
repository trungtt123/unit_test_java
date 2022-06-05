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
	private String file;
	
	public SignUpResponseData(String email, String password, String rePass, String address, String name, String phone, String file) {
		this.email = email;
		this.password = password;
		this.rePass = rePass;
		this.name = name;
		this.phone = phone;
		this.file = file;
	}
	public SignUpResponseData() {
		
	}
}
