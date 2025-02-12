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

import cloud.liblibai.openapi.client.JSON;

/**
 * ControlNet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-12T21:18:25.814917097+08:00[Asia/Shanghai]", comments = "Generator version: 7.10.0")
public class ControlNet {
  public static final String SERIALIZED_NAME_UNIT_ORDER = "unitOrder";
  @SerializedName(SERIALIZED_NAME_UNIT_ORDER)
  @javax.annotation.Nullable
  private Integer unitOrder = 1;

  public static final String SERIALIZED_NAME_SOURCE_IMAGE = "sourceImage";
  @SerializedName(SERIALIZED_NAME_SOURCE_IMAGE)
  @javax.annotation.Nullable
  private String sourceImage;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  @javax.annotation.Nullable
  private Integer width = 1024;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  @javax.annotation.Nullable
  private Integer height = 1024;

  public static final String SERIALIZED_NAME_PREPROCESSOR = "preprocessor";
  @SerializedName(SERIALIZED_NAME_PREPROCESSOR)
  @javax.annotation.Nullable
  private Integer preprocessor;

  public static final String SERIALIZED_NAME_ANNOTATION_PARAMETERS = "annotationParameters";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_PARAMETERS)
  @javax.annotation.Nullable
  private Map<String, Object> annotationParameters;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  @javax.annotation.Nullable
  private String model;

  public static final String SERIALIZED_NAME_CONTROL_WEIGHT = "controlWeight";
  @SerializedName(SERIALIZED_NAME_CONTROL_WEIGHT)
  @javax.annotation.Nullable
  private Float controlWeight;

  public static final String SERIALIZED_NAME_STARTING_CONTROL_STEP = "startingControlStep";
  @SerializedName(SERIALIZED_NAME_STARTING_CONTROL_STEP)
  @javax.annotation.Nullable
  private Integer startingControlStep;

  public static final String SERIALIZED_NAME_ENDING_CONTROL_STEP = "endingControlStep";
  @SerializedName(SERIALIZED_NAME_ENDING_CONTROL_STEP)
  @javax.annotation.Nullable
  private Integer endingControlStep;

  public static final String SERIALIZED_NAME_PIXEL_PERFECT = "pixelPerfect";
  @SerializedName(SERIALIZED_NAME_PIXEL_PERFECT)
  @javax.annotation.Nullable
  private Integer pixelPerfect;

  public static final String SERIALIZED_NAME_CONTROL_MODE = "controlMode";
  @SerializedName(SERIALIZED_NAME_CONTROL_MODE)
  @javax.annotation.Nullable
  private Integer controlMode;

  public static final String SERIALIZED_NAME_RESIZE_MODE = "resizeMode";
  @SerializedName(SERIALIZED_NAME_RESIZE_MODE)
  @javax.annotation.Nullable
  private Integer resizeMode;

  public static final String SERIALIZED_NAME_MASK_IMAGE = "maskImage";
  @SerializedName(SERIALIZED_NAME_MASK_IMAGE)
  @javax.annotation.Nullable
  private String maskImage;

  public ControlNet() {
  }

  public ControlNet unitOrder(@javax.annotation.Nullable Integer unitOrder) {
    this.unitOrder = unitOrder;
    return this;
  }

  /**
   * 执行顺序
   * @return unitOrder
   */
  @javax.annotation.Nullable
  public Integer getUnitOrder() {
    return unitOrder;
  }

  public void setUnitOrder(@javax.annotation.Nullable Integer unitOrder) {
    this.unitOrder = unitOrder;
  }


  public ControlNet sourceImage(@javax.annotation.Nullable String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * 参考图地址
   * @return sourceImage
   */
  @javax.annotation.Nullable
  public String getSourceImage() {
    return sourceImage;
  }

  public void setSourceImage(@javax.annotation.Nullable String sourceImage) {
    this.sourceImage = sourceImage;
  }


  public ControlNet width(@javax.annotation.Nullable Integer width) {
    this.width = width;
    return this;
  }

  /**
   * 参考图宽度
   * @return width
   */
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }

  public void setWidth(@javax.annotation.Nullable Integer width) {
    this.width = width;
  }


  public ControlNet height(@javax.annotation.Nullable Integer height) {
    this.height = height;
    return this;
  }

  /**
   * 参考图高度
   * @return height
   */
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }

  public void setHeight(@javax.annotation.Nullable Integer height) {
    this.height = height;
  }


  public ControlNet preprocessor(@javax.annotation.Nullable Integer preprocessor) {
    this.preprocessor = preprocessor;
    return this;
  }

  /**
   * 预处理器枚举值
   * @return preprocessor
   */
  @javax.annotation.Nullable
  public Integer getPreprocessor() {
    return preprocessor;
  }

  public void setPreprocessor(@javax.annotation.Nullable Integer preprocessor) {
    this.preprocessor = preprocessor;
  }


  public ControlNet annotationParameters(@javax.annotation.Nullable Map<String, Object> annotationParameters) {
    this.annotationParameters = annotationParameters;
    return this;
  }

  public ControlNet putAnnotationParametersItem(String key, Object annotationParametersItem) {
    if (this.annotationParameters == null) {
      this.annotationParameters = new HashMap<>();
    }
    this.annotationParameters.put(key, annotationParametersItem);
    return this;
  }

  /**
   * Get annotationParameters
   * @return annotationParameters
   */
  @javax.annotation.Nullable
  public Map<String, Object> getAnnotationParameters() {
    return annotationParameters;
  }

  public void setAnnotationParameters(@javax.annotation.Nullable Map<String, Object> annotationParameters) {
    this.annotationParameters = annotationParameters;
  }


  public ControlNet model(@javax.annotation.Nullable String model) {
    this.model = model;
    return this;
  }

  /**
   * controlnet的模型
   * @return model
   */
  @javax.annotation.Nullable
  public String getModel() {
    return model;
  }

  public void setModel(@javax.annotation.Nullable String model) {
    this.model = model;
  }


  public ControlNet controlWeight(@javax.annotation.Nullable Float controlWeight) {
    this.controlWeight = controlWeight;
    return this;
  }

  /**
   * 控制权重
   * @return controlWeight
   */
  @javax.annotation.Nullable
  public Float getControlWeight() {
    return controlWeight;
  }

  public void setControlWeight(@javax.annotation.Nullable Float controlWeight) {
    this.controlWeight = controlWeight;
  }


  public ControlNet startingControlStep(@javax.annotation.Nullable Integer startingControlStep) {
    this.startingControlStep = startingControlStep;
    return this;
  }

  /**
   * 开始控制步数
   * @return startingControlStep
   */
  @javax.annotation.Nullable
  public Integer getStartingControlStep() {
    return startingControlStep;
  }

  public void setStartingControlStep(@javax.annotation.Nullable Integer startingControlStep) {
    this.startingControlStep = startingControlStep;
  }


  public ControlNet endingControlStep(@javax.annotation.Nullable Integer endingControlStep) {
    this.endingControlStep = endingControlStep;
    return this;
  }

  /**
   * 结束控制步数
   * @return endingControlStep
   */
  @javax.annotation.Nullable
  public Integer getEndingControlStep() {
    return endingControlStep;
  }

  public void setEndingControlStep(@javax.annotation.Nullable Integer endingControlStep) {
    this.endingControlStep = endingControlStep;
  }


  public ControlNet pixelPerfect(@javax.annotation.Nullable Integer pixelPerfect) {
    this.pixelPerfect = pixelPerfect;
    return this;
  }

  /**
   * 完美像素
   * @return pixelPerfect
   */
  @javax.annotation.Nullable
  public Integer getPixelPerfect() {
    return pixelPerfect;
  }

  public void setPixelPerfect(@javax.annotation.Nullable Integer pixelPerfect) {
    this.pixelPerfect = pixelPerfect;
  }


  public ControlNet controlMode(@javax.annotation.Nullable Integer controlMode) {
    this.controlMode = controlMode;
    return this;
  }

  /**
   * 控制模式，0均衡，1更注重提示词，2更注重controlnet
   * @return controlMode
   */
  @javax.annotation.Nullable
  public Integer getControlMode() {
    return controlMode;
  }

  public void setControlMode(@javax.annotation.Nullable Integer controlMode) {
    this.controlMode = controlMode;
  }


  public ControlNet resizeMode(@javax.annotation.Nullable Integer resizeMode) {
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


  public ControlNet maskImage(@javax.annotation.Nullable String maskImage) {
    this.maskImage = maskImage;
    return this;
  }

  /**
   * 蒙版图
   * @return maskImage
   */
  @javax.annotation.Nullable
  public String getMaskImage() {
    return maskImage;
  }

  public void setMaskImage(@javax.annotation.Nullable String maskImage) {
    this.maskImage = maskImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlNet controlNet = (ControlNet) o;
    return Objects.equals(this.unitOrder, controlNet.unitOrder) &&
        Objects.equals(this.sourceImage, controlNet.sourceImage) &&
        Objects.equals(this.width, controlNet.width) &&
        Objects.equals(this.height, controlNet.height) &&
        Objects.equals(this.preprocessor, controlNet.preprocessor) &&
        Objects.equals(this.annotationParameters, controlNet.annotationParameters) &&
        Objects.equals(this.model, controlNet.model) &&
        Objects.equals(this.controlWeight, controlNet.controlWeight) &&
        Objects.equals(this.startingControlStep, controlNet.startingControlStep) &&
        Objects.equals(this.endingControlStep, controlNet.endingControlStep) &&
        Objects.equals(this.pixelPerfect, controlNet.pixelPerfect) &&
        Objects.equals(this.controlMode, controlNet.controlMode) &&
        Objects.equals(this.resizeMode, controlNet.resizeMode) &&
        Objects.equals(this.maskImage, controlNet.maskImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitOrder, sourceImage, width, height, preprocessor, annotationParameters, model, controlWeight, startingControlStep, endingControlStep, pixelPerfect, controlMode, resizeMode, maskImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlNet {\n");
    sb.append("    unitOrder: ").append(toIndentedString(unitOrder)).append("\n");
    sb.append("    sourceImage: ").append(toIndentedString(sourceImage)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    preprocessor: ").append(toIndentedString(preprocessor)).append("\n");
    sb.append("    annotationParameters: ").append(toIndentedString(annotationParameters)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    controlWeight: ").append(toIndentedString(controlWeight)).append("\n");
    sb.append("    startingControlStep: ").append(toIndentedString(startingControlStep)).append("\n");
    sb.append("    endingControlStep: ").append(toIndentedString(endingControlStep)).append("\n");
    sb.append("    pixelPerfect: ").append(toIndentedString(pixelPerfect)).append("\n");
    sb.append("    controlMode: ").append(toIndentedString(controlMode)).append("\n");
    sb.append("    resizeMode: ").append(toIndentedString(resizeMode)).append("\n");
    sb.append("    maskImage: ").append(toIndentedString(maskImage)).append("\n");
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
    openapiFields.add("unitOrder");
    openapiFields.add("sourceImage");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("preprocessor");
    openapiFields.add("annotationParameters");
    openapiFields.add("model");
    openapiFields.add("controlWeight");
    openapiFields.add("startingControlStep");
    openapiFields.add("endingControlStep");
    openapiFields.add("pixelPerfect");
    openapiFields.add("controlMode");
    openapiFields.add("resizeMode");
    openapiFields.add("maskImage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ControlNet
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ControlNet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ControlNet is not found in the empty JSON string", ControlNet.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ControlNet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ControlNet` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("sourceImage") != null && !jsonObj.get("sourceImage").isJsonNull()) && !jsonObj.get("sourceImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceImage").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("maskImage") != null && !jsonObj.get("maskImage").isJsonNull()) && !jsonObj.get("maskImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskImage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ControlNet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ControlNet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ControlNet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ControlNet.class));

       return (TypeAdapter<T>) new TypeAdapter<ControlNet>() {
           @Override
           public void write(JsonWriter out, ControlNet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ControlNet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ControlNet given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ControlNet
   * @throws IOException if the JSON string is invalid with respect to ControlNet
   */
  public static ControlNet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ControlNet.class);
  }

  /**
   * Convert an instance of ControlNet to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

