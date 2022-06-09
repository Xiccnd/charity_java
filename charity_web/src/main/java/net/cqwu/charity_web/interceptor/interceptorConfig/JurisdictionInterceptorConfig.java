package net.cqwu.charity_web.interceptor.interceptorConfig;

import net.cqwu.charity_web.interceptor.JurisdictionInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@SuppressWarnings("deprecation")
//@Configuration
public class JurisdictionInterceptorConfig extends WebMvcConfigurerAdapter {
//    @Autowired
    JurisdictionInterceptor jurisdictionInterceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration ir =  registry.addInterceptor(jurisdictionInterceptor);
        ir.addPathPatterns("/**");
        ir.excludePathPatterns("/login","/");
    }
}
