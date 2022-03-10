package com.cg.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	public List<Feedback> findByPostedDateTime(LocalDate postedDateTime);

}
