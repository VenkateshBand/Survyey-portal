package com.cg;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.cg.beans.Feedback;
import com.cg.repo.FeedbackRepository;
import com.cg.service.FeedbackService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TestFeedback {
	@Autowired
	private FeedbackService feedbackService;
	@MockBean
	private FeedbackRepository feedbackRepository;
	
	
	
	@Test
	public void testaddfeedback() {
		Feedback f = new Feedback();
		 f.setId(1L);
		 f.setParticipant(null);
		
		
		feedbackRepository.save(f);

		Assertions.assertThat(feedbackRepository.existsById(1L)).isNotNull();
		
	}

	@Test
	public void testgetAllFeedback() {
		
		Feedback f1 = new Feedback();
		f1.setId(3);
		 f1.setParticipant(null);
		
		feedbackRepository.save(f1);
		Feedback f2 = new Feedback();
		f2.setId(4);
		 f2.setParticipant(null);
		
		feedbackRepository.save(f2);
		
	 List<Feedback> fList = new ArrayList<>();
		fList.add(f1);
		fList.add(f2);
		feedbackRepository.saveAll(fList);
		Mockito.when(feedbackRepository.findAll()).thenReturn(fList);

		assertThat(feedbackService.getAll()).isEqualTo(fList);
	}
}


		

	