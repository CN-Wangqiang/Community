package life.wangqiang.community.community.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import life.wangqiang.community.community.dto.CommentDTO;
import life.wangqiang.community.community.dto.QuestionDTO;
import life.wangqiang.community.community.enums.CommentTypeEnum;
import life.wangqiang.community.community.service.CommentService;
import life.wangqiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: QuestionController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/22 下午11:16
 */
@Controller
@Api(tags = "问题列表")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @Autowired
    CommentService commentService;

    @ApiOperation("获取问题列表")
    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id")Long id,
                           Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        List<QuestionDTO> relationQuestions = questionService.selectRelated(questionDTO);
        List<CommentDTO> comments = commentService.ListByTargetId(id, CommentTypeEnum.QUESTION);

//        累加阅读数
        questionService.incView(id);
        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        model.addAttribute("relationQuestions",relationQuestions);
        return "question";

    }
}
