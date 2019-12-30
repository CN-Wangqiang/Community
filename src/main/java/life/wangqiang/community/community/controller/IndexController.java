package life.wangqiang.community.community.controller;

import life.wangqiang.community.community.dto.PaginationDTO;
import life.wangqiang.community.community.dto.QuestionDTO;
import life.wangqiang.community.community.mapper.QuestionMapper;
import life.wangqiang.community.community.mapper.UserMapper;
import life.wangqiang.community.community.model.Question;
import life.wangqiang.community.community.model.User;
import life.wangqiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @version : V1.0
 * @ClassName: IndexController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 上午9:44
 */
@Controller
public class IndexController {



    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5")Integer size,
                        @RequestParam(name = "search",required = false)String search){
       PaginationDTO pagination = questionService.list(search,page,size);
        model.addAttribute("pagination",pagination);
        model.addAttribute("search",search);
        return "index";
    }


}
