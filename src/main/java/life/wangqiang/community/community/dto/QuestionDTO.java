package life.wangqiang.community.community.dto;

import life.wangqiang.community.community.model.User;
import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: QuestionDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/18 上午10:35
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
}
