package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * AuthSuccess
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class AuthSuccess {

  private String accessToken;

  private String refreshToken;

  private Integer expiresIn;

  private User user;

  /**
   * Default constructor
   * @deprecated Use {@link AuthSuccess#AuthSuccess(String, Integer, User)}
   */
  @Deprecated
  public AuthSuccess() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthSuccess(String accessToken, Integer expiresIn, User user) {
    this.accessToken = accessToken;
    this.expiresIn = expiresIn;
    this.user = user;
  }

  public AuthSuccess accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * JWT access token.
   * @return accessToken
  */
  @NotNull 
  @Schema(name = "accessToken", description = "JWT access token.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accessToken")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public AuthSuccess refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * JWT refresh token (for long-lived sessions).
   * @return refreshToken
  */
  
  @Schema(name = "refreshToken", description = "JWT refresh token (for long-lived sessions).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refreshToken")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public AuthSuccess expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Access token expiration in seconds.
   * @return expiresIn
  */
  @NotNull 
  @Schema(name = "expiresIn", description = "Access token expiration in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expiresIn")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public AuthSuccess user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @NotNull @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthSuccess authSuccess = (AuthSuccess) o;
    return Objects.equals(this.accessToken, authSuccess.accessToken) &&
        Objects.equals(this.refreshToken, authSuccess.refreshToken) &&
        Objects.equals(this.expiresIn, authSuccess.expiresIn) &&
        Objects.equals(this.user, authSuccess.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, expiresIn, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthSuccess {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

