package core.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentData {
	
	private String content;
	
	@JsonProperty("user_name")
	private String userName;
	
	@JsonProperty("user_avatar")
	private String userAvatar;
	
	@JsonProperty("updated_at")
	private String updatedAt;
}	
