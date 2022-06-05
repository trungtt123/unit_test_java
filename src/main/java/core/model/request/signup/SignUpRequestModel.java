package core.model.request.signup;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequestModel {
	private String email;
	private String password;
	@JsonProperty("re_pass")
	private String rePass;
	private String address;
	private String name;
	private String phone;
	private File file;
	
	public SignUpRequestModel(String email, String password, String rePass, String address, String name, String phone, File file) {
		this.email = email;
		this.password = password;
		this.rePass = rePass;
		this.name = name;
		this.phone = phone;
		this.file = file;
	}
	public SignUpRequestModel() {
		
	}
}
