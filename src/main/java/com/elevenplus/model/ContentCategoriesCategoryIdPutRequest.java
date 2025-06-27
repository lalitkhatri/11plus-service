package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * ContentCategoriesCategoryIdPutRequest
 */

@JsonTypeName("_content_categories__categoryId__put_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class ContentCategoriesCategoryIdPutRequest {

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ContentCategoriesCategoryIdPutRequest#ContentCategoriesCategoryIdPutRequest(String)}
   */
  @Deprecated
  public ContentCategoriesCategoryIdPutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentCategoriesCategoryIdPutRequest(String name) {
    this.name = name;
  }

  public ContentCategoriesCategoryIdPutRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * New name for the category.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "New name for the category.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ContentCategoriesCategoryIdPutRequest contentCategoriesCategoryIdPutRequest = (ContentCategoriesCategoryIdPutRequest) o;
    return Objects.equals(this.name, contentCategoriesCategoryIdPutRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCategoriesCategoryIdPutRequest {\n");
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

