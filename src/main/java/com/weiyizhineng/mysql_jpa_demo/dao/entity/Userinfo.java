package com.weiyizhineng.mysql_jpa_demo.dao.entity;


import javax.persistence.*;

@Entity
public class Userinfo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String numberofuser;
  private String password;
  private String imagefile;
  private String ranklevle;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getNumberOfUser() {
    return numberofuser;
  }

  public void setNumberOfUser(String numberOfUser) {
    this.numberofuser = numberOfUser;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getImageFile() {
    return imagefile;
  }

  public void setImageFile(String imageFile) {
    this.imagefile = imageFile;
  }


  public String getRankLevle() {
    return ranklevle;
  }

  public void setRankLevle(String rankLevle) {
    this.ranklevle = rankLevle;
  }

}
