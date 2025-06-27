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
 * UsersUserIdStatusPutRequest
 */

@JsonTypeName("_users__userId__status_put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class UsersUserIdStatusPutRequest {

  /**
   * New status for the user.
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

  /**
   * Default constructor
   * @deprecated Use {@link UsersUserIdStatusPutRequest#UsersUserIdStatusPutRequest(StatusEnum)}
   */
  @Deprecated
  public UsersUserIdStatusPutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UsersUserIdStatusPutRequest(StatusEnum status) {
    this.status = status;
  }

  public UsersUserIdStatusPutRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * New status for the user.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "New status for the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersUserIdStatusPutRequest usersUserIdStatusPutRequest = (UsersUserIdStatusPutRequest) o;
    return Objects.equals(this.status, usersUserIdStatusPutRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersUserIdStatusPutRequest {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

