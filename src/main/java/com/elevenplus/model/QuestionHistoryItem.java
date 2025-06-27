package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * QuestionHistoryItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class QuestionHistoryItem {

  private UUID questionId;

  private String questionText;

  /**
   * Status of the question for the student.
   */
  public enum StatusEnum {
    WRONG("Wrong"),
    
    RIGHT("Right"),
    
    NOTATTEMPTED("NotAttempted");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime attemptedAt;

  private String selectedAnswerId;

  private Boolean isCorrect;

  private String explanation;

  private QuestionTags tags;

  /**
   * Default constructor
   * @deprecated Use {@link QuestionHistoryItem#QuestionHistoryItem(UUID, String, StatusEnum, QuestionTags)}
   */
  @Deprecated
  public QuestionHistoryItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QuestionHistoryItem(UUID questionId, String questionText, StatusEnum status, QuestionTags tags) {
    this.questionId = questionId;
    this.questionText = questionText;
    this.status = status;
    this.tags = tags;
  }

  public QuestionHistoryItem questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * ID of the question.
   * @return questionId
  */
  @NotNull @Valid 
  @Schema(name = "questionId", description = "ID of the question.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public QuestionHistoryItem questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * The text of the question.
   * @return questionText
  */
  @NotNull 
  @Schema(name = "questionText", description = "The text of the question.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionText")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public QuestionHistoryItem status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the question for the student.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", description = "Status of the question for the student.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public QuestionHistoryItem attemptedAt(OffsetDateTime attemptedAt) {
    this.attemptedAt = attemptedAt;
    return this;
  }

  /**
   * Timestamp of the last attempt (if any).
   * @return attemptedAt
  */
  @Valid 
  @Schema(name = "attemptedAt", description = "Timestamp of the last attempt (if any).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attemptedAt")
  public OffsetDateTime getAttemptedAt() {
    return attemptedAt;
  }

  public void setAttemptedAt(OffsetDateTime attemptedAt) {
    this.attemptedAt = attemptedAt;
  }

  public QuestionHistoryItem selectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
    return this;
  }

  /**
   * The option selected by the student (if attempted).
   * @return selectedAnswerId
  */
  
  @Schema(name = "selectedAnswerId", description = "The option selected by the student (if attempted).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedAnswerId")
  public String getSelectedAnswerId() {
    return selectedAnswerId;
  }

  public void setSelectedAnswerId(String selectedAnswerId) {
    this.selectedAnswerId = selectedAnswerId;
  }

  public QuestionHistoryItem isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

  /**
   * Whether the last attempt was correct (if attempted).
   * @return isCorrect
  */
  
  @Schema(name = "isCorrect", description = "Whether the last attempt was correct (if attempted).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isCorrect")
  public Boolean getIsCorrect() {
    return isCorrect;
  }

  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }

  public QuestionHistoryItem explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Explanation for the question (included for wrong/right attempts).
   * @return explanation
  */
  
  @Schema(name = "explanation", description = "Explanation for the question (included for wrong/right attempts).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public QuestionHistoryItem tags(QuestionTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tags")
  public QuestionTags getTags() {
    return tags;
  }

  public void setTags(QuestionTags tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionHistoryItem questionHistoryItem = (QuestionHistoryItem) o;
    return Objects.equals(this.questionId, questionHistoryItem.questionId) &&
        Objects.equals(this.questionText, questionHistoryItem.questionText) &&
        Objects.equals(this.status, questionHistoryItem.status) &&
        Objects.equals(this.attemptedAt, questionHistoryItem.attemptedAt) &&
        Objects.equals(this.selectedAnswerId, questionHistoryItem.selectedAnswerId) &&
        Objects.equals(this.isCorrect, questionHistoryItem.isCorrect) &&
        Objects.equals(this.explanation, questionHistoryItem.explanation) &&
        Objects.equals(this.tags, questionHistoryItem.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, questionText, status, attemptedAt, selectedAnswerId, isCorrect, explanation, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionHistoryItem {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attemptedAt: ").append(toIndentedString(attemptedAt)).append("\n");
    sb.append("    selectedAnswerId: ").append(toIndentedString(selectedAnswerId)).append("\n");
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

