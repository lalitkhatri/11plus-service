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
 * StudentMocktestsStartPostRequest
 */

@JsonTypeName("_student_mocktests_start_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentMocktestsStartPostRequest {

  private Integer numQuestions = 20;

  private String sectionId;

  private String categoryId;

  /**
   * Optional difficulty level for questions.
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

  public StudentMocktestsStartPostRequest numQuestions(Integer numQuestions) {
    this.numQuestions = numQuestions;
    return this;
  }

  /**
   * Number of questions for the test.
   * minimum: 1
   * @return numQuestions
  */
  @Min(1) 
  @Schema(name = "numQuestions", description = "Number of questions for the test.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numQuestions")
  public Integer getNumQuestions() {
    return numQuestions;
  }

  public void setNumQuestions(Integer numQuestions) {
    this.numQuestions = numQuestions;
  }

  public StudentMocktestsStartPostRequest sectionId(String sectionId) {
    this.sectionId = sectionId;
    return this;
  }

  /**
   * Optional ID to filter questions by section.
   * @return sectionId
  */
  
  @Schema(name = "sectionId", description = "Optional ID to filter questions by section.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sectionId")
  public String getSectionId() {
    return sectionId;
  }

  public void setSectionId(String sectionId) {
    this.sectionId = sectionId;
  }

  public StudentMocktestsStartPostRequest categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Optional ID to filter questions by category.
   * @return categoryId
  */
  
  @Schema(name = "categoryId", description = "Optional ID to filter questions by category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryId")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public StudentMocktestsStartPostRequest difficulty(DifficultyEnum difficulty) {
    this.difficulty = difficulty;
    return this;
  }

  /**
   * Optional difficulty level for questions.
   * @return difficulty
  */
  
  @Schema(name = "difficulty", description = "Optional difficulty level for questions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    StudentMocktestsStartPostRequest studentMocktestsStartPostRequest = (StudentMocktestsStartPostRequest) o;
    return Objects.equals(this.numQuestions, studentMocktestsStartPostRequest.numQuestions) &&
        Objects.equals(this.sectionId, studentMocktestsStartPostRequest.sectionId) &&
        Objects.equals(this.categoryId, studentMocktestsStartPostRequest.categoryId) &&
        Objects.equals(this.difficulty, studentMocktestsStartPostRequest.difficulty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numQuestions, sectionId, categoryId, difficulty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMocktestsStartPostRequest {\n");
    sb.append("    numQuestions: ").append(toIndentedString(numQuestions)).append("\n");
    sb.append("    sectionId: ").append(toIndentedString(sectionId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

