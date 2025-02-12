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
 * GetModelVersionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:18:25.814917097+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class GetModelVersionRequest {
  public static final String SERIALIZED_NAME_VERSION_UUID = "versionUuid";
  @SerializedName(SERIALIZED_NAME_VERSION_UUID)
  @javax.annotation.Nonnull
  private String versionUuid;

  public GetModelVersionRequest() {
  }

  public GetModelVersionRequest versionUuid(@javax.annotation.Nonnull String versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

  /**
   * 要查询的模型版本uuid
   * @return versionUuid
   */
  @javax.annotation.Nonnull
  public String getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(@javax.annotation.Nonnull String versionUuid) {
    this.versionUuid = versionUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetModelVersionRequest getModelVersionRequest = (GetModelVersionRequest) o;
    return Objects.equals(this.versionUuid, getModelVersionRequest.versionUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetModelVersionRequest {\n");
    sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
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
    openapiFields.add("versionUuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("versionUuid");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetModelVersionRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetModelVersionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetModelVersionRequest is not found in the empty JSON string", GetModelVersionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetModelVersionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetModelVersionRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetModelVersionRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("versionUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `versionUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("versionUuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetModelVersionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetModelVersionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetModelVersionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetModelVersionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<GetModelVersionRequest>() {
           @Override
           public void write(JsonWriter out, GetModelVersionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetModelVersionRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetModelVersionRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetModelVersionRequest
   * @throws IOException if the JSON string is invalid with respect to GetModelVersionRequest
   */
  public static GetModelVersionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetModelVersionRequest.class);
  }

  /**
   * Convert an instance of GetModelVersionRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

