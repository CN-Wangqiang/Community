package life.wangqiang.community.community.provider;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.InputStream;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/**
 * @version : V1.0
 * @ClassName: QiniuCloudProvider
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/29 下午4:56
 */
@Service
public class QiniuCloudProvider {

    @Value("${qiniuCloud.ufile.accessKey}")
    private String accessKey;

    @Value("${qiniuCloud.ufile.secretKey}")
    private String secretKey;

    @Value("${qiniuCloud.bucket.name}")
    private String bucket;

    @Value("${qiniuCloud.domainOfBucket}")
    private String domainOfBucket;

    public String upload(InputStream fileStream, String mimeType, String fileName) {
        Configuration cfg = new Configuration(Region.region1());
        UploadManager uploadManager = new UploadManager(cfg);
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        String generatedFileName;
        String[] filePaths = fileName.split("\\.");
        if (filePaths.length > 1) {
            generatedFileName = UUID.randomUUID().toString() + "." + filePaths[filePaths.length - 1];
        } else {
            return null;
        }
        String finalUrl = null;
        try {
            Response response = uploadManager.put(fileStream, generatedFileName, upToken, null, mimeType);
//            当上传成功获取私有云图片地址
            if (response.statusCode == 200) {
                String encodedFileName = URLEncoder.encode(generatedFileName, "utf-8").replace("+", "%20");
                String publicUrl = String.format("%s/%s", domainOfBucket, encodedFileName);
                long expireInSeconds = 3600;//1小时，可以自定义链接过期时间
                finalUrl = auth.privateDownloadUrl(publicUrl, expireInSeconds);
            }
        } catch (QiniuException | UnsupportedEncodingException ex) {

        }
        return finalUrl;
    }


}

/**私有云的处理方式
 * String fileName = "公司/存储/qiniu.jpg";
 * String domainOfBucket = "http://devtools.qiniu.com";
 * String encodedFileName = URLEncoder.encode(fileName, "utf-8").replace("+", "%20");
 * String publicUrl = String.format("%s/%s", domainOfBucket, encodedFileName);
 * String accessKey = "your access key";
 * String secretKey = "your secret key";
 * Auth auth = Auth.create(accessKey, secretKey);
 * long expireInSeconds = 3600;//1小时，可以自定义链接过期时间
 * String finalUrl = auth.privateDownloadUrl(publicUrl, expireInSeconds);
 * System.out.println(finalUrl);
 */
