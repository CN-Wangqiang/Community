package life.wangqiang.community.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @version : V1.0
 * @ClassName: SwaggerConfig
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2020/1/2 下午2:05
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment){

//        获取项目环境
        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);


        return new Docket(DocumentationType.SWAGGER_2)
                .enable(flag)
                .apiInfo(apiInfo())
                .groupName("王锵")
                .select()
                .apis(RequestHandlerSelectors.basePackage("life.wangqiang.community.community.controller"))
                .build();
    }

//    添加接口信息
    private ApiInfo apiInfo(){
        Contact contact = new Contact("王锵", "https://github.com/ID-WangQiang", "wangqiang1996106@gmail.com");
        return new ApiInfo(
                "Community",
                "社区API文档",
                "1.0",
                "https://github.com/ID-WangQiang",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());
    }
}
