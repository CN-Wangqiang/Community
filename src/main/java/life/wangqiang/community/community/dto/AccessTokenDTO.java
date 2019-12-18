package life.wangqiang.community.community.dto;

import lombok.Data;

/**
 * @version : V1.0
 * @ClassName: AccessTokenDTO
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 上午10:47
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;
}
