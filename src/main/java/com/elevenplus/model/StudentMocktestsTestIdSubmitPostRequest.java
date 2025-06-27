package com.elevenplus.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StudentMocktestsTestIdSubmitPostRequest
 */

@JsonTypeName("_student_mocktests__testId__submit_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-06-27T14:08:22.962266600+01:00[Europe/London]")
public class StudentMocktestsTestIdSubmitPostRequest {

  @Valid
  private List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner> answers = new ArrayList<>();

  /**
   * Default constructor
   * @deprecated Use {@link StudentMocktestsTestIdSubmitPostRequest#StudentMocktestsTestIdSubmitPostRequest(List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner >)}
   */
  @Deprecated
  public StudentMocktestsTestIdSubmitPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StudentMocktestsTestIdSubmitPostRequest(List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner> answers) {
    this.answers = answers;
  }

  public StudentMocktestsTestIdSubmitPostRequest answers(List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner> answers) {
    this.answers = answers;
    return this;
  }

  public StudentMocktestsTestIdSubmitPostRequest addAnswersItem(StudentMocktestsTestIdSubmitPostRequestAnswersInner answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
  */
  @NotNull @Valid 
  @Schema(name = "answers", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("answers")
  public List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner> getAnswers() {
    return answers;
  }

  public void setAnswers(List<@Valid StudentMocktestsTestIdSubmitPostRequestAnswersInner> answers) {
    this.answers = answers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentMocktestsTestIdSubmitPostRequest studentMocktestsTestIdSubmitPostRequest = (StudentMocktestsTestIdSubmitPostRequest) o;
    return Objects.equals(this.answers, studentMocktestsTestIdSubmitPostRequest.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentMocktestsTestIdSubmitPostRequest {\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

