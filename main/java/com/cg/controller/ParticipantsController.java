package com.cg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cg.beans.Participants;
import com.cg.service.ParticipantsService;

@RestController
@RequestMapping("/participant")
public class ParticipantsController {
	@Autowired
	private ParticipantsService pservice;

	@RequestMapping(value="/updateP/{id}",method=RequestMethod.PUT)
	public Participants updateSurvey(@PathVariable long id,@RequestBody Participants p) {
		return pservice.updateParticipant(id, p);
		
	}
	
	@PostMapping("/addP")
	public Participants addParticipant(@RequestBody Participants participant){
		return pservice.addParticipant(participant);
	
	}
	
	
}
	