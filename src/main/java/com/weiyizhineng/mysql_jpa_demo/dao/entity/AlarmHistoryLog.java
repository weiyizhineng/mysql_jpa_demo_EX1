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
@Table ( name ="alarm_history_log" , schema = "")
public class AlarmHistoryLog  implements Serializable {

	private static final long serialVersionUID =  3958218823032157436L;

	/**
	 * 乐观锁
	 */
   	@Column(name = "REVISION" )
	private Long revision;

	/**
	 * 创建人
	 */
   	@Column(name = "CREATED_BY" )
	private String createdBy;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATED_TIME" )
	private Date createdTime;

	/**
	 * 更新人
	 */
   	@Column(name = "UPDATED_BY" )
	private String updatedBy;

	/**
	 * 更新时间
	 */
   	@Column(name = "UPDATED_TIME" )
	private Date updatedTime;

	/**
	 * 序号
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   	@Column(name = "id" )
	private Long id;

	/**
	 * 设备名
	 */
   	@Column(name = "device_name" )
	private String deviceName;

	/**
	 * 报警时温度值
	 */
   	@Column(name = "alarm_temprature" )
	private Double alarmTemprature;

	/**
	 * 报警时温度阀值
	 */
   	@Column(name = "temp_threshold" )
	private Double tempThreshold;

	/**
	 * 创建时间
	 */
   	@Column(name = "gmt_create" )
	private Date gmtCreate;

	public Long getRevision() {
		return this.revision;
	}

	public void setRevision(Long revision) {
		this.revision = revision;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Double getAlarmTemprature() {
		return this.alarmTemprature;
	}

	public void setAlarmTemprature(Double alarmTemprature) {
		this.alarmTemprature = alarmTemprature;
	}

	public Double getTempThreshold() {
		return this.tempThreshold;
	}

	public void setTempThreshold(Double tempThreshold) {
		this.tempThreshold = tempThreshold;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"revision='" + revision + '\'' +
				"createdBy='" + createdBy + '\'' +
				"createdTime='" + createdTime + '\'' +
				"updatedBy='" + updatedBy + '\'' +
				"updatedTime='" + updatedTime + '\'' +
				"id='" + id + '\'' +
				"deviceName='" + deviceName + '\'' +
				"alarmTemprature='" + alarmTemprature + '\'' +
				"tempThreshold='" + tempThreshold + '\'' +
				"gmtCreate='" + gmtCreate + '\'' +
				'}';
	}

}
