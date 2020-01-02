package life.wangqiang.community.community.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import life.wangqiang.community.community.dto.FileDTO;
import life.wangqiang.community.community.provider.QiniuCloudProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @version : V1.0
 * @ClassName: FileController
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/29 上午10:37
 */
@Controller
@Api(tags = "文件上传")
public class FileController {


    @Autowired
    private QiniuCloudProvider qiniuCloudProvider;

    @RequestMapping("/file/upload")
    @ResponseBody
    @ApiOperation("文件上传")

    public FileDTO upload(HttpServletRequest request){
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartHttpServletRequest.getFile("editormd-image-file");
        String finalUrl = null;
        try {
            finalUrl = qiniuCloudProvider.upload(file.getInputStream(),file.getContentType(),file.getOriginalFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileDTO fileDTO = new FileDTO();
        fileDTO.setSuccess(1);
        fileDTO.setUrl(finalUrl);
        return  fileDTO;
    }
}
