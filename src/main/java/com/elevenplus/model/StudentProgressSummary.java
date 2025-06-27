package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * StudentProgressSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentProgressSummary {

  private Integer totalQuestionsAttempted;

  private Integer correctAnswers;

  private Integer incorrectAnswers;

  private Float accuracyPercentage;

  private Integer sectionsCompleted;

  private Float averageTimePerQuestion;

  /**
   * Default constructor
   * @deprecated Use {@link StudentProgressSummary#StudentProgressSummary(Integer, Integer, Integer, Float, Integer, Float)}
   */
  @Deprecated
  public StudentProgressSummary() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentProgressSummary(Integer totalQuestionsAttempted, Integer correctAnswers, Integer incorrectAnswers, Float accuracyPercentage, Integer sectionsCompleted, Float averageTimePerQuestion) {
    this.totalQuestionsAttempted = totalQuestionsAttempted;
    this.correctAnswers = correctAnswers;
    this.incorrectAnswers = incorrectAnswers;
    this.accuracyPercentage = accuracyPercentage;
    this.sectionsCompleted = sectionsCompleted;
    this.averageTimePerQuestion = averageTimePerQuestion;
  }

  public StudentProgressSummary totalQuestionsAttempted(Integer totalQuestionsAttempted) {
    this.totalQuestionsAttempted = totalQuestionsAttempted;
    return this;
  }

  /**
   * Total number of unique questions the student has attempted.
   * @return totalQuestionsAttempted
  */
  @NotNull 
  @Schema(name = "totalQuestionsAttempted", description = "Total number of unique questions the student has attempted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalQuestionsAttempted")
  public Integer getTotalQuestionsAttempted() {
    return totalQuestionsAttempted;
  }

  public void setTotalQuestionsAttempted(Integer totalQuestionsAttempted) {
    this.totalQuestionsAttempted = totalQuestionsAttempted;
  }

  public StudentProgressSummary correctAnswers(Integer correctAnswers) {
    this.correctAnswers = correctAnswers;
    return this;
  }

  /**
   * Number of questions answered correctly.
   * @return correctAnswers
  */
  @NotNull 
  @Schema(name = "correctAnswers", description = "Number of questions answered correctly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correctAnswers")
  public Integer getCorrectAnswers() {
    return correctAnswers;
  }

  public void setCorrectAnswers(Integer correctAnswers) {
    this.correctAnswers = correctAnswers;
  }

  public StudentProgressSummary incorrectAnswers(Integer incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
    return this;
  }

  /**
   * Number of questions answered incorrectly.
   * @return incorrectAnswers
  */
  @NotNull 
  @Schema(name = "incorrectAnswers", description = "Number of questions answered incorrectly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incorrectAnswers")
  public Integer getIncorrectAnswers() {
    return incorrectAnswers;
  }

  public void setIncorrectAnswers(Integer incorrectAnswers) {
    this.incorrectAnswers = incorrectAnswers;
  }

  public StudentProgressSummary accuracyPercentage(Float accuracyPercentage) {
    this.accuracyPercentage = accuracyPercentage;
    return this;
  }

  /**
   * Percentage of correct answers (0-100).
   * @return accuracyPercentage
  */
  @NotNull 
  @Schema(name = "accuracyPercentage", description = "Percentage of correct answers (0-100).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accuracyPercentage")
  public Float getAccuracyPercentage() {
    return accuracyPercentage;
  }

  public void setAccuracyPercentage(Float accuracyPercentage) {
    this.accuracyPercentage = accuracyPercentage;
  }

  public StudentProgressSummary sectionsCompleted(Integer sectionsCompleted) {
    this.sectionsCompleted = sectionsCompleted;
    return this;
  }

  /**
   * Number of sections where student has attempted all questions.
   * @return sectionsCompleted
  */
  @NotNull 
  @Schema(name = "sectionsCompleted", description = "Number of sections where student has attempted all questions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sectionsCompleted")
  public Integer getSectionsCompleted() {
    return sectionsCompleted;
  }

  public void setSectionsCompleted(Integer sectionsCompleted) {
    this.sectionsCompleted = sectionsCompleted;
  }

  public StudentProgressSummary averageTimePerQuestion(Float averageTimePerQuestion) {
    this.averageTimePerQuestion = averageTimePerQuestion;
    return this;
  }

  /**
   * Average time taken per question in seconds.
   * @return averageTimePerQuestion
  */
  @NotNull 
  @Schema(name = "averageTimePerQuestion", description = "Average time taken per question in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("averageTimePerQuestion")
  public Float getAverageTimePerQuestion() {
    return averageTimePerQuestion;
  }

  public void setAverageTimePerQuestion(Float averageTimePerQuestion) {
    this.averageTimePerQuestion = averageTimePerQuestion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentProgressSummary studentProgressSummary = (StudentProgressSummary) o;
    return Objects.equals(this.totalQuestionsAttempted, studentProgressSummary.totalQuestionsAttempted) &&
        Objects.equals(this.correctAnswers, studentProgressSummary.correctAnswers) &&
        Objects.equals(this.incorrectAnswers, studentProgressSummary.incorrectAnswers) &&
        Objects.equals(this.accuracyPercentage, studentProgressSummary.accuracyPercentage) &&
        Objects.equals(this.sectionsCompleted, studentProgressSummary.sectionsCompleted) &&
        Objects.equals(this.averageTimePerQuestion, studentProgressSummary.averageTimePerQuestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalQuestionsAttempted, correctAnswers, incorrectAnswers, accuracyPercentage, sectionsCompleted, averageTimePerQuestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentProgressSummary {\n");
    sb.append("    totalQuestionsAttempted: ").append(toIndentedString(totalQuestionsAttempted)).append("\n");
    sb.append("    correctAnswers: ").append(toIndentedString(correctAnswers)).append("\n");
    sb.append("    incorrectAnswers: ").append(toIndentedString(incorrectAnswers)).append("\n");
    sb.append("    accuracyPercentage: ").append(toIndentedString(accuracyPercentage)).append("\n");
    sb.append("    sectionsCompleted: ").append(toIndentedString(sectionsCompleted)).append("\n");
    sb.append("    averageTimePerQuestion: ").append(toIndentedString(averageTimePerQuestion)).append("\n");
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

