package life.wangqiang.community.community.advice;

import com.alibaba.fastjson.JSON;
import life.wangqiang.community.community.dto.ResultDTO;
import life.wangqiang.community.community.exception.CustomizeErrorCode;
import life.wangqiang.community.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
                        Model model,
                        HttpServletRequest request,
                        HttpServletResponse response) {

        String contentType = request.getContentType();
        if ("application/json".equals(contentType)){
            ResultDTO resultDTO ;
            if (e instanceof CustomizeException){
                resultDTO = ResultDTO.errorOf((CustomizeException)e);
            }else{
                resultDTO = ResultDTO.errorOf(CustomizeErrorCode.SYS_ERROR);
            }

            PrintWriter writer = null;
            try {
                response.setContentType("application/json");
                response.setStatus(200);
                response.setCharacterEncoding("UTF-8");
                writer = response.getWriter();
                writer.write(JSON.toJSONString(resultDTO));
                writer.close();
            } catch (IOException ex) {
            }
            return  null;
        }else {
            if (e instanceof CustomizeException){
                model.addAttribute("message",e.getMessage());
            }else{
                model.addAttribute("message",CustomizeErrorCode.SYS_ERROR);
            }
        }


        return new ModelAndView("error");
    }


}
