package com.elevenplus.repository;

import com.elevenplus.model.VerbalReasoningQuestion;
import java.util.*;

public class QuestionRepository {
    private List<VerbalReasoningQuestion> questions;
    private Map<String, List<VerbalReasoningQuestion>> tagIndex;

    public QuestionRepository(List<VerbalReasoningQuestion> questions) {
        this.questions = questions;
        this.tagIndex = new HashMap<>();
        buildIndex();
    }

    private void buildIndex() {
        for (VerbalReasoningQuestion q : questions) {
            if (q.getTags() != null) {
                for (String tag : q.getTags()) {
                    String normalizedTag = tag.toLowerCase();
                    tagIndex.computeIfAbsent(normalizedTag, k -> new ArrayList<>()).add(q);
                }
            }
        }
    }

    public List<VerbalReasoningQuestion> getAllQuestions() {
        return questions;
    }

    public List<VerbalReasoningQuestion> searchByTag(String tag) {
        return tagIndex.getOrDefault(tag.toLowerCase(), Collections.emptyList());
    }
    
    // Optional: For multiple tags (intersection)
    public List<VerbalReasoningQuestion> searchByTags(List<String> tags) {
        List<Set<VerbalReasoningQuestion>> listOfSets = new ArrayList<>();
        for (String tag : tags) {
            List<VerbalReasoningQuestion> list = searchByTag(tag);
            listOfSets.add(new HashSet<>(list));
        }
        if (listOfSets.isEmpty()) {
            return Collections.emptyList();
        }
        Set<VerbalReasoningQuestion> intersection = listOfSets.get(0);
        for (Set<VerbalReasoningQuestion> set : listOfSets.subList(1, listOfSets.size())) {
            intersection.retainAll(set);
        }
        return new ArrayList<>(intersection);
    }
}
