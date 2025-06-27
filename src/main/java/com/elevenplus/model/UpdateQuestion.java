package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UpdateQuestion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class UpdateQuestion {

  private String questionText;

  @Valid
  private List<@Valid QuestionOption> options;

  private String correctAnswerId;

  private String explanation;

  private QuestionTags tags;

  public UpdateQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * The main text of the multiple-choice question.
   * @return questionText
  */
  
  @Schema(name = "questionText", description = "The main text of the multiple-choice question.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questionText")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public UpdateQuestion options(List<@Valid QuestionOption> options) {
    this.options = options;
    return this;
  }

  public UpdateQuestion addOptionsItem(QuestionOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Array of possible answer options.
   * @return options
  */
  @Valid 
  @Schema(name = "options", description = "Array of possible answer options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid QuestionOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid QuestionOption> options) {
    this.options = options;
  }

  public UpdateQuestion correctAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
    return this;
  }

  /**
   * The ID of the correct answer option.
   * @return correctAnswerId
  */
  
  @Schema(name = "correctAnswerId", description = "The ID of the correct answer option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("correctAnswerId")
  public String getCorrectAnswerId() {
    return correctAnswerId;
  }

  public void setCorrectAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
  }

  public UpdateQuestion explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Detailed explanation for the question and its answer.
   * @return explanation
  */
  
  @Schema(name = "explanation", description = "Detailed explanation for the question and its answer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public UpdateQuestion tags(QuestionTags tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UpdateQuestion updateQuestion = (UpdateQuestion) o;
    return Objects.equals(this.questionText, updateQuestion.questionText) &&
        Objects.equals(this.options, updateQuestion.options) &&
        Objects.equals(this.correctAnswerId, updateQuestion.correctAnswerId) &&
        Objects.equals(this.explanation, updateQuestion.explanation) &&
        Objects.equals(this.tags, updateQuestion.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionText, options, correctAnswerId, explanation, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateQuestion {\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    correctAnswerId: ").append(toIndentedString(correctAnswerId)).append("\n");
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

