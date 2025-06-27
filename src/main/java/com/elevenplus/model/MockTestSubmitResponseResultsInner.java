package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * MockTestSubmitResponseResultsInner
 */

@JsonTypeName("MockTestSubmitResponse_results_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class MockTestSubmitResponseResultsInner {

  private String questionId;

  private Boolean isCorrect;

  private String correctAnswerId;

  private String explanation;

  /**
   * Default constructor
   * @deprecated Use {@link MockTestSubmitResponseResultsInner#MockTestSubmitResponseResultsInner(String, Boolean, String, String)}
   */
  @Deprecated
  public MockTestSubmitResponseResultsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MockTestSubmitResponseResultsInner(String questionId, Boolean isCorrect, String correctAnswerId, String explanation) {
    this.questionId = questionId;
    this.isCorrect = isCorrect;
    this.correctAnswerId = correctAnswerId;
    this.explanation = explanation;
  }

  public MockTestSubmitResponseResultsInner questionId(String questionId) {
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

  public MockTestSubmitResponseResultsInner isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

  /**
   * Get isCorrect
   * @return isCorrect
  */
  @NotNull 
  @Schema(name = "isCorrect", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isCorrect")
  public Boolean getIsCorrect() {
    return isCorrect;
  }

  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }

  public MockTestSubmitResponseResultsInner correctAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
    return this;
  }

  /**
   * Get correctAnswerId
   * @return correctAnswerId
  */
  @NotNull 
  @Schema(name = "correctAnswerId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correctAnswerId")
  public String getCorrectAnswerId() {
    return correctAnswerId;
  }

  public void setCorrectAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
  }

  public MockTestSubmitResponseResultsInner explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Get explanation
   * @return explanation
  */
  @NotNull 
  @Schema(name = "explanation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockTestSubmitResponseResultsInner mockTestSubmitResponseResultsInner = (MockTestSubmitResponseResultsInner) o;
    return Objects.equals(this.questionId, mockTestSubmitResponseResultsInner.questionId) &&
        Objects.equals(this.isCorrect, mockTestSubmitResponseResultsInner.isCorrect) &&
        Objects.equals(this.correctAnswerId, mockTestSubmitResponseResultsInner.correctAnswerId) &&
        Objects.equals(this.explanation, mockTestSubmitResponseResultsInner.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, isCorrect, correctAnswerId, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockTestSubmitResponseResultsInner {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
    sb.append("    correctAnswerId: ").append(toIndentedString(correctAnswerId)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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

