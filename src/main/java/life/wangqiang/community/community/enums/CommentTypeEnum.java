package life.wangqiang.community.community.enums;

/**
 * @version : V1.0
 * @ClassName: CommentTypeEnum
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/25 上午10:32
 */
public enum  CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);

    private Integer type;

    public static boolean isExist(Integer type) {
        for (CommentTypeEnum commentTypeEnum : CommentTypeEnum.values()) {
            if (commentTypeEnum.getType() == type){
                return true;
            }
        }
        return false;
    }

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type){
        this.type = type;
    }
}
