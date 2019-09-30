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
@Table ( name ="device_info" , schema = "")
public class DeviceInfo  implements Serializable {

	private static final long serialVersionUID =  4955524140422080364L;

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
	 * 当前温度值
	 */
   	@Column(name = "current_temprature" )
	private Double currentTemprature;

	/**
	 * 当前湿度值
	 */
   	@Column(name = "current_humidity" )
	private Double currentHumidity;

	/**
	 * 温度报警阀值
	 */
   	@Column(name = "temp_threshold" )
	private Double tempThreshold;

	/**
	 * 报警状态
	 */
   	@Column(name = "Alarm_Status" )
	private String alarmStatus;

	/**
	 * 最后一次报警时间
	 */
   	@Column(name = "last_alarm_date" )
	private Date lastAlarmDate;

	/**
	 * 最近一次上线时间
	 */
   	@Column(name = "last_online_date" )
	private Date lastOnlineDate;

	/**
	 * 在线时间
	 */
   	@Column(name = "Connect_status" )
	private String connectStatus;

	/**
	 * 刷新时间
	 */
   	@Column(name = "gmt_update" )
	private String gmtUpdate;

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

	public Double getCurrentTemprature() {
		return this.currentTemprature;
	}

	public void setCurrentTemprature(Double currentTemprature) {
		this.currentTemprature = currentTemprature;
	}

	public Double getCurrentHumidity() {
		return this.currentHumidity;
	}

	public void setCurrentHumidity(Double currentHumidity) {
		this.currentHumidity = currentHumidity;
	}

	public Double getTempThreshold() {
		return this.tempThreshold;
	}

	public void setTempThreshold(Double tempThreshold) {
		this.tempThreshold = tempThreshold;
	}

	public String getAlarmStatus() {
		return this.alarmStatus;
	}

	public void setAlarmStatus(String alarmStatus) {
		this.alarmStatus = alarmStatus;
	}

	public Date getLastAlarmDate() {
		return this.lastAlarmDate;
	}

	public void setLastAlarmDate(Date lastAlarmDate) {
		this.lastAlarmDate = lastAlarmDate;
	}

	public Date getLastOnlineDate() {
		return this.lastOnlineDate;
	}

	public void setLastOnlineDate(Date lastOnlineDate) {
		this.lastOnlineDate = lastOnlineDate;
	}

	public String getConnectStatus() {
		return this.connectStatus;
	}

	public void setConnectStatus(String connectStatus) {
		this.connectStatus = connectStatus;
	}

	public String getGmtUpdate() {
		return this.gmtUpdate;
	}

	public void setGmtUpdate(String gmtUpdate) {
		this.gmtUpdate = gmtUpdate;
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
				"currentTemprature='" + currentTemprature + '\'' +
				"currentHumidity='" + currentHumidity + '\'' +
				"tempThreshold='" + tempThreshold + '\'' +
				"alarmStatus='" + alarmStatus + '\'' +
				"lastAlarmDate='" + lastAlarmDate + '\'' +
				"lastOnlineDate='" + lastOnlineDate + '\'' +
				"connectStatus='" + connectStatus + '\'' +
				"gmtUpdate='" + gmtUpdate + '\'' +
				'}';
	}

}
