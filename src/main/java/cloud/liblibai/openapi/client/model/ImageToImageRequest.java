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
import cloud.liblibai.openapi.client.model.ImageToImageRequestGenerateParams;
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
 * ImageToImageRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T17:51:55.821090821+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ImageToImageRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_UUID = "templateUuid";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_UUID)
  @javax.annotation.Nullable
  private String templateUuid = "9c7d531dc75f476aa833b3d452b8f7ad";

  public static final String SERIALIZED_NAME_GENERATE_PARAMS = "generateParams";
  @SerializedName(SERIALIZED_NAME_GENERATE_PARAMS)
  @javax.annotation.Nonnull
  private ImageToImageRequestGenerateParams generateParams;

  public ImageToImageRequest() {
  }

  public ImageToImageRequest templateUuid(@javax.annotation.Nullable String templateUuid) {
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


  public ImageToImageRequest generateParams(@javax.annotation.Nonnull ImageToImageRequestGenerateParams generateParams) {
    this.generateParams = generateParams;
    return this;
  }

  /**
   * Get generateParams
   * @return generateParams
   */
  @javax.annotation.Nonnull
  public ImageToImageRequestGenerateParams getGenerateParams() {
    return generateParams;
  }

  public void setGenerateParams(@javax.annotation.Nonnull ImageToImageRequestGenerateParams generateParams) {
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
    ImageToImageRequest imageToImageRequest = (ImageToImageRequest) o;
    return Objects.equals(this.templateUuid, imageToImageRequest.templateUuid) &&
        Objects.equals(this.generateParams, imageToImageRequest.generateParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateUuid, generateParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToImageRequest {\n");
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
   * @throws IOException if the JSON Element is invalid with respect to ImageToImageRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageToImageRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageToImageRequest is not found in the empty JSON string", ImageToImageRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageToImageRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageToImageRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ImageToImageRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("templateUuid") != null && !jsonObj.get("templateUuid").isJsonNull()) && !jsonObj.get("templateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `templateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("templateUuid").toString()));
      }
      // validate the required field `generateParams`
      ImageToImageRequestGenerateParams.validateJsonElement(jsonObj.get("generateParams"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageToImageRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageToImageRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageToImageRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageToImageRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageToImageRequest>() {
           @Override
           public void write(JsonWriter out, ImageToImageRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageToImageRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageToImageRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageToImageRequest
   * @throws IOException if the JSON string is invalid with respect to ImageToImageRequest
   */
  public static ImageToImageRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageToImageRequest.class);
  }

  /**
   * Convert an instance of ImageToImageRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

