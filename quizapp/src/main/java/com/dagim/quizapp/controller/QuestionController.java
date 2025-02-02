package com.dagim.quizapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dagim.quizapp.model.Question;
import com.dagim.quizapp.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@GetMapping("all-questions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}

	@GetMapping("category/{category}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
		return questionService.getQuestionsByCategory(category);
	}

	@PostMapping("add")
	public ResponseEntity<String> addQuestion(Question question) {
		return (questionService.addQuestion(question));
	}
}
