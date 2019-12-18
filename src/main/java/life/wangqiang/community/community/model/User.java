package life.wangqiang.community.community.model;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: User
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 下午4:29
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
