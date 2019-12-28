package life.wangqiang.community.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: TagDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/27 下午11:33
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
