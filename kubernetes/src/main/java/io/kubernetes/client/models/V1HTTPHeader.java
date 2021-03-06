/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * HTTPHeader describes a custom header to be used in HTTP probes
 */
@ApiModel(description = "HTTPHeader describes a custom header to be used in HTTP probes")

public class V1HTTPHeader {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public V1HTTPHeader name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The header field name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The header field name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public V1HTTPHeader value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The header field value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The header field value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HTTPHeader v1HTTPHeader = (V1HTTPHeader) o;
    return Objects.equals(this.name, v1HTTPHeader.name) &&
        Objects.equals(this.value, v1HTTPHeader.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HTTPHeader {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

