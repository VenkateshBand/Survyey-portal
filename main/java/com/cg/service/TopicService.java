 package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.beans.Topic;
import com.cg.exceptions.TopicNotFoundException;
import com.cg.repo.TopicRepository;

@Service
public class TopicService {
	
		
		@Autowired
		private TopicRepository topicRepository;
		
		public Topic findById(long id) {
			try {
				if(!topicRepository.existsById(id)) {
					throw new TopicNotFoundException();
					
				}
			}
			catch (TopicNotFoundException e) {
				throw e;
			}
			return topicRepository.findById(id).get();
		}

		public void updateTopic(long id,Topic topic) {
			try {
				if(!topicRepository.existsById(id)) {
					throw new TopicNotFoundException();
				}
			}
				catch (TopicNotFoundException e) {
					throw e;
				}
				topicRepository.save(topic);
			
		}
		public String deleteTopic(long id) {
			topicRepository.deleteById(id);
			return "deleted Successfully";
			
		}
		
		public String updateTopic(Topic t) {
			 topicRepository.save(t);
			 return "added successfully";
		}
		public String addTopic(Topic t) {
			 topicRepository.save(t);
			 return "added successfully";

		}
		public List<Topic> getAllTop(){
			return topicRepository.findAll();
		}
		public Topic findByTopicName(String topicname){
			return topicRepository.findByTopicname(topicname);
		}
//		public long countSurveys(Topic surveys) {
//			return topicRepository.count();
//		}
}
