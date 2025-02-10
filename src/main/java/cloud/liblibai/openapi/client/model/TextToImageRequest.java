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
import cloud.liblibai.openapi.client.model.TextToImageRequestGenerateParams;
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
 * TextToImageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-10T14:17:54.856322563+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class TextToImageRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  @javax.annotation.Nullable
  private String templateUuid = "e10adc3949ba59abbe56e057f20f883e";

  public static final String SERIALIZED_NAME_GENERATE_PARAMS = "generateParams";
  @SerializedName(SERIALIZED_NAME_GENERATE_PARAMS)
  @javax.annotation.Nonnull
  private TextToImageRequestGenerateParams generateParams;

  public TextToImageRequest() {
  }

  public TextToImageRequest templateUuid(@javax.annotation.Nullable String templateUuid) {
    this.templateUuid = templateUuid;
    return this;
  }

  /**
   * 参数模板uuid
   * @return templateUuid
   */
  @javax.annotation.Nullable
  public String getTemplateUuid() {
    return templateUuid;
  }

  public void setTemplateUuid(@javax.annotation.Nullable String templateUuid) {
    this.templateUuid = templateUuid;
  }


  public TextToImageRequest generateParams(@javax.annotation.Nonnull TextToImageRequestGenerateParams generateParams) {
    this.generateParams = generateParams;
    return this;
  }

  /**
   * Get generateParams
   * @return generateParams
   */
  @javax.annotation.Nonnull
  public TextToImageRequestGenerateParams getGenerateParams() {
    return generateParams;
  }

  public void setGenerateParams(@javax.annotation.Nonnull TextToImageRequestGenerateParams generateParams) {
    this.generateParams = generateParams;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageRequest textToImageRequest = (TextToImageRequest) o;
    return Objects.equals(this.templateUuid, textToImageRequest.templateUuid) &&
        Objects.equals(this.generateParams, textToImageRequest.generateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateUuid, generateParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageRequest {\n");
    sb.append("    templateUuid: ").append(toIndentedString(templateUuid)).append("\n");
    sb.append("    generateParams: ").append(toIndentedString(generateParams)).append("\n");
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
    openapiFields.add("templateUuid");
    openapiFields.add("generateParams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("generateParams");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TextToImageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextToImageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageRequest is not found in the empty JSON string", TextToImageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextToImageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TextToImageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("templateUuid") != null && !jsonObj.get("templateUuid").isJsonNull()) && !jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      // validate the required field `generateParams`
      TextToImageRequestGenerateParams.validateJsonElement(jsonObj.get("generateParams"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextToImageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageRequest>() {
           @Override
           public void write(JsonWriter out, TextToImageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TextToImageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TextToImageRequest
   * @throws IOException if the JSON string is invalid with respect to TextToImageRequest
   */
  public static TextToImageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageRequest.class);
  }

  /**
   * Convert an instance of TextToImageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

