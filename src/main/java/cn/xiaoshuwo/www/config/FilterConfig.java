package cn.xiaoshuwo.www.config;

import cn.xiaoshuwo.www.filter.EncryptionAndDecryptionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @文件名：FilterConfig.java
 * @作者：lvzhi
 * @版本号：1.0
 * @生成日期：2019/4/27
 * @功能描述：拦截器配置类
 */

public class FilterConfig {

    /**
     * 统一加密、解密过滤器
     * @return
     */
    public FilterRegistrationBean filterDemo4Registration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new EncryptionAndDecryptionFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("exclusions","swagger,webjars,v2,favicon,login");
        registration.setName("EncryptionAndDecryptionFilter");
        registration.setOrder(100);
        return registration;
    }

}
