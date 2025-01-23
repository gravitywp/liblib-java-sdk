//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package cloud.liblibai.openapi.client.auth;

import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.Pair;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.RandomStringUtils;
import cloud.liblibai.openapi.client.ApiException;
import cloud.liblibai.openapi.client.Pair;

public class ApiKeyAuth implements Authentication {
  private final String location;
  private final String paramName;
  private String apiKey;
  private String apiKeyPrefix;

  public ApiKeyAuth(String location, String paramName) {
    this.location = location;
    this.paramName = paramName;
  }

  public String getLocation() {
    return this.location;
  }

  public String getParamName() {
    return this.paramName;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public String getApiKeyPrefix() {
    return this.apiKeyPrefix;
  }

  public void setApiKeyPrefix(String apiKeyPrefix) {
    this.apiKeyPrefix = apiKeyPrefix;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri) throws ApiException {
    if (this.apiKey != null) {
      String value = this.apiKey;
      Long timestamp = System.currentTimeMillis();
      String signatureNonce = RandomStringUtils.randomAlphanumeric(10);
      String content = uri.getPath() + "&" + timestamp + "&" + signatureNonce;

      String signature;
      try {
        SecretKeySpec secret = new SecretKeySpec(this.apiKeyPrefix.getBytes(), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secret);
        signature = Base64.encodeBase64URLSafeString(mac.doFinal(content.getBytes()));
      } catch (NoSuchAlgorithmException var14) {
        throw new RuntimeException("no such algorithm");
      } catch (InvalidKeyException e) {
        throw new RuntimeException(e);
      }

      if ("query".equals(this.location)) {
        queryParams.add(new Pair(this.paramName, value));
        queryParams.add(new Pair("SignatureNonce", signatureNonce));
        queryParams.add(new Pair("Timestamp", timestamp.toString()));
        queryParams.add(new Pair("Signature", signature));
      } else if ("header".equals(this.location)) {
        headerParams.put(this.paramName, value);
      } else if ("cookie".equals(this.location)) {
        cookieParams.put(this.paramName, value);
      }

    }

  }
}
