package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * MockTestQuestion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class MockTestQuestion {

  private UUID questionId;

  private String questionText;

  @Valid
  private List<@Valid QuestionOption> options = new ArrayList<>();

  private QuestionTags tags;

  /**
   * Default constructor
   * @deprecated Use {@link MockTestQuestion#MockTestQuestion(UUID, String, List<@Valid QuestionOption >, QuestionTags )}
   */
  @Deprecated
  public MockTestQuestion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MockTestQuestion(UUID questionId, String questionText, List<@Valid QuestionOption> options, QuestionTags tags) {
    this.questionId = questionId;
    this.questionText = questionText;
    this.options = options;
    this.tags = tags;
  }

  public MockTestQuestion questionId(UUID questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Unique identifier for the question.
   * @return questionId
  */
  @NotNull @Valid 
  @Schema(name = "questionId", description = "Unique identifier for the question.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questionId")
  public UUID getQuestionId() {
    return questionId;
  }

  public void setQuestionId(UUID questionId) {
    this.questionId = questionId;
  }

  public MockTestQuestion questionText(String questionText) {
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

  public MockTestQuestion options(List<@Valid QuestionOption> options) {
    this.options = options;
    return this;
  }

  public MockTestQuestion addOptionsItem(QuestionOption optionsItem) {
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
  public List<@Valid QuestionOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid QuestionOption> options) {
    this.options = options;
  }

  public MockTestQuestion tags(QuestionTags tags) {
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
    MockTestQuestion mockTestQuestion = (MockTestQuestion) o;
    return Objects.equals(this.questionId, mockTestQuestion.questionId) &&
        Objects.equals(this.questionText, mockTestQuestion.questionText) &&
        Objects.equals(this.options, mockTestQuestion.options) &&
        Objects.equals(this.tags, mockTestQuestion.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionId, questionText, options, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockTestQuestion {\n");
    sb.append("    questionId: ").append(toIndentedString(questionId)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

