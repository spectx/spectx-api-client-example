/*
 * SpectX API
 * SpectX REST API description
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@spectx.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.spectx.apiClientExample.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets state
 */
public enum State {
  
  NEW("NEW"),
  
  QUEUED("QUEUED"),
  
  SCHEDULED("SCHEDULED"),
  
  RUNNING("RUNNING"),
  
  CANCELLING("CANCELLING"),
  
  FAILED("FAILED"),
  
  CANCELLED("CANCELLED"),
  
  SUCCEEDED("SUCCEEDED");

  private String value;

  State(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static State fromValue(String text) {
    for (State b : State.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
