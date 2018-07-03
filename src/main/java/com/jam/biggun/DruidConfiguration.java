package com.jam.biggun;

//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DruidConfiguration {
//
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druid(){
//        return new DruidDataSource();
//    }
//
//
//    @Bean
//    public ServletRegistrationBean statViewServlet() {
//        //创建servlet注册实体
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/");
//        //设置IP白名单
//        servletRegistrationBean.addInitParameter("allow", "127.0.0.1");
//        //设置IP黑名单，如果如果 allow 与 deny 共同存在时， deny 优先于 allow
//        servletRegistrationBean.addInitParameter("deny", "192.168.0.19");
//        //设置控制台管理用户
//        servletRegistrationBean.addInitParameter("loginUsername", "druid");
//        //是否可以重置数据
//        servletRegistrationBean.addInitParameter("resetEnable", "false");
//        return servletRegistrationBean;
//    }
//
//
//    @Bean
//    public FilterRegistrationBean statFilter() {
//        //创建过滤器
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//        //设置过滤器过滤路径
//        filterRegistrationBean.addUrlPatterns("/");
//        //忽略过滤的形式
//        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.icon,/druid/*");
//        return filterRegistrationBean;
//    }
//
//}
