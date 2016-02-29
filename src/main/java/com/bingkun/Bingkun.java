package com.bingkun;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.internal.NotNull;

public class Bingkun implements Person
{
  
  @NotNull
  @JsonProperty
  private final String id;
  
  @JsonCreator
  public Bingkun(String id)
  {
    System.out.println("Constructor called " + id);
    this.id = id;
  }

  @Override
  public String toString()
  {
    return "Bingkun{}";
  }

  @Override
  public String getIdentity()
  {
    return "Bingkun";
  }
}
