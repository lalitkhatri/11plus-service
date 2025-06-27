package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * QuestionTags
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class QuestionTags {

  private String section;

  private String category;

  /**
   * Difficulty level of the question.
   */
  public enum DifficultyEnum {
    EASY("Easy"),
    
    MEDIUM("Medium"),
    
    HARD("Hard");

    private String value;

    DifficultyEnum(String value) {
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
    public static DifficultyEnum fromValue(String value) {
      for (DifficultyEnum b : DifficultyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DifficultyEnum difficulty;

  /**
   * Default constructor
   * @deprecated Use {@link QuestionTags#QuestionTags(String, String, DifficultyEnum)}
   */
  @Deprecated
  public QuestionTags() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuestionTags(String section, String category, DifficultyEnum difficulty) {
    this.section = section;
    this.category = category;
    this.difficulty = difficulty;
  }

  public QuestionTags section(String section) {
    this.section = section;
    return this;
  }

  /**
   * The name of the section the question belongs to.
   * @return section
  */
  @NotNull 
  @Schema(name = "section", description = "The name of the section the question belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("section")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public QuestionTags category(String category) {
    this.category = category;
    return this;
  }

  /**
   * The name of the category the question belongs to.
   * @return category
  */
  @NotNull 
  @Schema(name = "category", description = "The name of the category the question belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public QuestionTags difficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Difficulty level of the question.
   * @return difficulty
  */
  @NotNull 
  @Schema(name = "difficulty", description = "Difficulty level of the question.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("difficulty")
  public DifficultyEnum getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionTags questionTags = (QuestionTags) o;
    return Objects.equals(this.section, questionTags.section) &&
        Objects.equals(this.category, questionTags.category) &&
        Objects.equals(this.difficulty, questionTags.difficulty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(section, category, difficulty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionTags {\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
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

