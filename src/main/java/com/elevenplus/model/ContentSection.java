package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Objects;
import java.util.UUID;

/**
 * ContentSection
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class ContentSection {

  private UUID sectionId;

  private String name;

  /**
   * Default constructor
   * @deprecated Use {@link ContentSection#ContentSection(UUID, String)}
   */
  @Deprecated
  public ContentSection() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ContentSection(UUID sectionId, String name) {
    this.sectionId = sectionId;
    this.name = name;
  }

  public ContentSection sectionId(UUID sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Unique identifier for the content section.
   * @return sectionId
  */
  @NotNull @Valid 
  @Schema(name = "sectionId", description = "Unique identifier for the content section.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sectionId")
  public UUID getSectionId() {
    return sectionId;
  }

  public void setSectionId(UUID sectionId) {
    this.sectionId = sectionId;
  }

  public ContentSection name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the content section (e.g., 'Mathematics', 'Science').
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "Name of the content section (e.g., 'Mathematics', 'Science').", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ContentSection contentSection = (ContentSection) o;
    return Objects.equals(this.sectionId, contentSection.sectionId) &&
        Objects.equals(this.name, contentSection.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentSection {\n");
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

