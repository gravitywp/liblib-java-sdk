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
import cloud.liblibai.openapi.client.model.InpaintParams;
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
 * ImageToImageRequestGenerateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-10T14:14:37.540292979+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ImageToImageRequestGenerateParams {
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

  public static final String SERIALIZED_NAME_CLIP_SKIP = "clipSkip";
  @SerializedName(SERIALIZED_NAME_CLIP_SKIP)
  @javax.annotation.Nullable
  private Integer clipSkip;

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

  public static final String SERIALIZED_NAME_RANDN_SOURCE = "randnSource";
  @SerializedName(SERIALIZED_NAME_RANDN_SOURCE)
  @javax.annotation.Nullable
  private Integer randnSource;

  public static final String SERIALIZED_NAME_SEED = "seed";
  @SerializedName(SERIALIZED_NAME_SEED)
  @javax.annotation.Nullable
  private Integer seed;

  public static final String SERIALIZED_NAME_IMG_COUNT = "imgCount";
  @SerializedName(SERIALIZED_NAME_IMG_COUNT)
  @javax.annotation.Nullable
  private Integer imgCount = 1;

  public static final String SERIALIZED_NAME_RESTORE_FACES = "restoreFaces";
  @SerializedName(SERIALIZED_NAME_RESTORE_FACES)
  @javax.annotation.Nullable
  private Integer restoreFaces = 0;

  public static final String SERIALIZED_NAME_SOURCE_IMAGE = "sourceImage";
  @SerializedName(SERIALIZED_NAME_SOURCE_IMAGE)
  @javax.annotation.Nullable
  private String sourceImage;

  public static final String SERIALIZED_NAME_RESIZE_MODE = "resizeMode";
  @SerializedName(SERIALIZED_NAME_RESIZE_MODE)
  @javax.annotation.Nullable
  private Integer resizeMode;

  public static final String SERIALIZED_NAME_RESIZED_WIDTH = "resizedWidth";
  @SerializedName(SERIALIZED_NAME_RESIZED_WIDTH)
  @javax.annotation.Nullable
  private Integer resizedWidth;

  public static final String SERIALIZED_NAME_RESIZED_HEIGHT = "resizedHeight";
  @SerializedName(SERIALIZED_NAME_RESIZED_HEIGHT)
  @javax.annotation.Nullable
  private Integer resizedHeight;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  @javax.annotation.Nullable
  private Integer mode;

  public static final String SERIALIZED_NAME_DENOISING_STRENGTH = "denoisingStrength";
  @SerializedName(SERIALIZED_NAME_DENOISING_STRENGTH)
  @javax.annotation.Nullable
  private Float denoisingStrength;

  public static final String SERIALIZED_NAME_ADDITIONAL_NETWORK = "additionalNetwork";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_NETWORK)
  @javax.annotation.Nullable
  private List<AdditionalNetwork> additionalNetwork;

  public static final String SERIALIZED_NAME_INPAINT_PARAM = "inpaintParam";
  @SerializedName(SERIALIZED_NAME_INPAINT_PARAM)
  @javax.annotation.Nullable
  private InpaintParams inpaintParam;

  public static final String SERIALIZED_NAME_CONTROL_NET = "controlNet";
  @SerializedName(SERIALIZED_NAME_CONTROL_NET)
  @javax.annotation.Nullable
  private List<ControlNet> controlNet;

  public ImageToImageRequestGenerateParams() {
  }

  public ImageToImageRequestGenerateParams checkPointId(@javax.annotation.Nullable String checkPointId) {
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


  public ImageToImageRequestGenerateParams prompt(@javax.annotation.Nullable String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * 正向提示词
   * @return prompt
   */
  @javax.annotation.Nullable
  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(@javax.annotation.Nullable String prompt) {
    this.prompt = prompt;
  }


  public ImageToImageRequestGenerateParams negativePrompt(@javax.annotation.Nullable String negativePrompt) {
    this.negativePrompt = negativePrompt;
    return this;
  }

  /**
   * 负向提示词
   * @return negativePrompt
   */
  @javax.annotation.Nullable
  public String getNegativePrompt() {
    return negativePrompt;
  }

  public void setNegativePrompt(@javax.annotation.Nullable String negativePrompt) {
    this.negativePrompt = negativePrompt;
  }


  public ImageToImageRequestGenerateParams clipSkip(@javax.annotation.Nullable Integer clipSkip) {
    this.clipSkip = clipSkip;
    return this;
  }

  /**
   * Clip跳过层
   * @return clipSkip
   */
  @javax.annotation.Nullable
  public Integer getClipSkip() {
    return clipSkip;
  }

  public void setClipSkip(@javax.annotation.Nullable Integer clipSkip) {
    this.clipSkip = clipSkip;
  }


  public ImageToImageRequestGenerateParams sampler(@javax.annotation.Nullable Integer sampler) {
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


  public ImageToImageRequestGenerateParams steps(@javax.annotation.Nullable Integer steps) {
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


  public ImageToImageRequestGenerateParams cfgScale(@javax.annotation.Nullable Integer cfgScale) {
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


  public ImageToImageRequestGenerateParams randnSource(@javax.annotation.Nullable Integer randnSource) {
    this.randnSource = randnSource;
    return this;
  }

  /**
   * 随机种子来源，0表示CPU，1表示GPU
   * @return randnSource
   */
  @javax.annotation.Nullable
  public Integer getRandnSource() {
    return randnSource;
  }

  public void setRandnSource(@javax.annotation.Nullable Integer randnSource) {
    this.randnSource = randnSource;
  }


  public ImageToImageRequestGenerateParams seed(@javax.annotation.Nullable Integer seed) {
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


  public ImageToImageRequestGenerateParams imgCount(@javax.annotation.Nullable Integer imgCount) {
    this.imgCount = imgCount;
    return this;
  }

  /**
   * 图片数量，1到4
   * @return imgCount
   */
  @javax.annotation.Nullable
  public Integer getImgCount() {
    return imgCount;
  }

  public void setImgCount(@javax.annotation.Nullable Integer imgCount) {
    this.imgCount = imgCount;
  }


  public ImageToImageRequestGenerateParams restoreFaces(@javax.annotation.Nullable Integer restoreFaces) {
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


  public ImageToImageRequestGenerateParams sourceImage(@javax.annotation.Nullable String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * 源图像地址
   * @return sourceImage
   */
  @javax.annotation.Nullable
  public String getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(@javax.annotation.Nullable String sourceImage) {
    this.sourceImage = sourceImage;
  }


  public ImageToImageRequestGenerateParams resizeMode(@javax.annotation.Nullable Integer resizeMode) {
    this.resizeMode = resizeMode;
    return this;
  }

  /**
   * 缩放模式，0拉伸，1裁剪，2填充
   * @return resizeMode
   */
  @javax.annotation.Nullable
  public Integer getResizeMode() {
    return resizeMode;
  }

  public void setResizeMode(@javax.annotation.Nullable Integer resizeMode) {
    this.resizeMode = resizeMode;
  }


  public ImageToImageRequestGenerateParams resizedWidth(@javax.annotation.Nullable Integer resizedWidth) {
    this.resizedWidth = resizedWidth;
    return this;
  }

  /**
   * 图像缩放后的宽度
   * @return resizedWidth
   */
  @javax.annotation.Nullable
  public Integer getResizedWidth() {
    return resizedWidth;
  }

  public void setResizedWidth(@javax.annotation.Nullable Integer resizedWidth) {
    this.resizedWidth = resizedWidth;
  }


  public ImageToImageRequestGenerateParams resizedHeight(@javax.annotation.Nullable Integer resizedHeight) {
    this.resizedHeight = resizedHeight;
    return this;
  }

  /**
   * 图像缩放后的高度
   * @return resizedHeight
   */
  @javax.annotation.Nullable
  public Integer getResizedHeight() {
    return resizedHeight;
  }

  public void setResizedHeight(@javax.annotation.Nullable Integer resizedHeight) {
    this.resizedHeight = resizedHeight;
  }


  public ImageToImageRequestGenerateParams mode(@javax.annotation.Nullable Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * 0图生图，4局部重绘
   * @return mode
   */
  @javax.annotation.Nullable
  public Integer getMode() {
    return mode;
  }

  public void setMode(@javax.annotation.Nullable Integer mode) {
    this.mode = mode;
  }


  public ImageToImageRequestGenerateParams denoisingStrength(@javax.annotation.Nullable Float denoisingStrength) {
    this.denoisingStrength = denoisingStrength;
    return this;
  }

  /**
   * 重绘幅度
   * @return denoisingStrength
   */
  @javax.annotation.Nullable
  public Float getDenoisingStrength() {
    return denoisingStrength;
  }

  public void setDenoisingStrength(@javax.annotation.Nullable Float denoisingStrength) {
    this.denoisingStrength = denoisingStrength;
  }


  public ImageToImageRequestGenerateParams additionalNetwork(@javax.annotation.Nullable List<AdditionalNetwork> additionalNetwork) {
    this.additionalNetwork = additionalNetwork;
    return this;
  }

  public ImageToImageRequestGenerateParams addAdditionalNetworkItem(AdditionalNetwork additionalNetworkItem) {
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


  public ImageToImageRequestGenerateParams inpaintParam(@javax.annotation.Nullable InpaintParams inpaintParam) {
    this.inpaintParam = inpaintParam;
    return this;
  }

  /**
   * Get inpaintParam
   * @return inpaintParam
   */
  @javax.annotation.Nullable
  public InpaintParams getInpaintParam() {
    return inpaintParam;
  }

  public void setInpaintParam(@javax.annotation.Nullable InpaintParams inpaintParam) {
    this.inpaintParam = inpaintParam;
  }


  public ImageToImageRequestGenerateParams controlNet(@javax.annotation.Nullable List<ControlNet> controlNet) {
    this.controlNet = controlNet;
    return this;
  }

  public ImageToImageRequestGenerateParams addControlNetItem(ControlNet controlNetItem) {
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
    ImageToImageRequestGenerateParams imageToImageRequestGenerateParams = (ImageToImageRequestGenerateParams) o;
    return Objects.equals(this.checkPointId, imageToImageRequestGenerateParams.checkPointId) &&
        Objects.equals(this.prompt, imageToImageRequestGenerateParams.prompt) &&
        Objects.equals(this.negativePrompt, imageToImageRequestGenerateParams.negativePrompt) &&
        Objects.equals(this.clipSkip, imageToImageRequestGenerateParams.clipSkip) &&
        Objects.equals(this.sampler, imageToImageRequestGenerateParams.sampler) &&
        Objects.equals(this.steps, imageToImageRequestGenerateParams.steps) &&
        Objects.equals(this.cfgScale, imageToImageRequestGenerateParams.cfgScale) &&
        Objects.equals(this.randnSource, imageToImageRequestGenerateParams.randnSource) &&
        Objects.equals(this.seed, imageToImageRequestGenerateParams.seed) &&
        Objects.equals(this.imgCount, imageToImageRequestGenerateParams.imgCount) &&
        Objects.equals(this.restoreFaces, imageToImageRequestGenerateParams.restoreFaces) &&
        Objects.equals(this.sourceImage, imageToImageRequestGenerateParams.sourceImage) &&
        Objects.equals(this.resizeMode, imageToImageRequestGenerateParams.resizeMode) &&
        Objects.equals(this.resizedWidth, imageToImageRequestGenerateParams.resizedWidth) &&
        Objects.equals(this.resizedHeight, imageToImageRequestGenerateParams.resizedHeight) &&
        Objects.equals(this.mode, imageToImageRequestGenerateParams.mode) &&
        Objects.equals(this.denoisingStrength, imageToImageRequestGenerateParams.denoisingStrength) &&
        Objects.equals(this.additionalNetwork, imageToImageRequestGenerateParams.additionalNetwork) &&
        Objects.equals(this.inpaintParam, imageToImageRequestGenerateParams.inpaintParam) &&
        Objects.equals(this.controlNet, imageToImageRequestGenerateParams.controlNet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkPointId, prompt, negativePrompt, clipSkip, sampler, steps, cfgScale, randnSource, seed, imgCount, restoreFaces, sourceImage, resizeMode, resizedWidth, resizedHeight, mode, denoisingStrength, additionalNetwork, inpaintParam, controlNet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToImageRequestGenerateParams {\n");
    sb.append("    checkPointId: ").append(toIndentedString(checkPointId)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    negativePrompt: ").append(toIndentedString(negativePrompt)).append("\n");
    sb.append("    clipSkip: ").append(toIndentedString(clipSkip)).append("\n");
    sb.append("    sampler: ").append(toIndentedString(sampler)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    cfgScale: ").append(toIndentedString(cfgScale)).append("\n");
    sb.append("    randnSource: ").append(toIndentedString(randnSource)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    imgCount: ").append(toIndentedString(imgCount)).append("\n");
    sb.append("    restoreFaces: ").append(toIndentedString(restoreFaces)).append("\n");
    sb.append("    sourceImage: ").append(toIndentedString(sourceImage)).append("\n");
    sb.append("    resizeMode: ").append(toIndentedString(resizeMode)).append("\n");
    sb.append("    resizedWidth: ").append(toIndentedString(resizedWidth)).append("\n");
    sb.append("    resizedHeight: ").append(toIndentedString(resizedHeight)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    denoisingStrength: ").append(toIndentedString(denoisingStrength)).append("\n");
    sb.append("    additionalNetwork: ").append(toIndentedString(additionalNetwork)).append("\n");
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
    openapiFields.add("clipSkip");
    openapiFields.add("sampler");
    openapiFields.add("steps");
    openapiFields.add("cfgScale");
    openapiFields.add("randnSource");
    openapiFields.add("seed");
    openapiFields.add("imgCount");
    openapiFields.add("restoreFaces");
    openapiFields.add("sourceImage");
    openapiFields.add("resizeMode");
    openapiFields.add("resizedWidth");
    openapiFields.add("resizedHeight");
    openapiFields.add("mode");
    openapiFields.add("denoisingStrength");
    openapiFields.add("additionalNetwork");
    openapiFields.add("inpaintParam");
    openapiFields.add("controlNet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ImageToImageRequestGenerateParams
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ImageToImageRequestGenerateParams.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ImageToImageRequestGenerateParams is not found in the empty JSON string", ImageToImageRequestGenerateParams.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ImageToImageRequestGenerateParams.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageToImageRequestGenerateParams` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if ((jsonObj.get("sourceImage") != null && !jsonObj.get("sourceImage").isJsonNull()) && !jsonObj.get("sourceImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceImage").toString()));
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
      // validate the optional field `inpaintParam`
      if (jsonObj.get("inpaintParam") != null && !jsonObj.get("inpaintParam").isJsonNull()) {
        InpaintParams.validateJsonElement(jsonObj.get("inpaintParam"));
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
       if (!ImageToImageRequestGenerateParams.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageToImageRequestGenerateParams' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageToImageRequestGenerateParams> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageToImageRequestGenerateParams.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageToImageRequestGenerateParams>() {
           @Override
           public void write(JsonWriter out, ImageToImageRequestGenerateParams value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageToImageRequestGenerateParams read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ImageToImageRequestGenerateParams given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ImageToImageRequestGenerateParams
   * @throws IOException if the JSON string is invalid with respect to ImageToImageRequestGenerateParams
   */
  public static ImageToImageRequestGenerateParams fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageToImageRequestGenerateParams.class);
  }

  /**
   * Convert an instance of ImageToImageRequestGenerateParams to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

