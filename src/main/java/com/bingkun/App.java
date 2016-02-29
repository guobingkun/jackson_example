package com.bingkun;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.IOException;

public class App
{
  public static void main(String[] args)
  {
    ObjectMapper mapper = new ObjectMapper();
//    SimpleModule sm = new SimpleModule("test");
//    sm.registerSubtypes(new NamedType(Bingkun.class, "id"));
//    mapper.registerModule(sm);
    String jsonString = "{\"type\":\"ddd\"}";
    System.out.println(jsonString);

    try {
      User user = mapper.readValue(jsonString, User.class);
      //UserMap userMap = mapper.readValue(jsonString, UserMap.class);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}
