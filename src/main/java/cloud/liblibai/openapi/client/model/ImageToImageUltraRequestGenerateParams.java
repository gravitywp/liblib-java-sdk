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
import cloud.liblibai.openapi.client.model.UltraControlNet;
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
 * ImageToImageUltraRequestGenerateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T21:38:54.733388492+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ImageToImageUltraRequestGenerateParams {
  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  @javax.annotation.Nonnull
  private String prompt;

  public static final String SERIALIZED_NAME_SOURCE_IMAGE = "sourceImage";
  @SerializedName(SERIALIZED_NAME_SOURCE_IMAGE)
  @javax.annotation.Nonnull
  private String sourceImage;

  public static final String SERIALIZED_NAME_IMG_COUNT = "imgCount";
  @SerializedName(SERIALIZED_NAME_IMG_COUNT)
  @javax.annotation.Nonnull
  private Integer imgCount;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  @javax.annotation.Nullable
  private Integer steps = 30;

  public static final String SERIALIZED_NAME_CONTROLNET = "controlnet";
  @SerializedName(SERIALIZED_NAME_CONTROLNET)
  @javax.annotation.Nullable
  private UltraControlNet controlnet;

  public ImageToImageUltraRequestGenerateParams() {
  }

  public ImageToImageUltraRequestGenerateParams prompt(@javax.annotation.Nonnull String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * 正向提示词，文本
   * @return prompt
   */
  @javax.annotation.Nonnull
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(@javax.annotation.Nonnull String prompt) {
    this.prompt = prompt;
  }


  public ImageToImageUltraRequestGenerateParams sourceImage(@javax.annotation.Nonnull String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * sourceImage 参考图可公网访问的完整URL
   * @return sourceImage
   */
  @javax.annotation.Nonnull
  public String getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(@javax.annotation.Nonnull String sourceImage) {
    this.sourceImage = sourceImage;
  }


  public ImageToImageUltraRequestGenerateParams imgCount(@javax.annotation.Nonnull Integer imgCount) {
    this.imgCount = imgCount;
    return this;
  }

  /**
   * 单次生图张数
   * minimum: 1
   * maximum: 4
   * @return imgCount
   */
  @javax.annotation.Nonnull
  public Integer getImgCount() {
    return imgCount;
  }

  public void setImgCount(@javax.annotation.Nonnull Integer imgCount) {
    this.imgCount = imgCount;
  }


  public ImageToImageUltraRequestGenerateParams steps(@javax.annotation.Nullable Integer steps) {
    this.steps = steps;
    return this;
  }

  /**
   * 采样步数
   * @return steps
   */
  @javax.annotation.Nullable
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(@javax.annotation.Nullable Integer steps) {
    this.steps = steps;
  }


  public ImageToImageUltraRequestGenerateParams controlnet(@javax.annotation.Nullable UltraControlNet controlnet) {
    this.controlnet = controlnet;
    return this;
  }

  /**
   * Get controlnet
   * @return controlnet
   */
  @javax.annotation.Nullable
  public UltraControlNet getControlnet() {
    return controlnet;
  }

  public void setControlnet(@javax.annotation.Nullable UltraControlNet controlnet) {
    this.controlnet = controlnet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageToImageUltraRequestGenerateParams imageToImageUltraRequestGenerateParams = (ImageToImageUltraRequestGenerateParams) o;
    return Objects.equals(this.prompt, imageToImageUltraRequestGenerateParams.prompt) &&
        Objects.equals(this.sourceImage, imageToImageUltraRequestGenerateParams.sourceImage) &&
        Objects.equals(this.imgCount, imageToImageUltraRequestGenerateParams.imgCount) &&
        Objects.equals(this.steps, imageToImageUltraRequestGenerateParams.steps) &&
        Objects.equals(this.controlnet, imageToImageUltraRequestGenerateParams.controlnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, sourceImage, imgCount, steps, controlnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToImageUltraRequestGenerateParams {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    sourceImage: ").append(toIndentedString(sourceImage)).append("\n");
    sb.append("    imgCount: ").append(toIndentedString(imgCount)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    controlnet: ").append(toIndentedString(controlnet)).append("\n");
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
    openapiFields.add("prompt");
    openapiFields.add("sourceImage");
    openapiFields.add("imgCount");
    openapiFields.add("steps");
    openapiFields.add("controlnet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prompt");
    openapiRequiredFields.add("sourceImage");
    openapiRequiredFields.add("imgCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageToImageUltraRequestGenerateParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageToImageUltraRequestGenerateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageToImageUltraRequestGenerateParams is not found in the empty JSON string", ImageToImageUltraRequestGenerateParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageToImageUltraRequestGenerateParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageToImageUltraRequestGenerateParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImageToImageUltraRequestGenerateParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if (!jsonObj.get("sourceImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceImage").toString()));
      }
      // validate the optional field `controlnet`
      if (jsonObj.get("controlnet") != null && !jsonObj.get("controlnet").isJsonNull()) {
        UltraControlNet.validateJsonElement(jsonObj.get("controlnet"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageToImageUltraRequestGenerateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageToImageUltraRequestGenerateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageToImageUltraRequestGenerateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageToImageUltraRequestGenerateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageToImageUltraRequestGenerateParams>() {
           @Override
           public void write(JsonWriter out, ImageToImageUltraRequestGenerateParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageToImageUltraRequestGenerateParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageToImageUltraRequestGenerateParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageToImageUltraRequestGenerateParams
   * @throws IOException if the JSON string is invalid with respect to ImageToImageUltraRequestGenerateParams
   */
  public static ImageToImageUltraRequestGenerateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageToImageUltraRequestGenerateParams.class);
  }

  /**
   * Convert an instance of ImageToImageUltraRequestGenerateParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

