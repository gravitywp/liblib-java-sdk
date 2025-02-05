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
import cloud.liblibai.openapi.client.model.AuditStatus;
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
 * ComfyStatusResponseDataVideosInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:10:08.947334966+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ComfyStatusResponseDataVideosInner {
  public static final String SERIALIZED_NAME_VIDEO_URL = "videoUrl";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  @javax.annotation.Nullable
  private String videoUrl;

  public static final String SERIALIZED_NAME_COVER_PATH = "coverPath";
  @SerializedName(SERIALIZED_NAME_COVER_PATH)
  @javax.annotation.Nullable
  private String coverPath;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  @javax.annotation.Nullable
  private String nodeId;

  public static final String SERIALIZED_NAME_OUTPUT_NAME = "outputName";
  @SerializedName(SERIALIZED_NAME_OUTPUT_NAME)
  @javax.annotation.Nullable
  private String outputName;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "auditStatus";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  @javax.annotation.Nullable
  private AuditStatus auditStatus;

  public ComfyStatusResponseDataVideosInner() {
  }

  public ComfyStatusResponseDataVideosInner videoUrl(@javax.annotation.Nullable String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * 视频地址，可直接访问，地址有时效性：7天
   * @return videoUrl
   */
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(@javax.annotation.Nullable String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public ComfyStatusResponseDataVideosInner coverPath(@javax.annotation.Nullable String coverPath) {
    this.coverPath = coverPath;
    return this;
  }

  /**
   * 视频封面地址
   * @return coverPath
   */
  @javax.annotation.Nullable
  public String getCoverPath() {
    return coverPath;
  }

  public void setCoverPath(@javax.annotation.Nullable String coverPath) {
    this.coverPath = coverPath;
  }


  public ComfyStatusResponseDataVideosInner nodeId(@javax.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * 输出视频的节点ID
   * @return nodeId
   */
  @javax.annotation.Nullable
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(@javax.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
  }


  public ComfyStatusResponseDataVideosInner outputName(@javax.annotation.Nullable String outputName) {
    this.outputName = outputName;
    return this;
  }

  /**
   * 输出视频的节点名称
   * @return outputName
   */
  @javax.annotation.Nullable
  public String getOutputName() {
    return outputName;
  }

  public void setOutputName(@javax.annotation.Nullable String outputName) {
    this.outputName = outputName;
  }


  public ComfyStatusResponseDataVideosInner auditStatus(@javax.annotation.Nullable AuditStatus auditStatus) {
    this.auditStatus = auditStatus;
    return this;
  }

  /**
   * Get auditStatus
   * @return auditStatus
   */
  @javax.annotation.Nullable
  public AuditStatus getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(@javax.annotation.Nullable AuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComfyStatusResponseDataVideosInner comfyStatusResponseDataVideosInner = (ComfyStatusResponseDataVideosInner) o;
    return Objects.equals(this.videoUrl, comfyStatusResponseDataVideosInner.videoUrl) &&
        Objects.equals(this.coverPath, comfyStatusResponseDataVideosInner.coverPath) &&
        Objects.equals(this.nodeId, comfyStatusResponseDataVideosInner.nodeId) &&
        Objects.equals(this.outputName, comfyStatusResponseDataVideosInner.outputName) &&
        Objects.equals(this.auditStatus, comfyStatusResponseDataVideosInner.auditStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, coverPath, nodeId, outputName, auditStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComfyStatusResponseDataVideosInner {\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    coverPath: ").append(toIndentedString(coverPath)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
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
    openapiFields.add("videoUrl");
    openapiFields.add("coverPath");
    openapiFields.add("nodeId");
    openapiFields.add("outputName");
    openapiFields.add("auditStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ComfyStatusResponseDataVideosInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComfyStatusResponseDataVideosInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComfyStatusResponseDataVideosInner is not found in the empty JSON string", ComfyStatusResponseDataVideosInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ComfyStatusResponseDataVideosInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComfyStatusResponseDataVideosInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("videoUrl") != null && !jsonObj.get("videoUrl").isJsonNull()) && !jsonObj.get("videoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("videoUrl").toString()));
      }
      if ((jsonObj.get("coverPath") != null && !jsonObj.get("coverPath").isJsonNull()) && !jsonObj.get("coverPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("coverPath").toString()));
      }
      if ((jsonObj.get("nodeId") != null && !jsonObj.get("nodeId").isJsonNull()) && !jsonObj.get("nodeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeId").toString()));
      }
      if ((jsonObj.get("outputName") != null && !jsonObj.get("outputName").isJsonNull()) && !jsonObj.get("outputName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputName").toString()));
      }
      // validate the optional field `auditStatus`
      if (jsonObj.get("auditStatus") != null && !jsonObj.get("auditStatus").isJsonNull()) {
        AuditStatus.validateJsonElement(jsonObj.get("auditStatus"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComfyStatusResponseDataVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComfyStatusResponseDataVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComfyStatusResponseDataVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComfyStatusResponseDataVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ComfyStatusResponseDataVideosInner>() {
           @Override
           public void write(JsonWriter out, ComfyStatusResponseDataVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComfyStatusResponseDataVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ComfyStatusResponseDataVideosInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ComfyStatusResponseDataVideosInner
   * @throws IOException if the JSON string is invalid with respect to ComfyStatusResponseDataVideosInner
   */
  public static ComfyStatusResponseDataVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComfyStatusResponseDataVideosInner.class);
  }

  /**
   * Convert an instance of ComfyStatusResponseDataVideosInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

