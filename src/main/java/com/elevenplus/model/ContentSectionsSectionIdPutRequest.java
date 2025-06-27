package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * ContentSectionsSectionIdPutRequest
 */

@JsonTypeName("_content_sections__sectionId__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class ContentSectionsSectionIdPutRequest {

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ContentSectionsSectionIdPutRequest#ContentSectionsSectionIdPutRequest(String)}
   */
  @Deprecated
  public ContentSectionsSectionIdPutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentSectionsSectionIdPutRequest(String name) {
    this.name = name;
  }

  public ContentSectionsSectionIdPutRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * New name for the section.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "New name for the section.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ContentSectionsSectionIdPutRequest contentSectionsSectionIdPutRequest = (ContentSectionsSectionIdPutRequest) o;
    return Objects.equals(this.name, contentSectionsSectionIdPutRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSectionsSectionIdPutRequest {\n");
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

