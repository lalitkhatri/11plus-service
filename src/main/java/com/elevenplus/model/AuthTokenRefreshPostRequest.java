package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * AuthTokenRefreshPostRequest
 */

@JsonTypeName("_auth_token_refresh_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class AuthTokenRefreshPostRequest {

  private String refreshToken;

  /**
   * Default constructor
   * @deprecated Use {@link AuthTokenRefreshPostRequest#AuthTokenRefreshPostRequest(String)}
   */
  @Deprecated
  public AuthTokenRefreshPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthTokenRefreshPostRequest(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AuthTokenRefreshPostRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Refresh token provided during login.
   * @return refreshToken
  */
  @NotNull 
  @Schema(name = "refreshToken", description = "Refresh token provided during login.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthTokenRefreshPostRequest authTokenRefreshPostRequest = (AuthTokenRefreshPostRequest) o;
    return Objects.equals(this.refreshToken, authTokenRefreshPostRequest.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthTokenRefreshPostRequest {\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
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
}

