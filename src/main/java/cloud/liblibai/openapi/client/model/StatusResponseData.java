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
import cloud.liblibai.openapi.client.model.GenerateStatus;
import cloud.liblibai.openapi.client.model.Image;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * StatusResponseData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-04T15:57:44.740153093+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class StatusResponseData {
  public static final String SERIALIZED_NAME_GENERATE_UUID = "generateUuid";
  @SerializedName(SERIALIZED_NAME_GENERATE_UUID)
  @javax.annotation.Nullable
  private String generateUuid;

  public static final String SERIALIZED_NAME_GENERATE_STATUS = "generateStatus";
  @SerializedName(SERIALIZED_NAME_GENERATE_STATUS)
  @javax.annotation.Nullable
  private GenerateStatus generateStatus;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETED = "percentCompleted";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETED)
  @javax.annotation.Nullable
  private Float percentCompleted;

  public static final String SERIALIZED_NAME_GENERATE_MSG = "generateMsg";
  @SerializedName(SERIALIZED_NAME_GENERATE_MSG)
  @javax.annotation.Nullable
  private String generateMsg;

  public static final String SERIALIZED_NAME_POINTS_COST = "pointsCost";
  @SerializedName(SERIALIZED_NAME_POINTS_COST)
  @javax.annotation.Nullable
  private Integer pointsCost;

  public static final String SERIALIZED_NAME_ACCOUNT_BALANCE = "accountBalance";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BALANCE)
  @javax.annotation.Nullable
  private Integer accountBalance;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  @javax.annotation.Nullable
  private List<Image> images = new ArrayList<>();

  public StatusResponseData() {
  }

  public StatusResponseData generateUuid(@javax.annotation.Nullable String generateUuid) {
    this.generateUuid = generateUuid;
    return this;
  }

  /**
   * 生图任务uuid，使用该uuid查询生图进度
   * @return generateUuid
   */
  @javax.annotation.Nullable
  public String getGenerateUuid() {
    return generateUuid;
  }

  public void setGenerateUuid(@javax.annotation.Nullable String generateUuid) {
    this.generateUuid = generateUuid;
  }


  public StatusResponseData generateStatus(@javax.annotation.Nullable GenerateStatus generateStatus) {
    this.generateStatus = generateStatus;
    return this;
  }

  /**
   * Get generateStatus
   * @return generateStatus
   */
  @javax.annotation.Nullable
  public GenerateStatus getGenerateStatus() {
    return generateStatus;
  }

  public void setGenerateStatus(@javax.annotation.Nullable GenerateStatus generateStatus) {
    this.generateStatus = generateStatus;
  }


  public StatusResponseData percentCompleted(@javax.annotation.Nullable Float percentCompleted) {
    this.percentCompleted = percentCompleted;
    return this;
  }

  /**
   * 生图进度，0到1之间的浮点数，（暂未实现）
   * @return percentCompleted
   */
  @javax.annotation.Nullable
  public Float getPercentCompleted() {
    return percentCompleted;
  }

  public void setPercentCompleted(@javax.annotation.Nullable Float percentCompleted) {
    this.percentCompleted = percentCompleted;
  }


  public StatusResponseData generateMsg(@javax.annotation.Nullable String generateMsg) {
    this.generateMsg = generateMsg;
    return this;
  }

  /**
   * 生图信息，提供附加信息，如生图失败信息
   * @return generateMsg
   */
  @javax.annotation.Nullable
  public String getGenerateMsg() {
    return generateMsg;
  }

  public void setGenerateMsg(@javax.annotation.Nullable String generateMsg) {
    this.generateMsg = generateMsg;
  }


  public StatusResponseData pointsCost(@javax.annotation.Nullable Integer pointsCost) {
    this.pointsCost = pointsCost;
    return this;
  }

  /**
   * 本次生图任务消耗积分数
   * @return pointsCost
   */
  @javax.annotation.Nullable
  public Integer getPointsCost() {
    return pointsCost;
  }

  public void setPointsCost(@javax.annotation.Nullable Integer pointsCost) {
    this.pointsCost = pointsCost;
  }


  public StatusResponseData accountBalance(@javax.annotation.Nullable Integer accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * 账户剩余积分数
   * @return accountBalance
   */
  @javax.annotation.Nullable
  public Integer getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(@javax.annotation.Nullable Integer accountBalance) {
    this.accountBalance = accountBalance;
  }


  public StatusResponseData images(@javax.annotation.Nullable List<Image> images) {
    this.images = images;
    return this;
  }

  public StatusResponseData addImagesItem(Image imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
   */
  @javax.annotation.Nullable
  public List<Image> getImages() {
    return images;
  }

  public void setImages(@javax.annotation.Nullable List<Image> images) {
    this.images = images;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusResponseData statusResponseData = (StatusResponseData) o;
    return Objects.equals(this.generateUuid, statusResponseData.generateUuid) &&
        Objects.equals(this.generateStatus, statusResponseData.generateStatus) &&
        Objects.equals(this.percentCompleted, statusResponseData.percentCompleted) &&
        Objects.equals(this.generateMsg, statusResponseData.generateMsg) &&
        Objects.equals(this.pointsCost, statusResponseData.pointsCost) &&
        Objects.equals(this.accountBalance, statusResponseData.accountBalance) &&
        Objects.equals(this.images, statusResponseData.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateUuid, generateStatus, percentCompleted, generateMsg, pointsCost, accountBalance, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusResponseData {\n");
    sb.append("    generateUuid: ").append(toIndentedString(generateUuid)).append("\n");
    sb.append("    generateStatus: ").append(toIndentedString(generateStatus)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    generateMsg: ").append(toIndentedString(generateMsg)).append("\n");
    sb.append("    pointsCost: ").append(toIndentedString(pointsCost)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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
    openapiFields.add("generateUuid");
    openapiFields.add("generateStatus");
    openapiFields.add("percentCompleted");
    openapiFields.add("generateMsg");
    openapiFields.add("pointsCost");
    openapiFields.add("accountBalance");
    openapiFields.add("images");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StatusResponseData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StatusResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusResponseData is not found in the empty JSON string", StatusResponseData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StatusResponseData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatusResponseData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("generateUuid") != null && !jsonObj.get("generateUuid").isJsonNull()) && !jsonObj.get("generateUuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateUuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateUuid").toString()));
      }
      // validate the optional field `generateStatus`
      if (jsonObj.get("generateStatus") != null && !jsonObj.get("generateStatus").isJsonNull()) {
        GenerateStatus.validateJsonElement(jsonObj.get("generateStatus"));
      }
      if ((jsonObj.get("generateMsg") != null && !jsonObj.get("generateMsg").isJsonNull()) && !jsonObj.get("generateMsg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `generateMsg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("generateMsg").toString()));
      }
      if (jsonObj.get("images") != null && !jsonObj.get("images").isJsonNull()) {
        JsonArray jsonArrayimages = jsonObj.getAsJsonArray("images");
        if (jsonArrayimages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("images").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `images` to be an array in the JSON string but got `%s`", jsonObj.get("images").toString()));
          }

          // validate the optional field `images` (array)
          for (int i = 0; i < jsonArrayimages.size(); i++) {
            Image.validateJsonElement(jsonArrayimages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusResponseData>() {
           @Override
           public void write(JsonWriter out, StatusResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatusResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StatusResponseData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StatusResponseData
   * @throws IOException if the JSON string is invalid with respect to StatusResponseData
   */
  public static StatusResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusResponseData.class);
  }

  /**
   * Convert an instance of StatusResponseData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

