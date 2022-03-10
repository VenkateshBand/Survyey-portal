package com.cg;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.beans.Surveyor;
import com.cg.repo.SurveyorRepository;
import com.cg.service.SurveyorService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSurveyor {

	@Autowired
	private SurveyorService surveyorService;
	
	@MockBean
	private SurveyorRepository surveyorRepository;
	
	@Test
	public void testAddSurveyor() {
		Surveyor so = new Surveyor();
		so.setId(1L);
		
		so.setFirstName("komal");
		so.setLastName("Thakarele");
		
		surveyorRepository.save(so);
		
		Assertions.assertThat(so.getId()).isGreaterThan(0);
	}
	
	@Test
	public void getAllSurveyorTest() {
		Surveyor s1 = new Surveyor();
		s1.setId(11);
		
		s1.setFirstName("Taki");
		s1.setLastName("thakare");
		
		Surveyor s2 = new Surveyor();
		s2.setId(22);
		
		s2.setFirstName("Kaveri");
		s2.setLastName("thakare");
		
		List<Surveyor> sList = new ArrayList<>();
		sList.add(s1);
		sList.add(s2);
		
		Mockito.when(surveyorRepository.findAll()).thenReturn(sList);
		
		assertThat(surveyorService.getAllSurveyor()).isEqualTo(sList);
	}
	
}	

	
	
	
	

	
	
	
	
	

