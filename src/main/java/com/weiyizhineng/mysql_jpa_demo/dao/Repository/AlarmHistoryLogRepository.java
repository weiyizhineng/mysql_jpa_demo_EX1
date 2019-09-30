package com.weiyizhineng.mysql_jpa_demo.dao.Repository;

import com.weiyizhineng.mysql_jpa_demo.dao.entity.AlarmHistoryLog;
import org.springframework.data.repository.CrudRepository;

/**
 * @作者： WEIYI
 * @创建时间： 2019/9/30 14:30
 * @包名： com.weiyizhineng.mysql_jpa_demo.dao.Repository
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA
 */
public interface AlarmHistoryLogRepository  extends CrudRepository<AlarmHistoryLog,Long> {
}
