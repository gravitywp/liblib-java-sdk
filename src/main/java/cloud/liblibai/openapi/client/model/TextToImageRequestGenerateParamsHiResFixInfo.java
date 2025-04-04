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
 * TextToImageRequestGenerateParamsHiResFixInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T23:16:21.956900040+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class TextToImageRequestGenerateParamsHiResFixInfo {
  public static final String SERIALIZED_NAME_HIRES_STEPS = "hiresSteps";
  @SerializedName(SERIALIZED_NAME_HIRES_STEPS)
  @javax.annotation.Nullable
  private Integer hiresSteps;

  public static final String SERIALIZED_NAME_HIRES_DENOISING_STRENGTH = "hiresDenoisingStrength";
  @SerializedName(SERIALIZED_NAME_HIRES_DENOISING_STRENGTH)
  @javax.annotation.Nullable
  private Float hiresDenoisingStrength;

  public static final String SERIALIZED_NAME_UPSCALER = "upscaler";
  @SerializedName(SERIALIZED_NAME_UPSCALER)
  @javax.annotation.Nullable
  private Integer upscaler;

  public static final String SERIALIZED_NAME_RESIZED_WIDTH = "resizedWidth";
  @SerializedName(SERIALIZED_NAME_RESIZED_WIDTH)
  @javax.annotation.Nullable
  private Integer resizedWidth;

  public static final String SERIALIZED_NAME_RESIZED_HEIGHT = "resizedHeight";
  @SerializedName(SERIALIZED_NAME_RESIZED_HEIGHT)
  @javax.annotation.Nullable
  private Integer resizedHeight;

  public TextToImageRequestGenerateParamsHiResFixInfo() {
  }

  public TextToImageRequestGenerateParamsHiResFixInfo hiresSteps(@javax.annotation.Nullable Integer hiresSteps) {
    this.hiresSteps = hiresSteps;
    return this;
  }

  /**
   * 高分辨率修复的重绘步数
   * @return hiresSteps
   */
  @javax.annotation.Nullable
  public Integer getHiresSteps() {
    return hiresSteps;
  }

  public void setHiresSteps(@javax.annotation.Nullable Integer hiresSteps) {
    this.hiresSteps = hiresSteps;
  }


  public TextToImageRequestGenerateParamsHiResFixInfo hiresDenoisingStrength(@javax.annotation.Nullable Float hiresDenoisingStrength) {
    this.hiresDenoisingStrength = hiresDenoisingStrength;
    return this;
  }

  /**
   * 高分辨率修复的重绘幅度
   * @return hiresDenoisingStrength
   */
  @javax.annotation.Nullable
  public Float getHiresDenoisingStrength() {
    return hiresDenoisingStrength;
  }

  public void setHiresDenoisingStrength(@javax.annotation.Nullable Float hiresDenoisingStrength) {
    this.hiresDenoisingStrength = hiresDenoisingStrength;
  }


  public TextToImageRequestGenerateParamsHiResFixInfo upscaler(@javax.annotation.Nullable Integer upscaler) {
    this.upscaler = upscaler;
    return this;
  }

  /**
   * 放大算法模型枚举
   * @return upscaler
   */
  @javax.annotation.Nullable
  public Integer getUpscaler() {
    return upscaler;
  }

  public void setUpscaler(@javax.annotation.Nullable Integer upscaler) {
    this.upscaler = upscaler;
  }


  public TextToImageRequestGenerateParamsHiResFixInfo resizedWidth(@javax.annotation.Nullable Integer resizedWidth) {
    this.resizedWidth = resizedWidth;
    return this;
  }

  /**
   * 放大后的宽度
   * @return resizedWidth
   */
  @javax.annotation.Nullable
  public Integer getResizedWidth() {
    return resizedWidth;
  }

  public void setResizedWidth(@javax.annotation.Nullable Integer resizedWidth) {
    this.resizedWidth = resizedWidth;
  }


  public TextToImageRequestGenerateParamsHiResFixInfo resizedHeight(@javax.annotation.Nullable Integer resizedHeight) {
    this.resizedHeight = resizedHeight;
    return this;
  }

  /**
   * 放大后的高度
   * @return resizedHeight
   */
  @javax.annotation.Nullable
  public Integer getResizedHeight() {
    return resizedHeight;
  }

  public void setResizedHeight(@javax.annotation.Nullable Integer resizedHeight) {
    this.resizedHeight = resizedHeight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageRequestGenerateParamsHiResFixInfo textToImageRequestGenerateParamsHiResFixInfo = (TextToImageRequestGenerateParamsHiResFixInfo) o;
    return Objects.equals(this.hiresSteps, textToImageRequestGenerateParamsHiResFixInfo.hiresSteps) &&
        Objects.equals(this.hiresDenoisingStrength, textToImageRequestGenerateParamsHiResFixInfo.hiresDenoisingStrength) &&
        Objects.equals(this.upscaler, textToImageRequestGenerateParamsHiResFixInfo.upscaler) &&
        Objects.equals(this.resizedWidth, textToImageRequestGenerateParamsHiResFixInfo.resizedWidth) &&
        Objects.equals(this.resizedHeight, textToImageRequestGenerateParamsHiResFixInfo.resizedHeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hiresSteps, hiresDenoisingStrength, upscaler, resizedWidth, resizedHeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageRequestGenerateParamsHiResFixInfo {\n");
    sb.append("    hiresSteps: ").append(toIndentedString(hiresSteps)).append("\n");
    sb.append("    hiresDenoisingStrength: ").append(toIndentedString(hiresDenoisingStrength)).append("\n");
    sb.append("    upscaler: ").append(toIndentedString(upscaler)).append("\n");
    sb.append("    resizedWidth: ").append(toIndentedString(resizedWidth)).append("\n");
    sb.append("    resizedHeight: ").append(toIndentedString(resizedHeight)).append("\n");
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
    openapiFields.add("hiresSteps");
    openapiFields.add("hiresDenoisingStrength");
    openapiFields.add("upscaler");
    openapiFields.add("resizedWidth");
    openapiFields.add("resizedHeight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TextToImageRequestGenerateParamsHiResFixInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextToImageRequestGenerateParamsHiResFixInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageRequestGenerateParamsHiResFixInfo is not found in the empty JSON string", TextToImageRequestGenerateParamsHiResFixInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextToImageRequestGenerateParamsHiResFixInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageRequestGenerateParamsHiResFixInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextToImageRequestGenerateParamsHiResFixInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageRequestGenerateParamsHiResFixInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageRequestGenerateParamsHiResFixInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageRequestGenerateParamsHiResFixInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageRequestGenerateParamsHiResFixInfo>() {
           @Override
           public void write(JsonWriter out, TextToImageRequestGenerateParamsHiResFixInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageRequestGenerateParamsHiResFixInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TextToImageRequestGenerateParamsHiResFixInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TextToImageRequestGenerateParamsHiResFixInfo
   * @throws IOException if the JSON string is invalid with respect to TextToImageRequestGenerateParamsHiResFixInfo
   */
  public static TextToImageRequestGenerateParamsHiResFixInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageRequestGenerateParamsHiResFixInfo.class);
  }

  /**
   * Convert an instance of TextToImageRequestGenerateParamsHiResFixInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

