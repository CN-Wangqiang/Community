package life.wangqiang.community.community.dto;

import life.wangqiang.community.community.model.User;
import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: CommentDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/25 下午5:21
 */
@Data
public class CommentDTO {

    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;

}
