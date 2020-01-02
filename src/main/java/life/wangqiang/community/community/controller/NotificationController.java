package life.wangqiang.community.community.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import life.wangqiang.community.community.dto.NotificationDTO;
import life.wangqiang.community.community.dto.PaginationDTO;
import life.wangqiang.community.community.enums.NotificationStatusEnum;
import life.wangqiang.community.community.enums.NotificationTypeEnum;
import life.wangqiang.community.community.model.User;
import life.wangqiang.community.community.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @version : V1.0
 * @ClassName: NotificationController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/28 下午6:09
 */
@Controller
@Api(tags = "个人通知")
public class NotificationController {

    @Autowired
    private  NotificationService notificationService;

    @ApiOperation("请求通知列表")
    @GetMapping("/notification/{id}")
    public String profile(HttpServletRequest request,
                          @PathVariable(name = "id")Long id) {

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }

        NotificationDTO notificationDTO = notificationService.read(id,user);
        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType() ||
        NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()){
            return "redirect:/question/" + notificationDTO.getOuterId();
        }else{
            return "redirect:/";
        }

    }
}
