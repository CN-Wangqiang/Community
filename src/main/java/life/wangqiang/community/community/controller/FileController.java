package life.wangqiang.community.community.controller;

import life.wangqiang.community.community.dto.FileDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version : V1.0
 * @ClassName: FileController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/29 上午10:37
 */
@Controller
public class FileController {


    @RequestMapping("/file/upload")
    @ResponseBody
    public FileDTO upload(){
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl("/images/wechat.png");
        return  fileDTO;
    }
}
