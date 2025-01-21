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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * ComfyNodeParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-21T18:48:43.134819632+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ComfyNodeParams {
  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  @javax.annotation.Nullable
  private Map<String, Object> inputs = new HashMap<>();

  public static final String SERIALIZED_NAME_CLASS_TYPE = "class_type";
  @SerializedName(SERIALIZED_NAME_CLASS_TYPE)
  @javax.annotation.Nullable
  private String classType;

  public ComfyNodeParams() {
  }

  public ComfyNodeParams inputs(@javax.annotation.Nullable Map<String, Object> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ComfyNodeParams putInputsItem(String key, Object inputsItem) {
    if (this.inputs == null) {
      this.inputs = new HashMap<>();
    }
    this.inputs.put(key, inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
   */
  @javax.annotation.Nullable
  public Map<String, Object> getInputs() {
    return inputs;
  }

  public void setInputs(@javax.annotation.Nullable Map<String, Object> inputs) {
    this.inputs = inputs;
  }


  public ComfyNodeParams classType(@javax.annotation.Nullable String classType) {
    this.classType = classType;
    return this;
  }

  /**
   * Get classType
   * @return classType
   */
  @javax.annotation.Nullable
  public String getClassType() {
    return classType;
  }

  public void setClassType(@javax.annotation.Nullable String classType) {
    this.classType = classType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComfyNodeParams comfyNodeParams = (ComfyNodeParams) o;
    return Objects.equals(this.inputs, comfyNodeParams.inputs) &&
        Objects.equals(this.classType, comfyNodeParams.classType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputs, classType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComfyNodeParams {\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    classType: ").append(toIndentedString(classType)).append("\n");
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
    openapiFields.add("inputs");
    openapiFields.add("class_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ComfyNodeParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ComfyNodeParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComfyNodeParams is not found in the empty JSON string", ComfyNodeParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ComfyNodeParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComfyNodeParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("class_type") != null && !jsonObj.get("class_type").isJsonNull()) && !jsonObj.get("class_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `class_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("class_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComfyNodeParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComfyNodeParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComfyNodeParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComfyNodeParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ComfyNodeParams>() {
           @Override
           public void write(JsonWriter out, ComfyNodeParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComfyNodeParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ComfyNodeParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ComfyNodeParams
   * @throws IOException if the JSON string is invalid with respect to ComfyNodeParams
   */
  public static ComfyNodeParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComfyNodeParams.class);
  }

  /**
   * Convert an instance of ComfyNodeParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

