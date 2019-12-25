package life.wangqiang.community.community.dto;

import life.wangqiang.community.community.exception.CustomizeErrorCode;
import life.wangqiang.community.community.exception.CustomizeException;
import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: ResultDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/25 上午10:25
 */
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code,String  message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return  resultDTO;
    }

    public static ResultDTO errorOf(CustomizeErrorCode errorCode) {
        return errorOf(errorCode.getCode(),errorCode.getMessage());
    }

    public static ResultDTO okOf() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        resultDTO.setMessage("请求成功");
        return  resultDTO;
    }


    public static ResultDTO errorOf(CustomizeException e) {
        return  errorOf(e.getCode(),e.getMessage());
    }
}
