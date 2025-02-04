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
 * Image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-04T15:57:44.740153093+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class Image {
  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  @javax.annotation.Nullable
  private String imageUrl;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  @javax.annotation.Nullable
  private Integer seed;

  public static final String SERIALIZED_NAME_AUDIT_STATUS = "auditStatus";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  @javax.annotation.Nullable
  private AuditStatus auditStatus;

  public Image() {
  }

  public Image imageUrl(@javax.annotation.Nullable String imageUrl) {
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


  public Image seed(@javax.annotation.Nullable Integer seed) {
    this.seed = seed;
    return this;
  }

  /**
   * 随机种子值
   * @return seed
   */
  @javax.annotation.Nullable
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(@javax.annotation.Nullable Integer seed) {
    this.seed = seed;
  }


  public Image auditStatus(@javax.annotation.Nullable AuditStatus auditStatus) {
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
    Image image = (Image) o;
    return Objects.equals(this.imageUrl, image.imageUrl) &&
        Objects.equals(this.seed, image.seed) &&
        Objects.equals(this.auditStatus, image.auditStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, seed, auditStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
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
    openapiFields.add("imageUrl");
    openapiFields.add("seed");
    openapiFields.add("auditStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Image
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Image.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Image is not found in the empty JSON string", Image.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Image.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Image` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
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
       if (!Image.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Image' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Image> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Image.class));

       return (TypeAdapter<T>) new TypeAdapter<Image>() {
           @Override
           public void write(JsonWriter out, Image value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Image read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Image given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Image
   * @throws IOException if the JSON string is invalid with respect to Image
   */
  public static Image fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Image.class);
  }

  /**
   * Convert an instance of Image to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

