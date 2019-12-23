package life.wangqiang.community.community.controller;

import life.wangqiang.community.community.dto.QuestionDTO;
import life.wangqiang.community.community.mapper.QuestionMapper;
import life.wangqiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @version : V1.0
 * @ClassName: QuestionController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/22 下午11:16
 */
@Controller
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")Integer id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);

        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        return "question";

    }
}
