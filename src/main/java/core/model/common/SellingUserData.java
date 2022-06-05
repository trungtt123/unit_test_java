package core.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SellingUserData {
	
	@JsonProperty("selling_user_id")
	private String sellingUserId;
	
	@JsonProperty("selling_user_name")
	private String sellingUserName;
	
	@JsonProperty("selling_user_avatar")
	private String sellingUserAvatar;
}	
