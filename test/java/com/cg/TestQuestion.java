package com.cg;


import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import com.cg.beans.Question;
import com.cg.repo.QuestionRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class TestQuestion {

	@Autowired
	private  QuestionRepository qrepo ;
	

	
	@Test
	public void testCreateQuestion() {
		Question question = new Question();
		question.setId(1L);
		question.setQuestionText("whts your question");
		
	    qrepo.save(question);
		
		Assertions.assertThat(question.getId()).isGreaterThan(0);
	}
	
	@Test
	public void getAllTestQuestionService() {
		Question question1= new Question();
		
		
		question1.setId(1L);
		question1.setQuestionText("aari");
		qrepo.save(question1);
		
		Question question2 = new Question();
		question2 .setId(22);
		question2 .setQuestionText("venky");
		qrepo.save(question2);
		List<Question> sList = new ArrayList<>();
		sList.add(question1);
		sList.add(question2 );
		
		qrepo.saveAll(sList);
		Assertions.assertThat(qrepo.findAll()).isNotEmpty();
	}
	
}
	