package com.weiyizhineng.mysql_jpa_demo.filter;

import com.alibaba.druid.support.http.StatViewServlet;
import org.apache.catalina.filters.WebdavFixFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @作者： WEIYI
 * @创建时间： 2019/10/8 20:21
 * @包名： com.weiyizhineng.mysql_jpa_demo.filter
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA -
 */
@Configuration
public class DruidConfiguration {
    @Bean
    public ServletRegistrationBean druidStatViewServle(){
        //ServletRegistrationBean提供类的进行注册
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //添加初始化参数：initparams
        //白名单：
        servletRegistrationBean.addInitParameter("allow" ,"127.0.0.1");
        //IP黑名单
        //如果满足deny，就提示Sorry，you are not permitted to view this page.servletRegistrationBean
        //登录查看信息的账号和密码
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        //是否能够重置数据
        servletRegistrationBean.addInitParameter("resetEnable","false");

        return servletRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean druidStatFilter(){
        FilterRegistrationBean filterRegistrationBean =
                new FilterRegistrationBean(new WebdavFixFilter());
        //添加过滤规则
        filterRegistrationBean.addUrlPatterns("/*");
        //添加需要忽略的格式信息
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
