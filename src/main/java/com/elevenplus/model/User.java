package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class User {

  private UUID userId;

  private String email;

  private String name;

  /**
   * Role of the user in the system.
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
   * Current status of the user account.
   */
  public enum StatusEnum {
    ACTIVE("active"),
    
    BLOCKED("blocked");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  /**
   * Default constructor
   * @deprecated Use {@link User#User(UUID, String, String, RoleEnum, StatusEnum)}
   */
  @Deprecated
  public User() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public User(UUID userId, String email, String name, RoleEnum role, StatusEnum status) {
    this.userId = userId;
    this.email = email;
    this.name = name;
    this.role = role;
    this.status = status;
  }

  public User userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Unique identifier for the user.
   * @return userId
  */
  @NotNull @Valid 
  @Schema(name = "userId", description = "Unique identifier for the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's email address.
   * @return email
  */
  @NotNull @javax.validation.constraints.Email
  @Schema(name = "email", description = "User's email address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User's full name.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "User's full name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the user in the system.
   * @return role
  */
  @NotNull 
  @Schema(name = "role", description = "Role of the user in the system.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public User status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Current status of the user account.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Current status of the user account.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public User createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the user account was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", description = "Timestamp when the user account was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public User updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the user account was last updated.
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", description = "Timestamp when the user account was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.role, user.role) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.updatedAt, user.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, email, name, role, status, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

