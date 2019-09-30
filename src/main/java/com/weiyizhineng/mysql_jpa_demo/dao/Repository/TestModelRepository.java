package com.weiyizhineng.mysql_jpa_demo.dao.Repository;

import com.weiyizhineng.mysql_jpa_demo.dao.entity.TestModel;
import org.springframework.data.repository.CrudRepository;

/**
 * @作者： WEIYI
 * @创建时间： 2019/9/30 9:49
 * @包名： com.weiyizhineng.mysql_jpa_demo.dao.Repository
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA
 */
public interface TestModelRepository  extends CrudRepository<TestModel,Long> {

}
