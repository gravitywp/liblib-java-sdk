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
 * NodeImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-10T14:14:37.540292979+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class NodeImage {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "auditStatus";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  @javax.annotation.Nullable
  private AuditStatus auditStatus;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  @javax.annotation.Nullable
  private String imageUrl;

  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  @javax.annotation.Nullable
  private String nodeId;

  public static final String SERIALIZED_NAME_OUTPUT_NAME = "outputName";
  @SerializedName(SERIALIZED_NAME_OUTPUT_NAME)
  @javax.annotation.Nullable
  private String outputName;

  public NodeImage() {
  }

  public NodeImage auditStatus(@javax.annotation.Nullable AuditStatus auditStatus) {
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


  public NodeImage imageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * 图片地址，可直接访问，地址有时效性：7天
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(@javax.annotation.Nullable String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public NodeImage nodeId(@javax.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

  /**
   * 输出图片的节点ID
   * @return nodeId
   */
  @javax.annotation.Nullable
  public String getNodeId() {
    return nodeId;
  }

  public void setNodeId(@javax.annotation.Nullable String nodeId) {
    this.nodeId = nodeId;
  }


  public NodeImage outputName(@javax.annotation.Nullable String outputName) {
    this.outputName = outputName;
    return this;
  }

  /**
   * 输出图片的节点名称
   * @return outputName
   */
  @javax.annotation.Nullable
  public String getOutputName() {
    return outputName;
  }

  public void setOutputName(@javax.annotation.Nullable String outputName) {
    this.outputName = outputName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeImage nodeImage = (NodeImage) o;
    return Objects.equals(this.auditStatus, nodeImage.auditStatus) &&
        Objects.equals(this.imageUrl, nodeImage.imageUrl) &&
        Objects.equals(this.nodeId, nodeImage.nodeId) &&
        Objects.equals(this.outputName, nodeImage.outputName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, imageUrl, nodeId, outputName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeImage {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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
    openapiFields.add("auditStatus");
    openapiFields.add("imageUrl");
    openapiFields.add("nodeId");
    openapiFields.add("outputName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NodeImage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NodeImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NodeImage is not found in the empty JSON string", NodeImage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NodeImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NodeImage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `auditStatus`
      if (jsonObj.get("auditStatus") != null && !jsonObj.get("auditStatus").isJsonNull()) {
        AuditStatus.validateJsonElement(jsonObj.get("auditStatus"));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("nodeId") != null && !jsonObj.get("nodeId").isJsonNull()) && !jsonObj.get("nodeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nodeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nodeId").toString()));
      }
      if ((jsonObj.get("outputName") != null && !jsonObj.get("outputName").isJsonNull()) && !jsonObj.get("outputName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outputName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outputName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NodeImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NodeImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NodeImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NodeImage.class));

       return (TypeAdapter<T>) new TypeAdapter<NodeImage>() {
           @Override
           public void write(JsonWriter out, NodeImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NodeImage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NodeImage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NodeImage
   * @throws IOException if the JSON string is invalid with respect to NodeImage
   */
  public static NodeImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NodeImage.class);
  }

  /**
   * Convert an instance of NodeImage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

