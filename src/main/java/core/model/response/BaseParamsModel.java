package core.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseParamsModel {
	private String key;
	private String value;
	public BaseParamsModel(String key, String value) {
		this.key = key;
		this.value = value;
	}
}
