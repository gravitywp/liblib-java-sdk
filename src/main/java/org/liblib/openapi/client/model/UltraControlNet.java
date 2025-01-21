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
import java.net.URI;
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
 * 构图控制
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T18:48:43.134819632+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class UltraControlNet {
  /**
   * 控制类型
   */
  @JsonAdapter(ControlTypeEnum.Adapter.class)
  public enum ControlTypeEnum {
    LINE("line"),
    
    DEPTH("depth"),
    
    POSE("pose"),
    
    IP_ADAPTER("IPAdapter");

    private String value;

    ControlTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ControlTypeEnum fromValue(String value) {
      for (ControlTypeEnum b : ControlTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ControlTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ControlTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ControlTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ControlTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ControlTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTROL_TYPE = "controlType";
  @SerializedName(SERIALIZED_NAME_CONTROL_TYPE)
  @javax.annotation.Nullable
  private ControlTypeEnum controlType;

  public static final String SERIALIZED_NAME_CONTROL_IMAGE = "controlImage";
  @SerializedName(SERIALIZED_NAME_CONTROL_IMAGE)
  @javax.annotation.Nullable
  private URI controlImage;

  public UltraControlNet() {
  }

  public UltraControlNet controlType(@javax.annotation.Nullable ControlTypeEnum controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * 控制类型
   * @return controlType
   */
  @javax.annotation.Nullable
  public ControlTypeEnum getControlType() {
    return controlType;
  }

  public void setControlType(@javax.annotation.Nullable ControlTypeEnum controlType) {
    this.controlType = controlType;
  }


  public UltraControlNet controlImage(@javax.annotation.Nullable URI controlImage) {
    this.controlImage = controlImage;
    return this;
  }

  /**
   * 参考图可公网访问的完整URL
   * @return controlImage
   */
  @javax.annotation.Nullable
  public URI getControlImage() {
    return controlImage;
  }

  public void setControlImage(@javax.annotation.Nullable URI controlImage) {
    this.controlImage = controlImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UltraControlNet ultraControlNet = (UltraControlNet) o;
    return Objects.equals(this.controlType, ultraControlNet.controlType) &&
        Objects.equals(this.controlImage, ultraControlNet.controlImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(controlType, controlImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UltraControlNet {\n");
    sb.append("    controlType: ").append(toIndentedString(controlType)).append("\n");
    sb.append("    controlImage: ").append(toIndentedString(controlImage)).append("\n");
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
    openapiFields.add("controlType");
    openapiFields.add("controlImage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UltraControlNet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UltraControlNet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UltraControlNet is not found in the empty JSON string", UltraControlNet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UltraControlNet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UltraControlNet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("controlType") != null && !jsonObj.get("controlType").isJsonNull()) && !jsonObj.get("controlType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controlType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controlType").toString()));
      }
      // validate the optional field `controlType`
      if (jsonObj.get("controlType") != null && !jsonObj.get("controlType").isJsonNull()) {
        ControlTypeEnum.validateJsonElement(jsonObj.get("controlType"));
      }
      if ((jsonObj.get("controlImage") != null && !jsonObj.get("controlImage").isJsonNull()) && !jsonObj.get("controlImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `controlImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("controlImage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UltraControlNet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UltraControlNet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UltraControlNet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UltraControlNet.class));

       return (TypeAdapter<T>) new TypeAdapter<UltraControlNet>() {
           @Override
           public void write(JsonWriter out, UltraControlNet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UltraControlNet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UltraControlNet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UltraControlNet
   * @throws IOException if the JSON string is invalid with respect to UltraControlNet
   */
  public static UltraControlNet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UltraControlNet.class);
  }

  /**
   * Convert an instance of UltraControlNet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

