package life.wangqiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version : V1.0
 * @ClassName: HelloController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/16 下午9:05
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";

    }
}
