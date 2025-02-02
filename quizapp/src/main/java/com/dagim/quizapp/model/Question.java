package com.dagim.quizapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "question") // Ensure the table name matches
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "category") // Map to the "category" column
	private String category;

	@Column(name = "difficultyLevel") // Map to the "difficulty_level" column
	private String difficultyLevel;

	@Column(name = "option1") // Map to the "option1" column
	private String option1;

	@Column(name = "option2") // Map to the "option2" column
	private String option2;

	@Column(name = "option3") // Map to the "option3" column
	private String option3;

	@Column(name = "option4") // Map to the "option4" column
	private String option4;

	@Column(name = "question_title") // Map to the "question_title" column
	private String questionTitle;

	@Column(name = "right_answer") // Map to the "right_answer" column
	private String rightAnswer;

	// Getters and Setters (required for JSON serialization)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getQuestionTitle() {
		return questionTitle;
	}

	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
}