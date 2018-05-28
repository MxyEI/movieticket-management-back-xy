# movieticket-management-back-xy
后端API


当将多个spring boot项目部署到同一个tomcat里面时，启动会报错。

解决办法：

在application.properties文件里面加上spring.jmx.default-domain=项目标识。