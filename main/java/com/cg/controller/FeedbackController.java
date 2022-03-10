package com.cg.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.beans.Feedback;
import com.cg.service.FeedbackService;
@RestController
@RequestMapping("/feedback")
@CrossOrigin(origins="http://localhost:4200")
public class FeedbackController {
	
	@Autowired
	private FeedbackService fService;
	
	@RequestMapping(value="/updateF/{id}",method=RequestMethod.PUT)
	public Feedback updateSurvey(@PathVariable long id,@RequestBody Feedback f) {
		return fService.updateFeedback(id, f);
	}
	@PostMapping("/addF")	
	public String addFeedback(@RequestBody Feedback feedback) {		
		fService.createFeedback(feedback);		
		return "Feedback Added Successfully";	
	}
	@GetMapping("/getF/{id}")
	public Feedback findFeedback(@PathVariable long id) {
		return fService.findFeedback(id);
	}	
	@DeleteMapping("/delF/{Id}")	
	public String removeFeedback(@PathVariable long id) {		
		fService.removeFeedback(id);
		return "Deleted Successfully";		
	}	
	@GetMapping("/getAllF")
		public List<Feedback> getAllFeedbacks(){
		return fService.getAll();		
	}
	@GetMapping("/getD")
	public List<Feedback> getByDate(@RequestParam(value="postedDateTime") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate postedDateTime){
		return fService.getByDate(postedDateTime);
	}
}

	
	
	
	
	
	
	
	

