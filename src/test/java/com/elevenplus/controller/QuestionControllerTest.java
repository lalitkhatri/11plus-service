package com.elevenplus.controller;

import com.elevenplus.model.VerbalReasoningQuestion;
import com.elevenplus.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class QuestionControllerTest {

    @Mock
    private QuestionRepository questionRepository;
    @Mock
    private Resource questionFile;

    @InjectMocks
    private QuestionController questionController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllQuestions() {
        VerbalReasoningQuestion q1 = new VerbalReasoningQuestion();
        VerbalReasoningQuestion q2 = new VerbalReasoningQuestion();
        List<VerbalReasoningQuestion> questions = Arrays.asList(q1, q2);
        when(questionRepository.getAllQuestions()).thenReturn(questions);

        ResponseEntity<List<VerbalReasoningQuestion>> response = questionController.getAllQuestions();
        assertEquals(2, response.getBody().size());
        assertEquals(200, response.getStatusCodeValue());
    }

    @Test
    void testGetQuestionsByTag() {
        VerbalReasoningQuestion q1 = new VerbalReasoningQuestion();
        List<VerbalReasoningQuestion> questions = Collections.singletonList(q1);
        when(questionRepository.searchByTag("math")).thenReturn(questions);

        ResponseEntity<List<VerbalReasoningQuestion>> response = questionController.getQuestionsByTag("math");
        assertNotNull(response.getBody());
        assertEquals(1, response.getBody().size());
    }
}

