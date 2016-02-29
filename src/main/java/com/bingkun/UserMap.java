package com.bingkun;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by guobingkun on 2/8/15.
 */
public class UserMap
{

  @JsonProperty(value = "user")
  private Map<String, String> userMapper;

  public Map<String, String> getUserMapper()
  {
    return userMapper;
  }

  @Override
  public String toString()
  {
    return "UserMap{" +
           "userMapper=" + userMapper +
           '}';
  }
}
