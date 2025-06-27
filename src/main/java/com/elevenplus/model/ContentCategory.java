package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;
import java.util.UUID;

/**
 * ContentCategory
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class ContentCategory {

  private UUID categoryId;

  private UUID sectionId;

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ContentCategory#ContentCategory(UUID, UUID, String)}
   */
  @Deprecated
  public ContentCategory() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentCategory(UUID categoryId, UUID sectionId, String name) {
    this.categoryId = categoryId;
    this.sectionId = sectionId;
    this.name = name;
  }

  public ContentCategory categoryId(UUID categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Unique identifier for the content category.
   * @return categoryId
  */
  @NotNull @Valid 
  @Schema(name = "categoryId", description = "Unique identifier for the content category.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("categoryId")
  public UUID getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(UUID categoryId) {
    this.categoryId = categoryId;
  }

  public ContentCategory sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * ID of the section this category belongs to.
   * @return sectionId
  */
  @NotNull @Valid 
  @Schema(name = "sectionId", description = "ID of the section this category belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sectionId")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public ContentCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the content category (e.g., 'Algebra', 'Physics').
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the content category (e.g., 'Algebra', 'Physics').", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ContentCategory contentCategory = (ContentCategory) o;
    return Objects.equals(this.categoryId, contentCategory.categoryId) &&
        Objects.equals(this.sectionId, contentCategory.sectionId) &&
        Objects.equals(this.name, contentCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, sectionId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentCategory {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
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

