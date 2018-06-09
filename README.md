## 1、swagger2
- 加2个包、添加配置文件
- 访问的url: http://localhost:8080/swagger-ui.html

## 2、实现热部署
- 添加包、打包配置、修改ide配置

## 3、集成mybatis

#### 1、准备工作
- 添加mybatis和mysql的包

#### 2、注解版
- 在mapper接口上使用注解
- 添加扫描mapper接口

#### 3、xml版本
- 如果mapper与mapper.xml(放在resources)不在同一个文件时，需要配置.xml的路径(application.yml)
- 如果他们在同一个文件，需要pom.xml打包配置resources，包含资源文件.

## 4、使用log4j2记录日志
- 高版本的springboot不在支持log4j的框架，改支持log4j2
- 新的log4j2配置

## 5、整合druid
- 添加Druid库
- 加DruidConfigure和application.yml中
- 访问的url：http://localhost:8080/druid/

## 6、使用AOP统一处理Web请求日志
- 添加aop依赖包
- 添加一个切面类

## 7、集成mybatis-plus

## 8、集成异常处理
- 使用@ControllerAdvice 拦截异常并统一处理
- 添加一个异常拦截类，采用上面注解

## 9、集成shiro
- 添加包依赖
- 配置ShiroConfig
- https://blog.csdn.net/ityouknow/article/details/73836159

## 10、集成spring-data-jpa
- 添加包依赖
- 在application.yml 里配置
- 整合文档  https://blog.csdn./hkhhkb/article/details/79789869
- 多条件查询 https://www.cnblogs.com/arrrrrya/p/7865090.html
## 10.1 问题
- 多对一等关系时，fastjson序列化会产生死循环(@JsonIdentityInfo 解决)

## 11. 集成jwt认证
## 参考
- all: http://blog.didispace.com/Spring-Boot%E5%9F%BA%E7%A1%80%E6%95%99%E7%A8%8B/
- druid: https://segmentfault.com/a/1190000009132815