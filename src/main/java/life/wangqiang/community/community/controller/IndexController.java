package life.wangqiang.community.community.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import life.wangqiang.community.community.cache.HotTagCache;
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
@Api(tags = "首页")
public class IndexController {



    @Autowired
    private QuestionService questionService;

    @Autowired
    private HotTagCache hotTagCache;

    @GetMapping("/")
    @ApiOperation("请求首页")
    public String index(Model model,
                        @RequestParam(name="page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5")Integer size,
                        @RequestParam(name = "search",required = false)String search,
                        @RequestParam(name = "tag",required = false)String tag,
                        @RequestParam(name = "sort",required = false)String sort){
       PaginationDTO pagination = questionService.list(search,tag,sort,page,size);
        List<String> tags = hotTagCache.getHots();
        model.addAttribute("pagination",pagination);
        model.addAttribute("search",search);
        model.addAttribute("tag",tag);
        model.addAttribute("tags",tags);
        model.addAttribute("sort",sort);
        return "index";
    }


}
