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
 * NewQuestion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class NewQuestion {

  private String questionText;

  @Valid
  private List<@Valid NewQuestionOptionsInner> options = new ArrayList<>();

  private String correctAnswerId;

  private String explanation;

  private QuestionTags tags;

  /**
   * Default constructor
   * @deprecated Use {@link NewQuestion#NewQuestion(String, List<@Valid NewQuestionOptionsInner >, String, String, QuestionTags )}
   */
  @Deprecated
  public NewQuestion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewQuestion(String questionText, List<@Valid NewQuestionOptionsInner> options, String correctAnswerId, String explanation, QuestionTags tags) {
    this.questionText = questionText;
    this.options = options;
    this.correctAnswerId = correctAnswerId;
    this.explanation = explanation;
    this.tags = tags;
  }

  public NewQuestion questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }

  /**
   * The main text of the multiple-choice question.
   * @return questionText
  */
  @NotNull 
  @Schema(name = "questionText", description = "The main text of the multiple-choice question.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionText")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public NewQuestion options(List<@Valid NewQuestionOptionsInner> options) {
    this.options = options;
    return this;
  }

  public NewQuestion addOptionsItem(NewQuestionOptionsInner optionsItem) {
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
  @NotNull @Valid 
  @Schema(name = "options", description = "Array of possible answer options.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("options")
  public List<@Valid NewQuestionOptionsInner> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid NewQuestionOptionsInner> options) {
    this.options = options;
  }

  public NewQuestion correctAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
    return this;
  }

  /**
   * The ID of the correct answer option.
   * @return correctAnswerId
  */
  @NotNull 
  @Schema(name = "correctAnswerId", description = "The ID of the correct answer option.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("correctAnswerId")
  public String getCorrectAnswerId() {
    return correctAnswerId;
  }

  public void setCorrectAnswerId(String correctAnswerId) {
    this.correctAnswerId = correctAnswerId;
  }

  public NewQuestion explanation(String explanation) {
    this.explanation = explanation;
    return this;
  }

  /**
   * Detailed explanation for the question and its answer.
   * @return explanation
  */
  @NotNull 
  @Schema(name = "explanation", description = "Detailed explanation for the question and its answer.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("explanation")
  public String getExplanation() {
    return explanation;
  }

  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }

  public NewQuestion tags(QuestionTags tags) {
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
    NewQuestion newQuestion = (NewQuestion) o;
    return Objects.equals(this.questionText, newQuestion.questionText) &&
        Objects.equals(this.options, newQuestion.options) &&
        Objects.equals(this.correctAnswerId, newQuestion.correctAnswerId) &&
        Objects.equals(this.explanation, newQuestion.explanation) &&
        Objects.equals(this.tags, newQuestion.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionText, options, correctAnswerId, explanation, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewQuestion {\n");
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

