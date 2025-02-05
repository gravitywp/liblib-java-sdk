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
import cloud.liblibai.openapi.client.model.TextToImageUltraRequestGenerateParamsImageSize;
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
 * TextToImageUltraRequestGenerateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T15:10:08.947334966+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class TextToImageUltraRequestGenerateParams {
  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  @javax.annotation.Nonnull
  private String prompt;

  /**
   * 图片宽高比预设，与imageSize二选一配置即可
   */
  @JsonAdapter(AspectRatioEnum.Adapter.class)
  public enum AspectRatioEnum {
    SQUARE("square"),
    
    PORTRAIT("portrait"),
    
    LANDSCAPE("landscape");

    private String value;

    AspectRatioEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AspectRatioEnum fromValue(String value) {
      for (AspectRatioEnum b : AspectRatioEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AspectRatioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AspectRatioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AspectRatioEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AspectRatioEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AspectRatioEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ASPECT_RATIO = "aspectRatio";
  @SerializedName(SERIALIZED_NAME_ASPECT_RATIO)
  @javax.annotation.Nullable
  private AspectRatioEnum aspectRatio;

  public static final String SERIALIZED_NAME_IMAGE_SIZE = "imageSize";
  @SerializedName(SERIALIZED_NAME_IMAGE_SIZE)
  @javax.annotation.Nullable
  private TextToImageUltraRequestGenerateParamsImageSize imageSize;

  public static final String SERIALIZED_NAME_IMG_COUNT = "imgCount";
  @SerializedName(SERIALIZED_NAME_IMG_COUNT)
  @javax.annotation.Nonnull
  private Integer imgCount;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  @javax.annotation.Nullable
  private Integer steps;

  public static final String SERIALIZED_NAME_CONTROLNET = "controlnet";
  @SerializedName(SERIALIZED_NAME_CONTROLNET)
  @javax.annotation.Nullable
  private UltraControlNet controlnet;

  public TextToImageUltraRequestGenerateParams() {
  }

  public TextToImageUltraRequestGenerateParams prompt(@javax.annotation.Nonnull String prompt) {
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


  public TextToImageUltraRequestGenerateParams aspectRatio(@javax.annotation.Nullable AspectRatioEnum aspectRatio) {
    this.aspectRatio = aspectRatio;
    return this;
  }

  /**
   * 图片宽高比预设，与imageSize二选一配置即可
   * @return aspectRatio
   */
  @javax.annotation.Nullable
  public AspectRatioEnum getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(@javax.annotation.Nullable AspectRatioEnum aspectRatio) {
    this.aspectRatio = aspectRatio;
  }


  public TextToImageUltraRequestGenerateParams imageSize(@javax.annotation.Nullable TextToImageUltraRequestGenerateParamsImageSize imageSize) {
    this.imageSize = imageSize;
    return this;
  }

  /**
   * Get imageSize
   * @return imageSize
   */
  @javax.annotation.Nullable
  public TextToImageUltraRequestGenerateParamsImageSize getImageSize() {
    return imageSize;
  }

  public void setImageSize(@javax.annotation.Nullable TextToImageUltraRequestGenerateParamsImageSize imageSize) {
    this.imageSize = imageSize;
  }


  public TextToImageUltraRequestGenerateParams imgCount(@javax.annotation.Nonnull Integer imgCount) {
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


  public TextToImageUltraRequestGenerateParams steps(@javax.annotation.Nullable Integer steps) {
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


  public TextToImageUltraRequestGenerateParams controlnet(@javax.annotation.Nullable UltraControlNet controlnet) {
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
    TextToImageUltraRequestGenerateParams textToImageUltraRequestGenerateParams = (TextToImageUltraRequestGenerateParams) o;
    return Objects.equals(this.prompt, textToImageUltraRequestGenerateParams.prompt) &&
        Objects.equals(this.aspectRatio, textToImageUltraRequestGenerateParams.aspectRatio) &&
        Objects.equals(this.imageSize, textToImageUltraRequestGenerateParams.imageSize) &&
        Objects.equals(this.imgCount, textToImageUltraRequestGenerateParams.imgCount) &&
        Objects.equals(this.steps, textToImageUltraRequestGenerateParams.steps) &&
        Objects.equals(this.controlnet, textToImageUltraRequestGenerateParams.controlnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prompt, aspectRatio, imageSize, imgCount, steps, controlnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageUltraRequestGenerateParams {\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    imageSize: ").append(toIndentedString(imageSize)).append("\n");
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
    openapiFields.add("aspectRatio");
    openapiFields.add("imageSize");
    openapiFields.add("imgCount");
    openapiFields.add("steps");
    openapiFields.add("controlnet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("prompt");
    openapiRequiredFields.add("imgCount");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TextToImageUltraRequestGenerateParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextToImageUltraRequestGenerateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageUltraRequestGenerateParams is not found in the empty JSON string", TextToImageUltraRequestGenerateParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextToImageUltraRequestGenerateParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageUltraRequestGenerateParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TextToImageUltraRequestGenerateParams.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("aspectRatio") != null && !jsonObj.get("aspectRatio").isJsonNull()) && !jsonObj.get("aspectRatio").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `aspectRatio` to be a primitive type in the JSON string but got `%s`", jsonObj.get("aspectRatio").toString()));
      }
      // validate the optional field `aspectRatio`
      if (jsonObj.get("aspectRatio") != null && !jsonObj.get("aspectRatio").isJsonNull()) {
        AspectRatioEnum.validateJsonElement(jsonObj.get("aspectRatio"));
      }
      // validate the optional field `imageSize`
      if (jsonObj.get("imageSize") != null && !jsonObj.get("imageSize").isJsonNull()) {
        TextToImageUltraRequestGenerateParamsImageSize.validateJsonElement(jsonObj.get("imageSize"));
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
       if (!TextToImageUltraRequestGenerateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageUltraRequestGenerateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageUltraRequestGenerateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageUltraRequestGenerateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageUltraRequestGenerateParams>() {
           @Override
           public void write(JsonWriter out, TextToImageUltraRequestGenerateParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageUltraRequestGenerateParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TextToImageUltraRequestGenerateParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TextToImageUltraRequestGenerateParams
   * @throws IOException if the JSON string is invalid with respect to TextToImageUltraRequestGenerateParams
   */
  public static TextToImageUltraRequestGenerateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageUltraRequestGenerateParams.class);
  }

  /**
   * Convert an instance of TextToImageUltraRequestGenerateParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

