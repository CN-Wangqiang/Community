package life.wangqiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version : V1.0
 * @ClassName: ProfileController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/18 下午6:12
 */
@Controller
public class ProfileController {


    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name ="action")String action,
                          Model mode){
        if ("question".equals(action)){
            mode.addAttribute("section","question");
            mode.addAttribute("sectionName","我的提问");
        }
        return "profile";
    }
}
