package life.wangqiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version : V1.0
 * @ClassName: IndexController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 上午9:44
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
