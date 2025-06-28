package com.elevenplus.repository;

import com.elevenplus.model.VerbalReasoningQuestion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.*;
import static java.util.Collections.*;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuestionRepositoryTest {

    private QuestionRepository questionRepository;

    @BeforeEach
    void setUp() {
        VerbalReasoningQuestion question1 = new VerbalReasoningQuestion("Question 1", asList("tag1", "tag2"));
        VerbalReasoningQuestion question2 = new VerbalReasoningQuestion("Question 2", singletonList("tag2"));
        VerbalReasoningQuestion question3 = new VerbalReasoningQuestion("Question 3", singletonList("tag3"));

        List<VerbalReasoningQuestion> questions = asList(question1, question2, question3);
        questionRepository = new QuestionRepository(questions);
    }

    @Test
    void testGetAllQuestions() {
        List<VerbalReasoningQuestion> allQuestions = questionRepository.getAllQuestions();
        assertEquals(3, allQuestions.size());
    }

    @Test
    void testGetAllQuestions_Empty() {
        questionRepository = new QuestionRepository(Collections.emptyList());
        List<VerbalReasoningQuestion> allQuestions = questionRepository.getAllQuestions();
        assertTrue(allQuestions.isEmpty());
    }

    @Test
    void testSearchByTag() {
        List<VerbalReasoningQuestion> tag2Questions = questionRepository.searchByTag("tag2");
        assertEquals(2, tag2Questions.size());
    }

    @Test
    void testSearchByTag_NoMatch() {
        List<VerbalReasoningQuestion> noMatchQuestions = questionRepository.searchByTag("nonexistent");
        assertTrue(noMatchQuestions.isEmpty());
    }

    @Test
    void testSearchByTag_Null() {
        List<VerbalReasoningQuestion> nullTagQuestions = questionRepository.searchByTag(null);
        assertTrue(nullTagQuestions.isEmpty());
    }

    @Test
    void testSearchByTags() {
        List<VerbalReasoningQuestion> intersectionQuestions = questionRepository.searchByTags(asList("tag1", "tag2"));
        assertEquals(1, intersectionQuestions.size());
    }

    @Test
    void testSearchByTags_NoIntersection() {
        List<VerbalReasoningQuestion> noIntersectionQuestions = questionRepository.searchByTags(asList("tag1", "tag3"));
        assertTrue(noIntersectionQuestions.isEmpty());
    }

    @Test
    void testSearchByTags_EmptyList() {
        List<VerbalReasoningQuestion> emptyTagsQuestions = questionRepository.searchByTags(Collections.emptyList());
        assertTrue(emptyTagsQuestions.isEmpty());
    }

    @Test
    void testSearchByTags_Null() {
        List<VerbalReasoningQuestion> nullTagsQuestions = questionRepository.searchByTags(null);
        assertTrue(nullTagsQuestions.isEmpty());
    }
}