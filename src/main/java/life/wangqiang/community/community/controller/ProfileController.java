package life.wangqiang.community.community.controller;

import life.wangqiang.community.community.mapper.UserMapper;
import life.wangqiang.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @version : V1.0
 * @ClassName: ProfileController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/18 下午6:12
 */
@Controller
public class ProfileController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name ="action")String action,
                          HttpServletRequest request,
                          Model mode){
        Cookie[] cookies = request.getCookies();
        if (cookies != null)
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if (user != null){
                        request.getSession().setAttribute("user",user);
                    }
                    break;
                }
            }
        if ("questions".equals(action)){
            mode.addAttribute("section","questions");
            mode.addAttribute("sectionName","我的提问");
        }else if ("replies".equals(action)){
            mode.addAttribute("section","replies");
            mode.addAttribute("sectionName","最新回复");
        }

        return "profile";
    }
}
