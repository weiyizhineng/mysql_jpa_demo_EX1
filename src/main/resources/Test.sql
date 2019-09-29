#连接数据库testsystem，使用北京东八时区
spring.datasource.url=jdbc:mysql://localhost:3306/testsystem?serverTimezone=GMT%2B8
spring.datasource.username=root
spring.datasource.password=0414


CREATE TABLE user(
    REVISION INT   DEFAULT 0 COMMENT '乐观锁' ,
    CREATED_BY VARCHAR(32)   DEFAULT null COMMENT '创建人' ,
    CREATED_TIME DATETIME   DEFAULT null COMMENT '创建时间' ,
    UPDATED_BY VARCHAR(32)   DEFAULT null COMMENT '更新人' ,
    UPDATED_TIME DATETIME   DEFAULT null COMMENT '更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT 'ID' ,
    name VARCHAR(128)   DEFAULT null COMMENT '姓名' ,
    email VARCHAR(128)   DEFAULT null COMMENT '电子邮箱' ,
    PRIMARY KEY (id)
) COMMENT = ' ';/*SQL@Run*/