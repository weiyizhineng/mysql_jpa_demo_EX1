package com.weiyizhineng.mysql_jpa_demo.dao.Repository;

import com.weiyizhineng.mysql_jpa_demo.dao.entity.DeviceInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @作者： WEIYI
 * @创建时间： 2019/9/30 14:31
 * @包名： com.weiyizhineng.mysql_jpa_demo.dao.Repository
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA
 */
public interface DeviceInfoRepository  extends CrudRepository<DeviceInfo,Long> {
}
