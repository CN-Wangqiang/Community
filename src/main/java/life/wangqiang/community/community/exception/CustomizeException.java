package life.wangqiang.community.community.exception;

/**
 * @version : V1.0
 * @ClassName: CustomizeException
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/23 下午4:11
 */
public class CustomizeException extends RuntimeException {
    private String message;
    private Integer code;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}