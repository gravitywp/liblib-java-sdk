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
import cloud.liblibai.openapi.client.model.AdditionalNetwork;
import cloud.liblibai.openapi.client.model.ControlNet;
import cloud.liblibai.openapi.client.model.TextToImageRequestGenerateParamsHiResFixInfo;
import cloud.liblibai.openapi.client.model.TextToImageRequestGenerateParamsInpaintParam;
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
 * TextToImageRequestGenerateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-05T18:03:35.942947793+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class TextToImageRequestGenerateParams {
  public static final String SERIALIZED_NAME_CHECK_POINT_ID = "checkPointId";
  @SerializedName(SERIALIZED_NAME_CHECK_POINT_ID)
  @javax.annotation.Nullable
  private String checkPointId;

  public static final String SERIALIZED_NAME_PROMPT = "prompt";
  @SerializedName(SERIALIZED_NAME_PROMPT)
  @javax.annotation.Nullable
  private String prompt;

  public static final String SERIALIZED_NAME_NEGATIVE_PROMPT = "negativePrompt";
  @SerializedName(SERIALIZED_NAME_NEGATIVE_PROMPT)
  @javax.annotation.Nullable
  private String negativePrompt;

  public static final String SERIALIZED_NAME_SAMPLER = "sampler";
  @SerializedName(SERIALIZED_NAME_SAMPLER)
  @javax.annotation.Nullable
  private Integer sampler;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  @javax.annotation.Nullable
  private Integer steps = 20;

  public static final String SERIALIZED_NAME_CFG_SCALE = "cfgScale";
  @SerializedName(SERIALIZED_NAME_CFG_SCALE)
  @javax.annotation.Nullable
  private Integer cfgScale;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private Integer height;

  public static final String SERIALIZED_NAME_IMG_COUNT = "imgCount";
  @SerializedName(SERIALIZED_NAME_IMG_COUNT)
  @javax.annotation.Nullable
  private Integer imgCount = 1;

  public static final String SERIALIZED_NAME_RANDN_SOURCE = "randnSource";
  @SerializedName(SERIALIZED_NAME_RANDN_SOURCE)
  @javax.annotation.Nullable
  private Integer randnSource;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  @javax.annotation.Nullable
  private Integer seed;

  public static final String SERIALIZED_NAME_RESTORE_FACES = "restoreFaces";
  @SerializedName(SERIALIZED_NAME_RESTORE_FACES)
  @javax.annotation.Nullable
  private Integer restoreFaces;

  public static final String SERIALIZED_NAME_ADDITIONAL_NETWORK = "additionalNetwork";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_NETWORK)
  @javax.annotation.Nullable
  private List<AdditionalNetwork> additionalNetwork;

  public static final String SERIALIZED_NAME_HI_RES_FIX_INFO = "hiResFixInfo";
  @SerializedName(SERIALIZED_NAME_HI_RES_FIX_INFO)
  @javax.annotation.Nullable
  private TextToImageRequestGenerateParamsHiResFixInfo hiResFixInfo;

  public static final String SERIALIZED_NAME_INPAINT_PARAM = "inpaintParam";
  @SerializedName(SERIALIZED_NAME_INPAINT_PARAM)
  @javax.annotation.Nullable
  private TextToImageRequestGenerateParamsInpaintParam inpaintParam;

  public static final String SERIALIZED_NAME_CONTROL_NET = "controlNet";
  @SerializedName(SERIALIZED_NAME_CONTROL_NET)
  @javax.annotation.Nullable
  private List<ControlNet> controlNet;

  public TextToImageRequestGenerateParams() {
  }

  public TextToImageRequestGenerateParams checkPointId(@javax.annotation.Nullable String checkPointId) {
    this.checkPointId = checkPointId;
    return this;
  }

  /**
   * 底模 modelVersionUUID
   * @return checkPointId
   */
  @javax.annotation.Nullable
  public String getCheckPointId() {
    return checkPointId;
  }

  public void setCheckPointId(@javax.annotation.Nullable String checkPointId) {
    this.checkPointId = checkPointId;
  }


  public TextToImageRequestGenerateParams prompt(@javax.annotation.Nullable String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * 正向提示词，文本
   * @return prompt
   */
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(@javax.annotation.Nullable String prompt) {
    this.prompt = prompt;
  }


  public TextToImageRequestGenerateParams negativePrompt(@javax.annotation.Nullable String negativePrompt) {
    this.negativePrompt = negativePrompt;
    return this;
  }

  /**
   * 负向提示词，文本
   * @return negativePrompt
   */
  @javax.annotation.Nullable
  public String getNegativePrompt() {
    return negativePrompt;
  }

  public void setNegativePrompt(@javax.annotation.Nullable String negativePrompt) {
    this.negativePrompt = negativePrompt;
  }


  public TextToImageRequestGenerateParams sampler(@javax.annotation.Nullable Integer sampler) {
    this.sampler = sampler;
    return this;
  }

  /**
   * 采样方法
   * @return sampler
   */
  @javax.annotation.Nullable
  public Integer getSampler() {
    return sampler;
  }

  public void setSampler(@javax.annotation.Nullable Integer sampler) {
    this.sampler = sampler;
  }


  public TextToImageRequestGenerateParams steps(@javax.annotation.Nullable Integer steps) {
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


  public TextToImageRequestGenerateParams cfgScale(@javax.annotation.Nullable Integer cfgScale) {
    this.cfgScale = cfgScale;
    return this;
  }

  /**
   * 提示词引导系数
   * @return cfgScale
   */
  @javax.annotation.Nullable
  public Integer getCfgScale() {
    return cfgScale;
  }

  public void setCfgScale(@javax.annotation.Nullable Integer cfgScale) {
    this.cfgScale = cfgScale;
  }


  public TextToImageRequestGenerateParams width(@javax.annotation.Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * 图片宽度
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = width;
  }


  public TextToImageRequestGenerateParams height(@javax.annotation.Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * 图片高度
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = height;
  }


  public TextToImageRequestGenerateParams imgCount(@javax.annotation.Nullable Integer imgCount) {
    this.imgCount = imgCount;
    return this;
  }

  /**
   * 图片数量
   * @return imgCount
   */
  @javax.annotation.Nullable
  public Integer getImgCount() {
    return imgCount;
  }

  public void setImgCount(@javax.annotation.Nullable Integer imgCount) {
    this.imgCount = imgCount;
  }


  public TextToImageRequestGenerateParams randnSource(@javax.annotation.Nullable Integer randnSource) {
    this.randnSource = randnSource;
    return this;
  }

  /**
   * 随机种子生成器 0 cpu，1 Gpu
   * @return randnSource
   */
  @javax.annotation.Nullable
  public Integer getRandnSource() {
    return randnSource;
  }

  public void setRandnSource(@javax.annotation.Nullable Integer randnSource) {
    this.randnSource = randnSource;
  }


  public TextToImageRequestGenerateParams seed(@javax.annotation.Nullable Integer seed) {
    this.seed = seed;
    return this;
  }

  /**
   * 随机种子值，-1表示随机
   * @return seed
   */
  @javax.annotation.Nullable
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(@javax.annotation.Nullable Integer seed) {
    this.seed = seed;
  }


  public TextToImageRequestGenerateParams restoreFaces(@javax.annotation.Nullable Integer restoreFaces) {
    this.restoreFaces = restoreFaces;
    return this;
  }

  /**
   * 面部修复，0关闭，1开启
   * @return restoreFaces
   */
  @javax.annotation.Nullable
  public Integer getRestoreFaces() {
    return restoreFaces;
  }

  public void setRestoreFaces(@javax.annotation.Nullable Integer restoreFaces) {
    this.restoreFaces = restoreFaces;
  }


  public TextToImageRequestGenerateParams additionalNetwork(@javax.annotation.Nullable List<AdditionalNetwork> additionalNetwork) {
    this.additionalNetwork = additionalNetwork;
    return this;
  }

  public TextToImageRequestGenerateParams addAdditionalNetworkItem(AdditionalNetwork additionalNetworkItem) {
    if (this.additionalNetwork == null) {
      this.additionalNetwork = new ArrayList<>();
    }
    this.additionalNetwork.add(additionalNetworkItem);
    return this;
  }

  /**
   * Get additionalNetwork
   * @return additionalNetwork
   */
  @javax.annotation.Nullable
  public List<AdditionalNetwork> getAdditionalNetwork() {
    return additionalNetwork;
  }

  public void setAdditionalNetwork(@javax.annotation.Nullable List<AdditionalNetwork> additionalNetwork) {
    this.additionalNetwork = additionalNetwork;
  }


  public TextToImageRequestGenerateParams hiResFixInfo(@javax.annotation.Nullable TextToImageRequestGenerateParamsHiResFixInfo hiResFixInfo) {
    this.hiResFixInfo = hiResFixInfo;
    return this;
  }

  /**
   * Get hiResFixInfo
   * @return hiResFixInfo
   */
  @javax.annotation.Nullable
  public TextToImageRequestGenerateParamsHiResFixInfo getHiResFixInfo() {
    return hiResFixInfo;
  }

  public void setHiResFixInfo(@javax.annotation.Nullable TextToImageRequestGenerateParamsHiResFixInfo hiResFixInfo) {
    this.hiResFixInfo = hiResFixInfo;
  }


  public TextToImageRequestGenerateParams inpaintParam(@javax.annotation.Nullable TextToImageRequestGenerateParamsInpaintParam inpaintParam) {
    this.inpaintParam = inpaintParam;
    return this;
  }

  /**
   * Get inpaintParam
   * @return inpaintParam
   */
  @javax.annotation.Nullable
  public TextToImageRequestGenerateParamsInpaintParam getInpaintParam() {
    return inpaintParam;
  }

  public void setInpaintParam(@javax.annotation.Nullable TextToImageRequestGenerateParamsInpaintParam inpaintParam) {
    this.inpaintParam = inpaintParam;
  }


  public TextToImageRequestGenerateParams controlNet(@javax.annotation.Nullable List<ControlNet> controlNet) {
    this.controlNet = controlNet;
    return this;
  }

  public TextToImageRequestGenerateParams addControlNetItem(ControlNet controlNetItem) {
    if (this.controlNet == null) {
      this.controlNet = new ArrayList<>();
    }
    this.controlNet.add(controlNetItem);
    return this;
  }

  /**
   * Get controlNet
   * @return controlNet
   */
  @javax.annotation.Nullable
  public List<ControlNet> getControlNet() {
    return controlNet;
  }

  public void setControlNet(@javax.annotation.Nullable List<ControlNet> controlNet) {
    this.controlNet = controlNet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextToImageRequestGenerateParams textToImageRequestGenerateParams = (TextToImageRequestGenerateParams) o;
    return Objects.equals(this.checkPointId, textToImageRequestGenerateParams.checkPointId) &&
        Objects.equals(this.prompt, textToImageRequestGenerateParams.prompt) &&
        Objects.equals(this.negativePrompt, textToImageRequestGenerateParams.negativePrompt) &&
        Objects.equals(this.sampler, textToImageRequestGenerateParams.sampler) &&
        Objects.equals(this.steps, textToImageRequestGenerateParams.steps) &&
        Objects.equals(this.cfgScale, textToImageRequestGenerateParams.cfgScale) &&
        Objects.equals(this.width, textToImageRequestGenerateParams.width) &&
        Objects.equals(this.height, textToImageRequestGenerateParams.height) &&
        Objects.equals(this.imgCount, textToImageRequestGenerateParams.imgCount) &&
        Objects.equals(this.randnSource, textToImageRequestGenerateParams.randnSource) &&
        Objects.equals(this.seed, textToImageRequestGenerateParams.seed) &&
        Objects.equals(this.restoreFaces, textToImageRequestGenerateParams.restoreFaces) &&
        Objects.equals(this.additionalNetwork, textToImageRequestGenerateParams.additionalNetwork) &&
        Objects.equals(this.hiResFixInfo, textToImageRequestGenerateParams.hiResFixInfo) &&
        Objects.equals(this.inpaintParam, textToImageRequestGenerateParams.inpaintParam) &&
        Objects.equals(this.controlNet, textToImageRequestGenerateParams.controlNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkPointId, prompt, negativePrompt, sampler, steps, cfgScale, width, height, imgCount, randnSource, seed, restoreFaces, additionalNetwork, hiResFixInfo, inpaintParam, controlNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextToImageRequestGenerateParams {\n");
    sb.append("    checkPointId: ").append(toIndentedString(checkPointId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    negativePrompt: ").append(toIndentedString(negativePrompt)).append("\n");
    sb.append("    sampler: ").append(toIndentedString(sampler)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    cfgScale: ").append(toIndentedString(cfgScale)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imgCount: ").append(toIndentedString(imgCount)).append("\n");
    sb.append("    randnSource: ").append(toIndentedString(randnSource)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    restoreFaces: ").append(toIndentedString(restoreFaces)).append("\n");
    sb.append("    additionalNetwork: ").append(toIndentedString(additionalNetwork)).append("\n");
    sb.append("    hiResFixInfo: ").append(toIndentedString(hiResFixInfo)).append("\n");
    sb.append("    inpaintParam: ").append(toIndentedString(inpaintParam)).append("\n");
    sb.append("    controlNet: ").append(toIndentedString(controlNet)).append("\n");
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
    openapiFields.add("checkPointId");
    openapiFields.add("prompt");
    openapiFields.add("negativePrompt");
    openapiFields.add("sampler");
    openapiFields.add("steps");
    openapiFields.add("cfgScale");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("imgCount");
    openapiFields.add("randnSource");
    openapiFields.add("seed");
    openapiFields.add("restoreFaces");
    openapiFields.add("additionalNetwork");
    openapiFields.add("hiResFixInfo");
    openapiFields.add("inpaintParam");
    openapiFields.add("controlNet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TextToImageRequestGenerateParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TextToImageRequestGenerateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TextToImageRequestGenerateParams is not found in the empty JSON string", TextToImageRequestGenerateParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TextToImageRequestGenerateParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TextToImageRequestGenerateParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("checkPointId") != null && !jsonObj.get("checkPointId").isJsonNull()) && !jsonObj.get("checkPointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `checkPointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("checkPointId").toString()));
      }
      if ((jsonObj.get("prompt") != null && !jsonObj.get("prompt").isJsonNull()) && !jsonObj.get("prompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt").toString()));
      }
      if ((jsonObj.get("negativePrompt") != null && !jsonObj.get("negativePrompt").isJsonNull()) && !jsonObj.get("negativePrompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `negativePrompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("negativePrompt").toString()));
      }
      if (jsonObj.get("additionalNetwork") != null && !jsonObj.get("additionalNetwork").isJsonNull()) {
        JsonArray jsonArrayadditionalNetwork = jsonObj.getAsJsonArray("additionalNetwork");
        if (jsonArrayadditionalNetwork != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalNetwork").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalNetwork` to be an array in the JSON string but got `%s`", jsonObj.get("additionalNetwork").toString()));
          }

          // validate the optional field `additionalNetwork` (array)
          for (int i = 0; i < jsonArrayadditionalNetwork.size(); i++) {
            AdditionalNetwork.validateJsonElement(jsonArrayadditionalNetwork.get(i));
          };
        }
      }
      // validate the optional field `hiResFixInfo`
      if (jsonObj.get("hiResFixInfo") != null && !jsonObj.get("hiResFixInfo").isJsonNull()) {
        TextToImageRequestGenerateParamsHiResFixInfo.validateJsonElement(jsonObj.get("hiResFixInfo"));
      }
      // validate the optional field `inpaintParam`
      if (jsonObj.get("inpaintParam") != null && !jsonObj.get("inpaintParam").isJsonNull()) {
        TextToImageRequestGenerateParamsInpaintParam.validateJsonElement(jsonObj.get("inpaintParam"));
      }
      if (jsonObj.get("controlNet") != null && !jsonObj.get("controlNet").isJsonNull()) {
        JsonArray jsonArraycontrolNet = jsonObj.getAsJsonArray("controlNet");
        if (jsonArraycontrolNet != null) {
          // ensure the json data is an array
          if (!jsonObj.get("controlNet").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `controlNet` to be an array in the JSON string but got `%s`", jsonObj.get("controlNet").toString()));
          }

          // validate the optional field `controlNet` (array)
          for (int i = 0; i < jsonArraycontrolNet.size(); i++) {
            ControlNet.validateJsonElement(jsonArraycontrolNet.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TextToImageRequestGenerateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TextToImageRequestGenerateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TextToImageRequestGenerateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TextToImageRequestGenerateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<TextToImageRequestGenerateParams>() {
           @Override
           public void write(JsonWriter out, TextToImageRequestGenerateParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TextToImageRequestGenerateParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TextToImageRequestGenerateParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TextToImageRequestGenerateParams
   * @throws IOException if the JSON string is invalid with respect to TextToImageRequestGenerateParams
   */
  public static TextToImageRequestGenerateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TextToImageRequestGenerateParams.class);
  }

  /**
   * Convert an instance of TextToImageRequestGenerateParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

