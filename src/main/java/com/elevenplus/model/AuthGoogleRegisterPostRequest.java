package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * AuthGoogleRegisterPostRequest
 */

@JsonTypeName("_auth_google_register_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class AuthGoogleRegisterPostRequest {

  private String idToken;

  /**
   * Desired role for the new user (student or parent).
   */
  public enum RoleEnum {
    STUDENT("student"),
    
    PARENT("parent");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RoleEnum role;

  /**
   * Default constructor
   * @deprecated Use {@link AuthGoogleRegisterPostRequest#AuthGoogleRegisterPostRequest(String, RoleEnum)}
   */
  @Deprecated
  public AuthGoogleRegisterPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthGoogleRegisterPostRequest(String idToken, RoleEnum role) {
    this.idToken = idToken;
    this.role = role;
  }

  public AuthGoogleRegisterPostRequest idToken(String idToken) {
    this.idToken = idToken;
    return this;
  }

  /**
   * Google ID token received from the frontend.
   * @return idToken
  */
  @NotNull 
  @Schema(name = "idToken", description = "Google ID token received from the frontend.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("idToken")
  public String getIdToken() {
    return idToken;
  }

  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }

  public AuthGoogleRegisterPostRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Desired role for the new user (student or parent).
   * @return role
  */
  @NotNull 
  @Schema(name = "role", description = "Desired role for the new user (student or parent).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthGoogleRegisterPostRequest authGoogleRegisterPostRequest = (AuthGoogleRegisterPostRequest) o;
    return Objects.equals(this.idToken, authGoogleRegisterPostRequest.idToken) &&
        Objects.equals(this.role, authGoogleRegisterPostRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idToken, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthGoogleRegisterPostRequest {\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

