package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * StudentMocktestsTestIdSubmitPostRequestAnswersInner
 */

@JsonTypeName("_student_mocktests__testId__submit_post_request_answers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentMocktestsTestIdSubmitPostRequestAnswersInner {

  private String questionId;

  private String selectedAnswerId;

  /**
   * Default constructor
   * @deprecated Use {@link StudentMocktestsTestIdSubmitPostRequestAnswersInner#StudentMocktestsTestIdSubmitPostRequestAnswersInner(String, String)}
   */
  @Deprecated
  public StudentMocktestsTestIdSubmitPostRequestAnswersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentMocktestsTestIdSubmitPostRequestAnswersInner(String questionId, String selectedAnswerId) {
    this.questionId = questionId;
    this.selectedAnswerId = selectedAnswerId;
  }

  public StudentMocktestsTestIdSubmitPostRequestAnswersInner questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Get questionId
   * @return questionId
  */
  @NotNull 
  @Schema(name = "questionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public StudentMocktestsTestIdSubmitPostRequestAnswersInner selectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
    return this;
  }

  /**
   * Get selectedAnswerId
   * @return selectedAnswerId
  */
  @NotNull 
  @Schema(name = "selectedAnswerId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selectedAnswerId")
  public String getSelectedAnswerId() {
    return selectedAnswerId;
  }

  public void setSelectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentMocktestsTestIdSubmitPostRequestAnswersInner studentMocktestsTestIdSubmitPostRequestAnswersInner = (StudentMocktestsTestIdSubmitPostRequestAnswersInner) o;
    return Objects.equals(this.questionId, studentMocktestsTestIdSubmitPostRequestAnswersInner.questionId) &&
        Objects.equals(this.selectedAnswerId, studentMocktestsTestIdSubmitPostRequestAnswersInner.selectedAnswerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, selectedAnswerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMocktestsTestIdSubmitPostRequestAnswersInner {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    selectedAnswerId: ").append(toIndentedString(selectedAnswerId)).append("\n");
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

