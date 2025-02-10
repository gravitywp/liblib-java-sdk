/*
 * LiblibAI API
 * LiblibAI x 星流 图像大模型API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cloud.liblibai.openapi.client.model;

import java.util.Objects;
import cloud.liblibai.openapi.client.model.SubmitComfyResponseData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cloud.liblibai.openapi.client.JSON;

/**
 * SubmitComfyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-10T14:14:37.540292979+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class SubmitComfyResponse {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  @javax.annotation.Nullable
  private Integer code;

  public static final String SERIALIZED_NAME_MSG = "msg";
  @SerializedName(SERIALIZED_NAME_MSG)
  @javax.annotation.Nullable
  private String msg;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  @javax.annotation.Nullable
  private SubmitComfyResponseData data;

  public SubmitComfyResponse() {
  }

  public SubmitComfyResponse code(@javax.annotation.Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @javax.annotation.Nullable
  public Integer getCode() {
    return code;
  }

  public void setCode(@javax.annotation.Nullable Integer code) {
    this.code = code;
  }


  public SubmitComfyResponse msg(@javax.annotation.Nullable String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * Get msg
   * @return msg
   */
  @javax.annotation.Nullable
  public String getMsg() {
    return msg;
  }

  public void setMsg(@javax.annotation.Nullable String msg) {
    this.msg = msg;
  }


  public SubmitComfyResponse data(@javax.annotation.Nullable SubmitComfyResponseData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @javax.annotation.Nullable
  public SubmitComfyResponseData getData() {
    return data;
  }

  public void setData(@javax.annotation.Nullable SubmitComfyResponseData data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitComfyResponse submitComfyResponse = (SubmitComfyResponse) o;
    return Objects.equals(this.code, submitComfyResponse.code) &&
        Objects.equals(this.msg, submitComfyResponse.msg) &&
        Objects.equals(this.data, submitComfyResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitComfyResponse {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("code");
    openapiFields.add("msg");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitComfyResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitComfyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitComfyResponse is not found in the empty JSON string", SubmitComfyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitComfyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitComfyResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonNull()) && !jsonObj.get("msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg").toString()));
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        SubmitComfyResponseData.validateJsonElement(jsonObj.get("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitComfyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitComfyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitComfyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitComfyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitComfyResponse>() {
           @Override
           public void write(JsonWriter out, SubmitComfyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitComfyResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitComfyResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitComfyResponse
   * @throws IOException if the JSON string is invalid with respect to SubmitComfyResponse
   */
  public static SubmitComfyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitComfyResponse.class);
  }

  /**
   * Convert an instance of SubmitComfyResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

