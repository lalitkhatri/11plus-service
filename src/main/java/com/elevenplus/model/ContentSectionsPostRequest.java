package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * ContentSectionsPostRequest
 */

@JsonTypeName("_content_sections_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class ContentSectionsPostRequest {

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ContentSectionsPostRequest#ContentSectionsPostRequest(String)}
   */
  @Deprecated
  public ContentSectionsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentSectionsPostRequest(String name) {
    this.name = name;
  }

  public ContentSectionsPostRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the new section.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the new section.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentSectionsPostRequest contentSectionsPostRequest = (ContentSectionsPostRequest) o;
    return Objects.equals(this.name, contentSectionsPostRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSectionsPostRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

