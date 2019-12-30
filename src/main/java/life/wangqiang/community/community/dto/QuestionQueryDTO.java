package life.wangqiang.community.community.dto;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: QuestionQueryDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/30 下午12:49
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String sort;
    private Long time;
    private String tag;
    private Integer page;
    private Integer size;
}
