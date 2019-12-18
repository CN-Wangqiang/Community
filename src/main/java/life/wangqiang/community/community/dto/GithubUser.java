package life.wangqiang.community.community.dto;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: GithubUser
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 上午11:12
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
