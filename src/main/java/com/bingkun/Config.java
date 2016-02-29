package com.bingkun;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by guobingkun on 8/26/15.
 */
public class Config
{
  private static final int DEFAULT_ROW_FLUSH_BOUNDARY = 80000;

  private final String version;
  private final int rowFlushBoundary;

  public Config(@JsonProperty("version") String version, @JsonProperty("maxRowsInMemory") Integer maxRowsInMemory)
  {
    this.version = version;
    this.rowFlushBoundary = maxRowsInMemory == null ? DEFAULT_ROW_FLUSH_BOUNDARY : maxRowsInMemory;
  }

  @JsonProperty
  public String getVersion()
  {
    return version;
  }

  @JsonProperty
  public int getRowFlushBoundary()
  {
    return rowFlushBoundary;
  }

  public static void main(String[] args) throws IOException
  {
    ObjectMapper mapper = new ObjectMapper();
    String jsonString = "{\n"
                        + "\"version\": \"123\",\n"
                        + "\"rowFlushBoundary\":12345\n"
                        + "}";
    String jsonString2 = "{\n"
                        + "\"version\": \"321\",\n"
                        + "\"maxRowsInMemory\":54321\n"
                        + "}";
    Config config = mapper.readValue(jsonString, Config.class);
    System.out.println(mapper.writeValueAsString(config));
    Config config2 = mapper.readValue(jsonString2, Config.class);
    System.out.println(mapper.writeValueAsString(config2));

  }
}
