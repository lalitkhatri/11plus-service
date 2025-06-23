package com.elevenplus.controller;

import com.elevenplus.model.VerbalReasoningQuestion;
import com.elevenplus.repository.QuestionRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "http://localhost:5173")
@Tag(name = "Questions", description = "API for managing questions")
public class QuestionController {

    private QuestionRepository questionRepository;
    @Value("${question.file.path}")
    private Resource questionFile;

    // Load questions from JSON file at startup and build the repository
    @PostConstruct
    public void init() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            VerbalReasoningQuestion[] questionsArray = mapper.readValue(questionFile.getInputStream(), VerbalReasoningQuestion[].class);
            List<VerbalReasoningQuestion> questions = Arrays.asList(questionsArray);
            questionRepository = new QuestionRepository(questions);
        } catch(Exception e) {
            throw new RuntimeException("Failed to load questions", e);
        }
    }

    // GET endpoint to retrieve all questions
    @Operation(summary = "Get all questions", description = "Retrieve all questions from the repository")
    @GetMapping("/all")
    public ResponseEntity<List<VerbalReasoningQuestion>> getAllQuestions() {
        List<VerbalReasoningQuestion> allQuestions = questionRepository.getAllQuestions();
        return ResponseEntity.ok(allQuestions);
    }

    // GET endpoint to retrieve questions by a specific tag
    @GetMapping("/byTag")
    public ResponseEntity<List<VerbalReasoningQuestion>> getQuestionsByTag(@RequestParam("tag") String tag) {
        List<VerbalReasoningQuestion> questionsByTag = questionRepository.searchByTag(tag);
        Collections.shuffle(questionsByTag);
        return ResponseEntity.ok(questionsByTag);
    }
}
