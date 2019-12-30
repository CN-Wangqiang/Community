package life.wangqiang.community.community.dto;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * @version : V1.0
 * @ClassName: HotTagDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/30 下午5:12
 */
@Data
public class HotTagDTO implements Comparable{
    private String name;
    private Integer priority;

    @Override
    public int compareTo(@NotNull Object o) {
        return this.getPriority() - ((HotTagDTO)o).getPriority();
    }
}
