package com.dagim.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dagim.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
