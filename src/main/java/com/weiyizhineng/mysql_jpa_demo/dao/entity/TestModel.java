package com.weiyizhineng.mysql_jpa_demo.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  idea
 * @Date 2019-09-30 
 */

@Entity
@Table ( name ="test_model" , schema = "")
public class TestModel  implements Serializable {

	private static final long serialVersionUID =  1006283678284388194L;

	/**
	 * 序号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(name = "id" )
	private Long id;

	/**
	 * 姓名
	 */
   	@Column(name = "name" )
	private String name;

	/**
	 * 年龄
	 */
   	@Column(name = "age" )
	private Long age;

	/**
	 * 修改时间
	 */
   	@Column(name = "modify_time" )
	private Date modifyTime;

	/**
	 * 创建时间
	 */
   	@Column(name = "create_time" )
	private Date createTime;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"name='" + name + '\'' +
				"age='" + age + '\'' +
				"modifyTime='" + modifyTime + '\'' +
				"createTime='" + createTime + '\'' +
				'}';
	}

}
