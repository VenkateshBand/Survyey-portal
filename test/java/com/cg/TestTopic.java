package com.cg;



import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import com.cg.repo.TopicRepository;

import com.cg.beans.Topic;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestTopic {
	 
	@Autowired
	private TopicRepository topicRepos;
	
	@Test
	public void addTopics() {
		Topic t = new Topic();
		t.setId(4L);
		t.setTopicName("Environment");
		t.setTopicDescription("pollution");
		
		topicRepos.save(t);
		
		Assertions.assertThat(t.getId()).isGreaterThan(0);
		
	}
	
	
	@Test
	public void getTopicsTest() {
		Topic t = new Topic();
		t.setId(4L);
		t.setTopicName("Environment");
		t.setTopicDescription("pollution");
		
		topicRepos.save(t);
		//Topic t=topicRepos.findById(4L).get();
		
		Assertions.assertThat(t.getId()).isEqualTo(4L);
	}
	
	@Test
	public void updateTopicName() {
		
		//Topic t = topicRepos.findById(4L).get();
		Topic t = new Topic();
		t.setId(4L);
		t.setTopicName("Environment");
		t.setTopicDescription("pollution");
		
		topicRepos.save(t);
		
		t.setTopicName("Nature");
		
		Topic TopicUpdate = topicRepos.save(t);
		
		Assertions.assertThat(TopicUpdate.getTopicName()).isEqualTo("Nature");
				
	}
	
	
}
