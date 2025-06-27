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
 * UsersUserIdRolePutRequest
 */

@JsonTypeName("_users__userId__role_put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class UsersUserIdRolePutRequest {

  /**
   * New role for the user.
   */
  public enum RoleEnum {
    ADMIN("admin"),
    
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
   * @deprecated Use {@link UsersUserIdRolePutRequest#UsersUserIdRolePutRequest(RoleEnum)}
   */
  @Deprecated
  public UsersUserIdRolePutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsersUserIdRolePutRequest(RoleEnum role) {
    this.role = role;
  }

  public UsersUserIdRolePutRequest role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * New role for the user.
   * @return role
  */
  @NotNull 
  @Schema(name = "role", description = "New role for the user.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UsersUserIdRolePutRequest usersUserIdRolePutRequest = (UsersUserIdRolePutRequest) o;
    return Objects.equals(this.role, usersUserIdRolePutRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUserIdRolePutRequest {\n");
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

