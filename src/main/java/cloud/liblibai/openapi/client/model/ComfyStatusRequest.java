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
 * ComfyStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T14:39:32.920896149+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ComfyStatusRequest {
  public static final String SERIALIZED_NAME_GENERATE_UUID = "generateUuid";
  @SerializedName(SERIALIZED_NAME_GENERATE_UUID)
  @javax.annotation.Nonnull
  private String generateUuid;

  public ComfyStatusRequest() {
  }

  public ComfyStatusRequest generateUuid(@javax.annotation.Nonnull String generateUuid) {
    this.generateUuid = generateUuid;
    return this;
  }

  /**
   * 生图任务uuid，发起生图任务时返回该字段
   * @return generateUuid
   */
  @javax.annotation.Nonnull
  public String getGenerateUuid() {
    return generateUuid;
  }

  public void setGenerateUuid(@javax.annotation.Nonnull String generateUuid) {
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
    ComfyStatusRequest comfyStatusRequest = (ComfyStatusRequest) o;
    return Objects.equals(this.generateUuid, comfyStatusRequest.generateUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComfyStatusRequest {\n");
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
    openapiRequiredFields.add("generateUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ComfyStatusRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComfyStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComfyStatusRequest is not found in the empty JSON string", ComfyStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ComfyStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComfyStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ComfyStatusRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("generateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComfyStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComfyStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComfyStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComfyStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ComfyStatusRequest>() {
           @Override
           public void write(JsonWriter out, ComfyStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComfyStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ComfyStatusRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ComfyStatusRequest
   * @throws IOException if the JSON string is invalid with respect to ComfyStatusRequest
   */
  public static ComfyStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComfyStatusRequest.class);
  }

  /**
   * Convert an instance of ComfyStatusRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

