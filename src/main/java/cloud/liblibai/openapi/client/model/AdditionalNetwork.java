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
 * AdditionalNetwork
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T23:16:21.956900040+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class AdditionalNetwork {
  public static final String SERIALIZED_NAME_MODEL_ID = "modelId";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  @javax.annotation.Nullable
  private String modelId;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  @javax.annotation.Nullable
  private Float weight;

  public AdditionalNetwork() {
  }

  public AdditionalNetwork modelId(@javax.annotation.Nullable String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * LoRA的模型版本uuid
   * @return modelId
   */
  @javax.annotation.Nullable
  public String getModelId() {
    return modelId;
  }

  public void setModelId(@javax.annotation.Nullable String modelId) {
    this.modelId = modelId;
  }


  public AdditionalNetwork weight(@javax.annotation.Nullable Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * LoRA权重
   * @return weight
   */
  @javax.annotation.Nullable
  public Float getWeight() {
    return weight;
  }

  public void setWeight(@javax.annotation.Nullable Float weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalNetwork additionalNetwork = (AdditionalNetwork) o;
    return Objects.equals(this.modelId, additionalNetwork.modelId) &&
        Objects.equals(this.weight, additionalNetwork.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelId, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalNetwork {\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("modelId");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdditionalNetwork
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdditionalNetwork.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdditionalNetwork is not found in the empty JSON string", AdditionalNetwork.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdditionalNetwork.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdditionalNetwork` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("modelId") != null && !jsonObj.get("modelId").isJsonNull()) && !jsonObj.get("modelId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modelId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modelId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdditionalNetwork.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdditionalNetwork' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdditionalNetwork> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdditionalNetwork.class));

       return (TypeAdapter<T>) new TypeAdapter<AdditionalNetwork>() {
           @Override
           public void write(JsonWriter out, AdditionalNetwork value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdditionalNetwork read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdditionalNetwork given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdditionalNetwork
   * @throws IOException if the JSON string is invalid with respect to AdditionalNetwork
   */
  public static AdditionalNetwork fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdditionalNetwork.class);
  }

  /**
   * Convert an instance of AdditionalNetwork to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

