package core.model.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponseData {
	
	@JsonProperty("access_token")
	private String accessToken;
	
	private UserData user;
	@JsonProperty("token_type")
	
	private String tokenType;
	@JsonProperty("expires_in")
	
	private int expiresIn;
	
	private int exp;
}

