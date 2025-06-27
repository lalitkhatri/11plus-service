package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * StudentAttempt
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentAttempt {

  private UUID attemptId;

  private UUID studentId;

  private UUID questionId;

  private String selectedAnswerId;

  private Boolean isCorrect;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime attemptedAt;

  private Integer timeTakenSeconds;

  /**
   * Default constructor
   * @deprecated Use {@link StudentAttempt#StudentAttempt(UUID, UUID, UUID, String, Boolean, OffsetDateTime)}
   */
  @Deprecated
  public StudentAttempt() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentAttempt(UUID attemptId, UUID studentId, UUID questionId, String selectedAnswerId, Boolean isCorrect, OffsetDateTime attemptedAt) {
    this.attemptId = attemptId;
    this.studentId = studentId;
    this.questionId = questionId;
    this.selectedAnswerId = selectedAnswerId;
    this.isCorrect = isCorrect;
    this.attemptedAt = attemptedAt;
  }

  public StudentAttempt attemptId(UUID attemptId) {
    this.attemptId = attemptId;
    return this;
  }

  /**
   * Unique identifier for the student attempt.
   * @return attemptId
  */
  @NotNull @Valid 
  @Schema(name = "attemptId", description = "Unique identifier for the student attempt.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attemptId")
  public UUID getAttemptId() {
    return attemptId;
  }

  public void setAttemptId(UUID attemptId) {
    this.attemptId = attemptId;
  }

  public StudentAttempt studentId(UUID studentId) {
    this.studentId = studentId;
    return this;
  }

  /**
   * ID of the student who made the attempt.
   * @return studentId
  */
  @NotNull @Valid 
  @Schema(name = "studentId", description = "ID of the student who made the attempt.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("studentId")
  public UUID getStudentId() {
    return studentId;
  }

  public void setStudentId(UUID studentId) {
    this.studentId = studentId;
  }

  public StudentAttempt questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * ID of the question attempted.
   * @return questionId
  */
  @NotNull @Valid 
  @Schema(name = "questionId", description = "ID of the question attempted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public StudentAttempt selectedAnswerId(String selectedAnswerId) {
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

  public StudentAttempt isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

  /**
   * True if the selected answer was correct, false otherwise.
   * @return isCorrect
  */
  @NotNull 
  @Schema(name = "isCorrect", description = "True if the selected answer was correct, false otherwise.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("isCorrect")
  public Boolean getIsCorrect() {
    return isCorrect;
  }

  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }

  public StudentAttempt attemptedAt(OffsetDateTime attemptedAt) {
    this.attemptedAt = attemptedAt;
    return this;
  }

  /**
   * Timestamp of when the attempt was made.
   * @return attemptedAt
  */
  @NotNull @Valid 
  @Schema(name = "attemptedAt", description = "Timestamp of when the attempt was made.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attemptedAt")
  public OffsetDateTime getAttemptedAt() {
    return attemptedAt;
  }

  public void setAttemptedAt(OffsetDateTime attemptedAt) {
    this.attemptedAt = attemptedAt;
  }

  public StudentAttempt timeTakenSeconds(Integer timeTakenSeconds) {
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
    StudentAttempt studentAttempt = (StudentAttempt) o;
    return Objects.equals(this.attemptId, studentAttempt.attemptId) &&
        Objects.equals(this.studentId, studentAttempt.studentId) &&
        Objects.equals(this.questionId, studentAttempt.questionId) &&
        Objects.equals(this.selectedAnswerId, studentAttempt.selectedAnswerId) &&
        Objects.equals(this.isCorrect, studentAttempt.isCorrect) &&
        Objects.equals(this.attemptedAt, studentAttempt.attemptedAt) &&
        Objects.equals(this.timeTakenSeconds, studentAttempt.timeTakenSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attemptId, studentId, questionId, selectedAnswerId, isCorrect, attemptedAt, timeTakenSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentAttempt {\n");
    sb.append("    attemptId: ").append(toIndentedString(attemptId)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    selectedAnswerId: ").append(toIndentedString(selectedAnswerId)).append("\n");
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
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

