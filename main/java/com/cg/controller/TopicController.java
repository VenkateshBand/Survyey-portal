package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.cg.beans.Topic;
import com.cg.service.TopicService;


@RestController
@RequestMapping("/topic")
@CrossOrigin(origins="http://localhost:4200")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/gettopic/{id}")
	public Topic findById(@PathVariable("id")int id) {
		return topicService.findById(id);
		}
	@GetMapping("/getTopic/{topicname}")
	public Topic findByTopicName(@PathVariable("topicname") String topicName) {
		return topicService.findByTopicName(topicName);
		
	}
	@GetMapping("/getAllT")
	public List<Topic> getAllTops(){
		return topicService.getAllTop();
	}
	
	@PutMapping(value="/updateT")
	public Topic updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
		return topic;
	}
	@PostMapping("/addT")
	public String addTopic(@RequestBody Topic topic) {
		 topicService.addTopic(topic);
		 return "Added Successfully";
		
	}
//	@GetMapping("/countSurveys")
//	public long countFeedbacks(Topic surveys) {
//		return topicService.countSurveys(surveys);
//	}
	@DeleteMapping("/delete")
	public String deleteTopic(long id) {
		topicService.deleteTopic(id);
		return "Deleted Successfully";
	}

}
