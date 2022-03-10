package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.beans.Surveyor;

@Repository
public interface SurveyorRepository extends JpaRepository<Surveyor, Long> {
	
}
