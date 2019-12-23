package life.wangqiang.community.community.advice;

import life.wangqiang.community.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @version : V1.0
 * @ClassName: CustomizeExceptionHandler
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/23 下午3:37
 */
@ControllerAdvice
public class CustomizeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e,
                         Model model) {
        if (e instanceof CustomizeException){
            model.addAttribute("message",e.getMessage());
        }else{
            model.addAttribute("message","服务器冒烟了.......");
        }
        return new ModelAndView("error");
    }


}
