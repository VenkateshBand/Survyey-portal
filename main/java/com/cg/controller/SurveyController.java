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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.beans.Survey;
import com.cg.service.SurveyService;

@RestController
@RequestMapping("/survey")
@CrossOrigin(origins="http://localhost:4200")
public class SurveyController {
	@Autowired
	private SurveyService sservice;
	

	
	@PutMapping(value="/updateS/{id}")
	public Survey updateSurveyDescription(@PathVariable("id") long id,@RequestBody Survey survey) {
		Survey s1 = new Survey();
	    s1.setDescription(s1.getDescription());
	    s1.setPublishedDateTime(survey.getPublishedDateTime());
	    s1.setEndDateTime(survey.getEndDateTime());
	    s1.setActive(survey.getActive());
		return sservice.updateSurveyDescription(id, survey);
	}
	
	@PostMapping("/addS")
	public Survey addSurvey(@RequestBody Survey survey)  {
		return sservice.addSurvey(survey);
		 
}
	@GetMapping("/getS/{id}")
	public Survey getSurvey(@PathVariable long id)  {
		return sservice.findSurvey(id);
	}
	@DeleteMapping("/delS/{id}")
	public String removeSurvey(@PathVariable long id)  {
		sservice.removeSurvey(id);
		return "Deleted Successfully";		
	}
	@GetMapping("/getAllS")
	public List<Survey> getAllSurvey() {
		return sservice.getAll();
	}

	@RequestMapping("/countFds")
	public long countFeedbacks(Survey feedbacks) {
		return sservice.countByFeebacks(feedbacks);
	}
	@GetMapping("/findSurveys")
	
	public List<Survey> findAll(@RequestParam(value="publishedDateTime") @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate publishedDateTime){
		return sservice.findByPublishedDateTime(publishedDateTime);
	}
}
