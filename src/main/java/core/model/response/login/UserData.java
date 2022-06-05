package core.model.response.login;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
	
	private String name;
	private int role; 
	private String avatar;
	private String email;
	private String address;
	private String phone;
	
	@JsonProperty("user_id")
	private int userId;
}