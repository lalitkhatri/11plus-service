package com.elevenplus.model;

import java.util.List;

public class VerbalReasoningQuestion extends Question {
    public VerbalReasoningQuestion(String questionText, List<String> tags) {
        this.setQuestionText(questionText);
        this.setTags(tags);
    }
    public VerbalReasoningQuestion() {}
}
