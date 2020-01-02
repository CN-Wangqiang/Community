package life.wangqiang.community.community.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import life.wangqiang.community.community.dto.PaginationDTO;
import life.wangqiang.community.community.mapper.UserMapper;
import life.wangqiang.community.community.model.User;
import life.wangqiang.community.community.service.NotificationService;
import life.wangqiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
@Api(tags = "个人详情")
public class ProfileController {



    @Autowired
    private QuestionService questionService;

    @Autowired
    private NotificationService notificationService;

    @ApiOperation("个人详情")
    @GetMapping("/profile/{action}")
    public String profile(@PathVariable(name ="action")String action,
                          HttpServletRequest request,
                          @RequestParam(name="page",defaultValue = "1") Integer page,
                          @RequestParam(name = "size",defaultValue = "5")Integer size,
                          Model model){

        User user = (User) request.getSession().getAttribute("user");
        if (user == null){
            return "redirect:/";
        }
        if ("questions".equals(action)){
            model.addAttribute("section","questions");
            model.addAttribute("sectionName","我的提问");
            PaginationDTO paginationDTO = questionService.list(user.getId(), page, size);
            model.addAttribute("pagination",paginationDTO);
        }else if ("replies".equals(action)){
            PaginationDTO paginationDTO =notificationService.list(user.getId(),page,size);
            Long unReadCount = notificationService.unReadCount(user.getId());
            model.addAttribute("section","replies");
            model.addAttribute("pagination",paginationDTO);
            model.addAttribute("unReadCount",unReadCount);
            model.addAttribute("sectionName","最新回复");
        }

        return "profile";
    }
}
