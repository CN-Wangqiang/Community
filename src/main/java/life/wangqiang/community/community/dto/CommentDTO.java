package life.wangqiang.community.community.dto;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: CommentDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/25 上午10:03
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
