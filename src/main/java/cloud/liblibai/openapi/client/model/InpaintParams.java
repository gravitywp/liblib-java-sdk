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
 * InpaintParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:18:25.814917097+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class InpaintParams {
  public static final String SERIALIZED_NAME_MASK_IMAGE = "maskImage";
  @SerializedName(SERIALIZED_NAME_MASK_IMAGE)
  @javax.annotation.Nullable
  private String maskImage;

  public static final String SERIALIZED_NAME_MASK_BLUR = "maskBlur";
  @SerializedName(SERIALIZED_NAME_MASK_BLUR)
  @javax.annotation.Nullable
  private Integer maskBlur;

  public static final String SERIALIZED_NAME_MASK_PADDING = "maskPadding";
  @SerializedName(SERIALIZED_NAME_MASK_PADDING)
  @javax.annotation.Nullable
  private Integer maskPadding;

  public static final String SERIALIZED_NAME_MASK_MODE = "maskMode";
  @SerializedName(SERIALIZED_NAME_MASK_MODE)
  @javax.annotation.Nullable
  private Integer maskMode;

  public static final String SERIALIZED_NAME_INPAINT_AREA = "inpaintArea";
  @SerializedName(SERIALIZED_NAME_INPAINT_AREA)
  @javax.annotation.Nullable
  private Integer inpaintArea;

  public static final String SERIALIZED_NAME_INPAINTING_FILL = "inpaintingFill";
  @SerializedName(SERIALIZED_NAME_INPAINTING_FILL)
  @javax.annotation.Nullable
  private Integer inpaintingFill;

  public InpaintParams() {
  }

  public InpaintParams maskImage(@javax.annotation.Nullable String maskImage) {
    this.maskImage = maskImage;
    return this;
  }

  /**
   * 蒙版地址
   * @return maskImage
   */
  @javax.annotation.Nullable
  public String getMaskImage() {
    return maskImage;
  }

  public void setMaskImage(@javax.annotation.Nullable String maskImage) {
    this.maskImage = maskImage;
  }


  public InpaintParams maskBlur(@javax.annotation.Nullable Integer maskBlur) {
    this.maskBlur = maskBlur;
    return this;
  }

  /**
   * 蒙版模糊度
   * @return maskBlur
   */
  @javax.annotation.Nullable
  public Integer getMaskBlur() {
    return maskBlur;
  }

  public void setMaskBlur(@javax.annotation.Nullable Integer maskBlur) {
    this.maskBlur = maskBlur;
  }


  public InpaintParams maskPadding(@javax.annotation.Nullable Integer maskPadding) {
    this.maskPadding = maskPadding;
    return this;
  }

  /**
   * 蒙版边缘预留像素，也称蒙版扩展量
   * @return maskPadding
   */
  @javax.annotation.Nullable
  public Integer getMaskPadding() {
    return maskPadding;
  }

  public void setMaskPadding(@javax.annotation.Nullable Integer maskPadding) {
    this.maskPadding = maskPadding;
  }


  public InpaintParams maskMode(@javax.annotation.Nullable Integer maskMode) {
    this.maskMode = maskMode;
    return this;
  }

  /**
   * 蒙版模式
   * @return maskMode
   */
  @javax.annotation.Nullable
  public Integer getMaskMode() {
    return maskMode;
  }

  public void setMaskMode(@javax.annotation.Nullable Integer maskMode) {
    this.maskMode = maskMode;
  }


  public InpaintParams inpaintArea(@javax.annotation.Nullable Integer inpaintArea) {
    this.inpaintArea = inpaintArea;
    return this;
  }

  /**
   * 重绘区域, 0重绘全图，1仅重绘蒙版区域
   * @return inpaintArea
   */
  @javax.annotation.Nullable
  public Integer getInpaintArea() {
    return inpaintArea;
  }

  public void setInpaintArea(@javax.annotation.Nullable Integer inpaintArea) {
    this.inpaintArea = inpaintArea;
  }


  public InpaintParams inpaintingFill(@javax.annotation.Nullable Integer inpaintingFill) {
    this.inpaintingFill = inpaintingFill;
    return this;
  }

  /**
   * 蒙版内容的填充模式
   * @return inpaintingFill
   */
  @javax.annotation.Nullable
  public Integer getInpaintingFill() {
    return inpaintingFill;
  }

  public void setInpaintingFill(@javax.annotation.Nullable Integer inpaintingFill) {
    this.inpaintingFill = inpaintingFill;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InpaintParams inpaintParams = (InpaintParams) o;
    return Objects.equals(this.maskImage, inpaintParams.maskImage) &&
        Objects.equals(this.maskBlur, inpaintParams.maskBlur) &&
        Objects.equals(this.maskPadding, inpaintParams.maskPadding) &&
        Objects.equals(this.maskMode, inpaintParams.maskMode) &&
        Objects.equals(this.inpaintArea, inpaintParams.inpaintArea) &&
        Objects.equals(this.inpaintingFill, inpaintParams.inpaintingFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskImage, maskBlur, maskPadding, maskMode, inpaintArea, inpaintingFill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InpaintParams {\n");
    sb.append("    maskImage: ").append(toIndentedString(maskImage)).append("\n");
    sb.append("    maskBlur: ").append(toIndentedString(maskBlur)).append("\n");
    sb.append("    maskPadding: ").append(toIndentedString(maskPadding)).append("\n");
    sb.append("    maskMode: ").append(toIndentedString(maskMode)).append("\n");
    sb.append("    inpaintArea: ").append(toIndentedString(inpaintArea)).append("\n");
    sb.append("    inpaintingFill: ").append(toIndentedString(inpaintingFill)).append("\n");
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
    openapiFields.add("maskImage");
    openapiFields.add("maskBlur");
    openapiFields.add("maskPadding");
    openapiFields.add("maskMode");
    openapiFields.add("inpaintArea");
    openapiFields.add("inpaintingFill");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InpaintParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InpaintParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InpaintParams is not found in the empty JSON string", InpaintParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InpaintParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InpaintParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("maskImage") != null && !jsonObj.get("maskImage").isJsonNull()) && !jsonObj.get("maskImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskImage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InpaintParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InpaintParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InpaintParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InpaintParams.class));

       return (TypeAdapter<T>) new TypeAdapter<InpaintParams>() {
           @Override
           public void write(JsonWriter out, InpaintParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InpaintParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InpaintParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InpaintParams
   * @throws IOException if the JSON string is invalid with respect to InpaintParams
   */
  public static InpaintParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InpaintParams.class);
  }

  /**
   * Convert an instance of InpaintParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

