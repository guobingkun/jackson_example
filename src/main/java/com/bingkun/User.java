package com.bingkun;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User
{

  @JsonProperty(value = "type")
  private Person name;
//
//  @JsonProperty(value = "userAge")
//  private Integer age;
//
//  @JsonProperty(value = "userHeight")
//  private Double height;
//
//  @JsonProperty(value = "isUserMarried")
//  private Boolean married;
//
//  public Boolean getMarried()
//  {
//    return married;
//  }
//
//  public void setMarried(Boolean married)
//  {
//    this.married = married;
//  }
//
//  public Double getHeight()
//  {
//    return height;
//  }
//
//  public void setHeight(Double height)
//  {
//    this.height = height;
//  }
//
//  public Integer getAge()
//  {
//    return age;
//  }
//
//  public void setAge(Integer age)
//  {
//    this.age = age;
//  }
//
//  public Bingkun getName()
//  {
//    return name;
//  }
//
//  @Override
//  public String toString()
//  {
//    return "User{" +
//           "name='" + name + '\'' +
//           ", age=" + age +
//           ", height=" + height +
//           ", married=" + married +
//           '}';
//  }
}
