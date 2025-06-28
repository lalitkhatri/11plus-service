package com.elevenplus.model;

import java.util.List;

public class Question {
    private String id; // Assuming id can be of any type, adjust as necessary
    private String questionText;
    private List<String> options;
    private String correctAnswer;
    private String explanation;
    private List<String> tags;
    private int difficultyLevel; 

    // Getters and setters
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        // Optionally add validation to ensure the level is within 1-10
        if(difficultyLevel < 1 || difficultyLevel > 10) {
            throw new IllegalArgumentException("Difficulty level must be between 1 and 10.");
        }
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "VerbalReasoningQuestion{" +
                "questionText='" + questionText + '\'' +
                ", options=" + options +
                ", correctAnswer='" + correctAnswer + '\'' +
                ", explanation='" + explanation + '\'' +
                ", tags=" + tags +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
