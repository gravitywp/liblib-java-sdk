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


package org.liblib.openapi.client.model;

import java.util.Objects;
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

import org.liblib.openapi.client.JSON;

/**
 * SubmitResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T17:23:45.937473883+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class SubmitResponseData {
  public static final String SERIALIZED_NAME_GENERATE_UUID = "generateUuid";
  @SerializedName(SERIALIZED_NAME_GENERATE_UUID)
  @javax.annotation.Nullable
  private String generateUuid;

  public SubmitResponseData() {
  }

  public SubmitResponseData generateUuid(@javax.annotation.Nullable String generateUuid) {
    this.generateUuid = generateUuid;
    return this;
  }

  /**
   * 生图任务uuid，使用该uuid查询生图进度
   * @return generateUuid
   */
  @javax.annotation.Nullable
  public String getGenerateUuid() {
    return generateUuid;
  }

  public void setGenerateUuid(@javax.annotation.Nullable String generateUuid) {
    this.generateUuid = generateUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitResponseData submitResponseData = (SubmitResponseData) o;
    return Objects.equals(this.generateUuid, submitResponseData.generateUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitResponseData {\n");
    sb.append("    generateUuid: ").append(toIndentedString(generateUuid)).append("\n");
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
    openapiFields.add("generateUuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitResponseData is not found in the empty JSON string", SubmitResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("generateUuid") != null && !jsonObj.get("generateUuid").isJsonNull()) && !jsonObj.get("generateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitResponseData>() {
           @Override
           public void write(JsonWriter out, SubmitResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitResponseData
   * @throws IOException if the JSON string is invalid with respect to SubmitResponseData
   */
  public static SubmitResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitResponseData.class);
  }

  /**
   * Convert an instance of SubmitResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

