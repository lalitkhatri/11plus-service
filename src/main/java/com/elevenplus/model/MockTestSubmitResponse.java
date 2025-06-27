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
 * MockTestSubmitResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class MockTestSubmitResponse {

  private UUID testId;

  private Integer score;

  private Integer totalQuestions;

  private Float percentage;

  @Valid
  private List<@Valid MockTestSubmitResponseResultsInner> results = new ArrayList<>();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submittedAt;

  /**
   * Default constructor
   * @deprecated Use {@link MockTestSubmitResponse#MockTestSubmitResponse(UUID, Integer, Integer, Float, List<@Valid MockTestSubmitResponseResultsInner >, OffsetDateTime)}
   */
  @Deprecated
  public MockTestSubmitResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MockTestSubmitResponse(UUID testId, Integer score, Integer totalQuestions, Float percentage, List<@Valid MockTestSubmitResponseResultsInner> results, OffsetDateTime submittedAt) {
    this.testId = testId;
    this.score = score;
    this.totalQuestions = totalQuestions;
    this.percentage = percentage;
    this.results = results;
    this.submittedAt = submittedAt;
  }

  public MockTestSubmitResponse testId(UUID testId) {
    this.testId = testId;
    return this;
  }

  /**
   * ID of the submitted mock test.
   * @return testId
  */
  @NotNull @Valid 
  @Schema(name = "testId", description = "ID of the submitted mock test.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("testId")
  public UUID getTestId() {
    return testId;
  }

  public void setTestId(UUID testId) {
    this.testId = testId;
  }

  public MockTestSubmitResponse score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Number of questions answered correctly.
   * @return score
  */
  @NotNull 
  @Schema(name = "score", description = "Number of questions answered correctly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MockTestSubmitResponse totalQuestions(Integer totalQuestions) {
    this.totalQuestions = totalQuestions;
    return this;
  }

  /**
   * Total number of questions in the test.
   * @return totalQuestions
  */
  @NotNull 
  @Schema(name = "totalQuestions", description = "Total number of questions in the test.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalQuestions")
  public Integer getTotalQuestions() {
    return totalQuestions;
  }

  public void setTotalQuestions(Integer totalQuestions) {
    this.totalQuestions = totalQuestions;
  }

  public MockTestSubmitResponse percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

  /**
   * Percentage of correct answers (0-100).
   * @return percentage
  */
  @NotNull 
  @Schema(name = "percentage", description = "Percentage of correct answers (0-100).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percentage")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public MockTestSubmitResponse results(List<@Valid MockTestSubmitResponseResultsInner> results) {
    this.results = results;
    return this;
  }

  public MockTestSubmitResponse addResultsItem(MockTestSubmitResponseResultsInner resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Detailed results for each question in the test.
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "results", description = "Detailed results for each question in the test.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid MockTestSubmitResponseResultsInner> getResults() {
    return results;
  }

  public void setResults(List<@Valid MockTestSubmitResponseResultsInner> results) {
    this.results = results;
  }

  public MockTestSubmitResponse submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  /**
   * Timestamp when the mock test was submitted.
   * @return submittedAt
  */
  @NotNull @Valid 
  @Schema(name = "submittedAt", description = "Timestamp when the mock test was submitted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("submittedAt")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockTestSubmitResponse mockTestSubmitResponse = (MockTestSubmitResponse) o;
    return Objects.equals(this.testId, mockTestSubmitResponse.testId) &&
        Objects.equals(this.score, mockTestSubmitResponse.score) &&
        Objects.equals(this.totalQuestions, mockTestSubmitResponse.totalQuestions) &&
        Objects.equals(this.percentage, mockTestSubmitResponse.percentage) &&
        Objects.equals(this.results, mockTestSubmitResponse.results) &&
        Objects.equals(this.submittedAt, mockTestSubmitResponse.submittedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, score, totalQuestions, percentage, results, submittedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockTestSubmitResponse {\n");
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    totalQuestions: ").append(toIndentedString(totalQuestions)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
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

