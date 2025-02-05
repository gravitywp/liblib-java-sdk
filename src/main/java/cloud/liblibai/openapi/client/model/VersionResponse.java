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
 * VersionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T17:51:55.821090821+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class VersionResponse {
  public static final String SERIALIZED_NAME_VERSION_UUID = "version_uuid";
  @SerializedName(SERIALIZED_NAME_VERSION_UUID)
  @javax.annotation.Nullable
  private String versionUuid;

  public static final String SERIALIZED_NAME_MODEL_NAME = "model_name";
  @SerializedName(SERIALIZED_NAME_MODEL_NAME)
  @javax.annotation.Nullable
  private String modelName;

  public static final String SERIALIZED_NAME_VERSION_NAME = "version_name";
  @SerializedName(SERIALIZED_NAME_VERSION_NAME)
  @javax.annotation.Nullable
  private String versionName;

  public static final String SERIALIZED_NAME_BASE_ALGO = "baseAlgo";
  @SerializedName(SERIALIZED_NAME_BASE_ALGO)
  @javax.annotation.Nullable
  private String baseAlgo;

  public static final String SERIALIZED_NAME_SHOW_TYPE = "show_type";
  @SerializedName(SERIALIZED_NAME_SHOW_TYPE)
  @javax.annotation.Nullable
  private String showType;

  public static final String SERIALIZED_NAME_COMMERCIAL_USE = "commercial_use";
  @SerializedName(SERIALIZED_NAME_COMMERCIAL_USE)
  @javax.annotation.Nullable
  private String commercialUse;

  public static final String SERIALIZED_NAME_MODEL_URL = "model_url";
  @SerializedName(SERIALIZED_NAME_MODEL_URL)
  @javax.annotation.Nullable
  private String modelUrl;

  public VersionResponse() {
  }

  public VersionResponse versionUuid(@javax.annotation.Nullable String versionUuid) {
    this.versionUuid = versionUuid;
    return this;
  }

  /**
   * LiblibAI官网模型链接后缀
   * @return versionUuid
   */
  @javax.annotation.Nullable
  public String getVersionUuid() {
    return versionUuid;
  }

  public void setVersionUuid(@javax.annotation.Nullable String versionUuid) {
    this.versionUuid = versionUuid;
  }


  public VersionResponse modelName(@javax.annotation.Nullable String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * 模型名称
   * @return modelName
   */
  @javax.annotation.Nullable
  public String getModelName() {
    return modelName;
  }

  public void setModelName(@javax.annotation.Nullable String modelName) {
    this.modelName = modelName;
  }


  public VersionResponse versionName(@javax.annotation.Nullable String versionName) {
    this.versionName = versionName;
    return this;
  }

  /**
   * 版本名称
   * @return versionName
   */
  @javax.annotation.Nullable
  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(@javax.annotation.Nullable String versionName) {
    this.versionName = versionName;
  }


  public VersionResponse baseAlgo(@javax.annotation.Nullable String baseAlgo) {
    this.baseAlgo = baseAlgo;
    return this;
  }

  /**
   * 基础算法
   * @return baseAlgo
   */
  @javax.annotation.Nullable
  public String getBaseAlgo() {
    return baseAlgo;
  }

  public void setBaseAlgo(@javax.annotation.Nullable String baseAlgo) {
    this.baseAlgo = baseAlgo;
  }


  public VersionResponse showType(@javax.annotation.Nullable String showType) {
    this.showType = showType;
    return this;
  }

  /**
   * 公开可用的模型标识
   * @return showType
   */
  @javax.annotation.Nullable
  public String getShowType() {
    return showType;
  }

  public void setShowType(@javax.annotation.Nullable String showType) {
    this.showType = showType;
  }


  public VersionResponse commercialUse(@javax.annotation.Nullable String commercialUse) {
    this.commercialUse = commercialUse;
    return this;
  }

  /**
   * 可商用标识，可商用为1，不可商用为0
   * @return commercialUse
   */
  @javax.annotation.Nullable
  public String getCommercialUse() {
    return commercialUse;
  }

  public void setCommercialUse(@javax.annotation.Nullable String commercialUse) {
    this.commercialUse = commercialUse;
  }


  public VersionResponse modelUrl(@javax.annotation.Nullable String modelUrl) {
    this.modelUrl = modelUrl;
    return this;
  }

  /**
   * 模型链接
   * @return modelUrl
   */
  @javax.annotation.Nullable
  public String getModelUrl() {
    return modelUrl;
  }

  public void setModelUrl(@javax.annotation.Nullable String modelUrl) {
    this.modelUrl = modelUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionResponse versionResponse = (VersionResponse) o;
    return Objects.equals(this.versionUuid, versionResponse.versionUuid) &&
        Objects.equals(this.modelName, versionResponse.modelName) &&
        Objects.equals(this.versionName, versionResponse.versionName) &&
        Objects.equals(this.baseAlgo, versionResponse.baseAlgo) &&
        Objects.equals(this.showType, versionResponse.showType) &&
        Objects.equals(this.commercialUse, versionResponse.commercialUse) &&
        Objects.equals(this.modelUrl, versionResponse.modelUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versionUuid, modelName, versionName, baseAlgo, showType, commercialUse, modelUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionResponse {\n");
    sb.append("    versionUuid: ").append(toIndentedString(versionUuid)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
    sb.append("    baseAlgo: ").append(toIndentedString(baseAlgo)).append("\n");
    sb.append("    showType: ").append(toIndentedString(showType)).append("\n");
    sb.append("    commercialUse: ").append(toIndentedString(commercialUse)).append("\n");
    sb.append("    modelUrl: ").append(toIndentedString(modelUrl)).append("\n");
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
    openapiFields.add("version_uuid");
    openapiFields.add("model_name");
    openapiFields.add("version_name");
    openapiFields.add("baseAlgo");
    openapiFields.add("show_type");
    openapiFields.add("commercial_use");
    openapiFields.add("model_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to VersionResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!VersionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionResponse is not found in the empty JSON string", VersionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!VersionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("version_uuid") != null && !jsonObj.get("version_uuid").isJsonNull()) && !jsonObj.get("version_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_uuid").toString()));
      }
      if ((jsonObj.get("model_name") != null && !jsonObj.get("model_name").isJsonNull()) && !jsonObj.get("model_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_name").toString()));
      }
      if ((jsonObj.get("version_name") != null && !jsonObj.get("version_name").isJsonNull()) && !jsonObj.get("version_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version_name").toString()));
      }
      if ((jsonObj.get("baseAlgo") != null && !jsonObj.get("baseAlgo").isJsonNull()) && !jsonObj.get("baseAlgo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `baseAlgo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("baseAlgo").toString()));
      }
      if ((jsonObj.get("show_type") != null && !jsonObj.get("show_type").isJsonNull()) && !jsonObj.get("show_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `show_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("show_type").toString()));
      }
      if ((jsonObj.get("commercial_use") != null && !jsonObj.get("commercial_use").isJsonNull()) && !jsonObj.get("commercial_use").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commercial_use` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commercial_use").toString()));
      }
      if ((jsonObj.get("model_url") != null && !jsonObj.get("model_url").isJsonNull()) && !jsonObj.get("model_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionResponse>() {
           @Override
           public void write(JsonWriter out, VersionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of VersionResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of VersionResponse
   * @throws IOException if the JSON string is invalid with respect to VersionResponse
   */
  public static VersionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionResponse.class);
  }

  /**
   * Convert an instance of VersionResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

