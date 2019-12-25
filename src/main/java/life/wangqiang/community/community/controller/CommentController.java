package life.wangqiang.community.community.controller;

import life.wangqiang.community.community.dto.CommentDTO;
import life.wangqiang.community.community.dto.ResultDTO;
import life.wangqiang.community.community.exception.CustomizeErrorCode;
import life.wangqiang.community.community.mapper.CommentMapper;
import life.wangqiang.community.community.model.Comment;
import life.wangqiang.community.community.model.User;
import life.wangqiang.community.community.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @version : V1.0
 * @ClassName: CommentController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/25 上午10:00
 */
@Controller
public class CommentController {


    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request){

        User user =(User) request.getSession().getAttribute("user");
        if (user == null){
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setLikeCount(0L);
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
}
