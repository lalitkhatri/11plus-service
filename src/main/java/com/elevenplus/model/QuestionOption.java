package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * QuestionOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class QuestionOption {

  private String id;

  private String text;

  /**
   * Default constructor
   * @deprecated Use {@link QuestionOption#QuestionOption(String, String)}
   */
  @Deprecated
  public QuestionOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuestionOption(String id, String text) {
    this.id = id;
    this.text = text;
  }

  public QuestionOption id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the option.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the option.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuestionOption text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The text of the option.
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "The text of the option.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionOption questionOption = (QuestionOption) o;
    return Objects.equals(this.id, questionOption.id) &&
        Objects.equals(this.text, questionOption.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

