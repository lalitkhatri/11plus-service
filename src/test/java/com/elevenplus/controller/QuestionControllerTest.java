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
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    void testGetAllQuestions_Empty() {
        when(questionRepository.getAllQuestions()).thenReturn(Collections.emptyList());
        ResponseEntity<List<VerbalReasoningQuestion>> response = questionController.getAllQuestions();
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
        assertEquals(200, response.getStatusCode().value());
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

    @Test
    void testGetQuestionsByTag_Empty() {
        when(questionRepository.searchByTag("science")).thenReturn(Collections.emptyList());
        ResponseEntity<List<VerbalReasoningQuestion>> response = questionController.getQuestionsByTag("science");
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
        assertEquals(200, response.getStatusCode().value());
    }

    @Test
    void testGetQuestionsByTag_Null() {
        when(questionRepository.searchByTag(null)).thenReturn(Collections.emptyList());
        ResponseEntity<List<VerbalReasoningQuestion>> response = questionController.getQuestionsByTag(null);
        assertNotNull(response.getBody());
        assertTrue(response.getBody().isEmpty());
        assertEquals(200, response.getStatusCode().value());
    }
}
