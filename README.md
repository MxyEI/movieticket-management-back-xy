# movieticket-management-back-xy
后端API-影院订票系统 管理系统后台

将springboot项目打包为war包时需要在pom文件里移除自带的tomcat组件，然后在另写个类，指向到
原来的启动类

```
/*
springboot打包为war包
 */
public class SpringBootStartApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(Application.class);
    }
}
```

当将多个spring boot项目部署到同一个tomcat里面时，启动会报错。

解决办法：

在application.properties文件里面加上spring.jmx.default-domain=项目标识。