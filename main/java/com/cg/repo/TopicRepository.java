package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.beans.Topic;

public interface TopicRepository extends JpaRepository<Topic,Long>{

		

		
		 public Topic findByTopicname(String topicname);
//		 @Query("SELECT COUNT(u) FROM Topic u WHERE u.surveys=?1")
//		 public long countBySurveys(Topic surveys);
}
