package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * MockTestStartResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class MockTestStartResponse {

  private UUID testId;

  @Valid
  private List<@Valid MockTestQuestion> questions = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  private Integer durationSeconds;

  /**
   * Default constructor
   * @deprecated Use {@link MockTestStartResponse#MockTestStartResponse(UUID, List<@Valid MockTestQuestion >, OffsetDateTime, Integer)}
   */
  @Deprecated
  public MockTestStartResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MockTestStartResponse(UUID testId, List<@Valid MockTestQuestion> questions, OffsetDateTime startTime, Integer durationSeconds) {
    this.testId = testId;
    this.questions = questions;
    this.startTime = startTime;
    this.durationSeconds = durationSeconds;
  }

  public MockTestStartResponse testId(UUID testId) {
    this.testId = testId;
    return this;
  }

  /**
   * Unique identifier for the started mock test session.
   * @return testId
  */
  @NotNull @Valid 
  @Schema(name = "testId", description = "Unique identifier for the started mock test session.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("testId")
  public UUID getTestId() {
    return testId;
  }

  public void setTestId(UUID testId) {
    this.testId = testId;
  }

  public MockTestStartResponse questions(List<@Valid MockTestQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public MockTestStartResponse addQuestionsItem(MockTestQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * List of questions for the mock test (without correct answers).
   * @return questions
  */
  @NotNull @Valid 
  @Schema(name = "questions", description = "List of questions for the mock test (without correct answers).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questions")
  public List<@Valid MockTestQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid MockTestQuestion> questions) {
    this.questions = questions;
  }

  public MockTestStartResponse startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Timestamp when the mock test started.
   * @return startTime
  */
  @NotNull @Valid 
  @Schema(name = "startTime", description = "Timestamp when the mock test started.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public MockTestStartResponse durationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
    return this;
  }

  /**
   * Total allowed duration for the test in seconds.
   * @return durationSeconds
  */
  @NotNull 
  @Schema(name = "durationSeconds", description = "Total allowed duration for the test in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("durationSeconds")
  public Integer getDurationSeconds() {
    return durationSeconds;
  }

  public void setDurationSeconds(Integer durationSeconds) {
    this.durationSeconds = durationSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockTestStartResponse mockTestStartResponse = (MockTestStartResponse) o;
    return Objects.equals(this.testId, mockTestStartResponse.testId) &&
        Objects.equals(this.questions, mockTestStartResponse.questions) &&
        Objects.equals(this.startTime, mockTestStartResponse.startTime) &&
        Objects.equals(this.durationSeconds, mockTestStartResponse.durationSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, questions, startTime, durationSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockTestStartResponse {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    durationSeconds: ").append(toIndentedString(durationSeconds)).append("\n");
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

