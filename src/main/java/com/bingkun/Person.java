package com.bingkun;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, property="type", defaultImpl = Bingkun.class)
@JsonSubTypes(value={
    @JsonSubTypes.Type(name="default", value=Bingkun.class),
})
public interface Person
{
  public String getIdentity();
}
