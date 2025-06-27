package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * StudentAttemptRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentAttemptRequest {

  private String questionId;

  private String selectedAnswerId;

  private Integer timeTakenSeconds;

  /**
   * Default constructor
   * @deprecated Use {@link StudentAttemptRequest#StudentAttemptRequest(String, String)}
   */
  @Deprecated
  public StudentAttemptRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentAttemptRequest(String questionId, String selectedAnswerId) {
    this.questionId = questionId;
    this.selectedAnswerId = selectedAnswerId;
  }

  public StudentAttemptRequest questionId(String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * ID of the question being attempted.
   * @return questionId
  */
  @NotNull 
  @Schema(name = "questionId", description = "ID of the question being attempted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }

  public StudentAttemptRequest selectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
    return this;
  }

  /**
   * ID of the option selected by the student.
   * @return selectedAnswerId
  */
  @NotNull 
  @Schema(name = "selectedAnswerId", description = "ID of the option selected by the student.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("selectedAnswerId")
  public String getSelectedAnswerId() {
    return selectedAnswerId;
  }

  public void setSelectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
  }

  public StudentAttemptRequest timeTakenSeconds(Integer timeTakenSeconds) {
    this.timeTakenSeconds = timeTakenSeconds;
    return this;
  }

  /**
   * Time taken to answer the question in seconds (optional).
   * @return timeTakenSeconds
  */
  
  @Schema(name = "timeTakenSeconds", description = "Time taken to answer the question in seconds (optional).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeTakenSeconds")
  public Integer getTimeTakenSeconds() {
    return timeTakenSeconds;
  }

  public void setTimeTakenSeconds(Integer timeTakenSeconds) {
    this.timeTakenSeconds = timeTakenSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentAttemptRequest studentAttemptRequest = (StudentAttemptRequest) o;
    return Objects.equals(this.questionId, studentAttemptRequest.questionId) &&
        Objects.equals(this.selectedAnswerId, studentAttemptRequest.selectedAnswerId) &&
        Objects.equals(this.timeTakenSeconds, studentAttemptRequest.timeTakenSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, selectedAnswerId, timeTakenSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentAttemptRequest {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    selectedAnswerId: ").append(toIndentedString(selectedAnswerId)).append("\n");
    sb.append("    timeTakenSeconds: ").append(toIndentedString(timeTakenSeconds)).append("\n");
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

