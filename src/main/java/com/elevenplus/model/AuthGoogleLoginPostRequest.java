package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import java.util.Objects;

/**
 * AuthGoogleLoginPostRequest
 */

@JsonTypeName("_auth_google_login_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class AuthGoogleLoginPostRequest {

  private String idToken;

  public AuthGoogleLoginPostRequest idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Google ID token received from the frontend.
   * @return idToken
  */
  
  @Schema(name = "idToken", description = "Google ID token received from the frontend.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("idToken")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGoogleLoginPostRequest authGoogleLoginPostRequest = (AuthGoogleLoginPostRequest) o;
    return Objects.equals(this.idToken, authGoogleLoginPostRequest.idToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGoogleLoginPostRequest {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
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

