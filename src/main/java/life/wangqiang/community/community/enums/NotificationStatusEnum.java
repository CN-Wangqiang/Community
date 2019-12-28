package life.wangqiang.community.community.enums;

/**
 * @version : V1.0
 * @ClassName: NotificationStatusEnum
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/28 上午11:25
 */
public enum NotificationStatusEnum {
    UNREAD(0),READ(1);
    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
