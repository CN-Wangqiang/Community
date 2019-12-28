package life.wangqiang.community.community.dto;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: NotificationDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/28 下午12:30
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerId;
    private String typeName;
    private Integer type;
}
