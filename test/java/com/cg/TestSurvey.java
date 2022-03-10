package com.cg;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.Survey;
import com.cg.repo.SurveyRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSurvey {
	@Autowired
	private SurveyRepository srepo;
	
	@Test
	public void addSurvey() {
		Survey s = new Survey();
		s.setId(2L);
		s.setDescription("Spring Java");
		s.setActive(true);
		
		srepo.save(s);
		Assertions.assertThat(s.getId()).isGreaterThan(0);
		
	}
	@Test
	public void getSurvey() {
		Survey s = new Survey();
		s.setId(2L);
		s.setDescription("Spring Java");
		s.setActive(true);
		
		srepo.save(s);
		Assertions.assertThat(s.getId()).isEqualTo(2L);
		
	}
	@Test
	public void updateSurvey() {
		Survey s = new Survey();
		s.setId(2L);
		s.setDescription("Spring Java");
		s.setActive(true);
		
		srepo.save(s);
		s.setDescription("Angular");
		Survey updateSurvey= srepo.save(s);
		Assertions.assertThat(updateSurvey.getDescription()).isEqualTo("Angular");
		
	}
	
	
}
