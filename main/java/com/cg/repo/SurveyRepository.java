package com.cg.repo;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.stereotype.Repository;


import com.cg.beans.Survey;

@Repository
@EnableJpaRepositories
public interface SurveyRepository extends JpaRepository<Survey,Long> {

	public Survey save(String description);

	public Long countByFeedbacks(Survey feedbacks);
	
	public List<Survey> findByPublishedDateTime(LocalDate publishedDateTime);
}
