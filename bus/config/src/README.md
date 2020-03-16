参考教程：
https://liuyanzhao.com/9625.html


访问地址：

http://localhost:8020/config/config/dev


http://localhost:8020/config/config.properties



在config-client端中：
bootstrap.yml 配置文件加载先于 application.yml 配置文件
与 Spring Cloud Config 相关的属性必须配置在 bootstrap.yml 中

客户端引入的包是：
 <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-config</artifactId>
 </dependency>