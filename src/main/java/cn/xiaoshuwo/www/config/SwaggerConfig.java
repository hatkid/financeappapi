package cn.xiaoshuwo.www.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @文件名：AppConfig.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2018/3/5
 * @功能描述：项目手动配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //定义swagger api组 开始
    private  Contact contact = new Contact("lvzhi", "", "");
    private  ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder() .version("1.0")
                .termsOfServiceUrl("NO terms of service")
                .contact(contact)//作者
                .license("The Apache License, Version 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html");

    /**
     * @函数介绍：接口api
     * @参数
     * @返回值：
     */
    @Bean
    public Docket cartoonApi() {
        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        ticketPar.name("accessToken").description("user accessToken")
                .modelRef(new ModelRef("string")).parameterType("header")
                .defaultValue("accessToken")
                .required(false).build(); //header中的accessTokent参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("app api")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.xiaoshuwo.www"))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars)
                .apiInfo(innerApiInfo());
    }


    /**
     * @函数介绍:接口apiinfo
     * @参数
     * @返回值：
     */
    private ApiInfo innerApiInfo() {
        return apiInfoBuilder.title("appapi api")//大标题
                .description("appapi api")//详细描述
                .build();
    }


}
