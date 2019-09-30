DROP TABLE user;/*SQL@Run*//*SkipError*/
CREATE TABLE user(
    REVISION INT   DEFAULT NULL COMMENT '乐观锁' ,
    CREATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '创建人' ,
    CREATED_TIME DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    UPDATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '更新人' ,
    UPDATED_TIME DATETIME   DEFAULT NULL COMMENT '更新时间' ,
    id MEDIUMINT NOT NULL AUTO_INCREMENT  COMMENT '序号' ,
    user_name VARCHAR(32)   DEFAULT NULL COMMENT '用户名' ,
    Password VARCHAR(32)   DEFAULT NULL COMMENT '密码' ,
    Level VARCHAR(32)   DEFAULT NULL COMMENT '权限' ,
    Position VARCHAR(32)   DEFAULT NULL COMMENT '职位' ,
    description VARCHAR(32)   DEFAULT NULL COMMENT '描述' ,
    Picture MEDIUMBLOB   DEFAULT NULL COMMENT '照片' ,
    other VARCHAR(1024)   DEFAULT NULL COMMENT '其他' ,
    PRIMARY KEY (id)
) COMMENT = '用户信息 用户信息表';/*SQL@Run*/
ALTER TABLE user COMMENT '用户信息';/*SQL@Run*/
DROP TABLE device_info;/*SQL@Run*//*SkipError*/
CREATE TABLE device_info(
    REVISION INT   DEFAULT NULL COMMENT '乐观锁' ,
    CREATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '创建人' ,
    CREATED_TIME DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    UPDATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '更新人' ,
    UPDATED_TIME DATETIME   DEFAULT NULL COMMENT '更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '序号' ,
    device_name VARCHAR(128)   DEFAULT NULL COMMENT '设备名' ,
    current_temprature DECIMAL(32,10)   DEFAULT NULL COMMENT '当前温度值' ,
    current_humidity DECIMAL(32,10)   DEFAULT NULL COMMENT '当前湿度值' ,
    temp_threshold DECIMAL(32,10)   DEFAULT NULL COMMENT '温度报警阀值' ,
    Alarm_Status VARCHAR(1)   DEFAULT NULL COMMENT '报警状态' ,
    last_alarm_date DATETIME   DEFAULT NULL COMMENT '最后一次报警时间' ,
    last_online_date DATETIME   DEFAULT NULL COMMENT '最近一次上线时间' ,
    Connect_status VARCHAR(64)   DEFAULT NULL COMMENT '在线时间' ,
    gmt_update VARCHAR(64)   DEFAULT NULL COMMENT '刷新时间' ,
    PRIMARY KEY (id)
) COMMENT = '设备信息表 ';/*SQL@Run*/
ALTER TABLE device_info COMMENT '设备信息表';/*SQL@Run*/
DROP TABLE alarm_history_log;/*SQL@Run*//*SkipError*/
CREATE TABLE alarm_history_log(
    REVISION INT   DEFAULT NULL COMMENT '乐观锁' ,
    CREATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '创建人' ,
    CREATED_TIME DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    UPDATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '更新人' ,
    UPDATED_TIME DATETIME   DEFAULT NULL COMMENT '更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '序号' ,
    device_name VARCHAR(128)   DEFAULT NULL COMMENT '设备名' ,
    alarm_temprature FLOAT   DEFAULT NULL COMMENT '报警时温度值' ,
    temp_threshold FLOAT   DEFAULT NULL COMMENT '报警时温度阀值' ,
    gmt_create DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    PRIMARY KEY (id)
) COMMENT = '报警历史信息表 ';/*SQL@Run*/
ALTER TABLE alarm_history_log COMMENT '报警历史信息表';/*SQL@Run*/
DROP TABLE device_prop_history_log;/*SQL@Run*//*SkipError*/
CREATE TABLE device_prop_history_log(
    REVISION INT   DEFAULT NULL COMMENT '乐观锁' ,
    CREATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '创建人' ,
    CREATED_TIME DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    UPDATED_BY VARCHAR(32)   DEFAULT NULL COMMENT '更新人' ,
    UPDATED_TIME DATETIME   DEFAULT NULL COMMENT '更新时间' ,
    id INT NOT NULL AUTO_INCREMENT  COMMENT '序号' ,
    device_name VARCHAR(128)   DEFAULT NULL COMMENT '设备名' ,
    current_tempratrue FLOAT   DEFAULT NULL COMMENT '当前温度值' ,
    current_humidity FLOAT   DEFAULT NULL COMMENT '当前湿度值' ,
    gmt_create DATETIME   DEFAULT NULL COMMENT '创建时间' ,
    PRIMARY KEY (id)
) COMMENT = '设备属性历史信息表 ';/*SQL@Run*/
ALTER TABLE device_prop_history_log COMMENT '设备属性历史信息表';/*SQL@Run*/
