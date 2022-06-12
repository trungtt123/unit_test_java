package core.model.response.getnotifications;

import core.model.response.BaseResponseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNotificationsResponseModel extends BaseResponseModel {
	private NotificationData data;
}
