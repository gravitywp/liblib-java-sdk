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
 * 图片具体宽高，与aspectRatio二选一配置即可
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-10T14:17:54.856322563+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class TextToImageUltraRequestGenerateParamsImageSize {
  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private Integer height;

  public TextToImageUltraRequestGenerateParamsImageSize() {
  }

  public TextToImageUltraRequestGenerateParamsImageSize width(@javax.annotation.Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * 图片宽度
   * minimum: 512
   * maximum: 2048
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = width;
  }


  public TextToImageUltraRequestGenerateParamsImageSize height(@javax.annotation.Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * 图片高度
   * minimum: 512
   * maximum: 2048
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = height;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageUltraRequestGenerateParamsImageSize textToImageUltraRequestGenerateParamsImageSize = (TextToImageUltraRequestGenerateParamsImageSize) o;
    return Objects.equals(this.width, textToImageUltraRequestGenerateParamsImageSize.width) &&
        Objects.equals(this.height, textToImageUltraRequestGenerateParamsImageSize.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageUltraRequestGenerateParamsImageSize {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
    openapiFields.add("width");
    openapiFields.add("height");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TextToImageUltraRequestGenerateParamsImageSize
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextToImageUltraRequestGenerateParamsImageSize.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageUltraRequestGenerateParamsImageSize is not found in the empty JSON string", TextToImageUltraRequestGenerateParamsImageSize.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextToImageUltraRequestGenerateParamsImageSize.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageUltraRequestGenerateParamsImageSize` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextToImageUltraRequestGenerateParamsImageSize.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageUltraRequestGenerateParamsImageSize' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageUltraRequestGenerateParamsImageSize> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageUltraRequestGenerateParamsImageSize.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageUltraRequestGenerateParamsImageSize>() {
           @Override
           public void write(JsonWriter out, TextToImageUltraRequestGenerateParamsImageSize value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageUltraRequestGenerateParamsImageSize read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TextToImageUltraRequestGenerateParamsImageSize given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TextToImageUltraRequestGenerateParamsImageSize
   * @throws IOException if the JSON string is invalid with respect to TextToImageUltraRequestGenerateParamsImageSize
   */
  public static TextToImageUltraRequestGenerateParamsImageSize fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageUltraRequestGenerateParamsImageSize.class);
  }

  /**
   * Convert an instance of TextToImageUltraRequestGenerateParamsImageSize to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

