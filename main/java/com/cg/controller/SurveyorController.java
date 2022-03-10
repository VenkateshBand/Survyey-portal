package com.cg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.beans.Surveyor;
import com.cg.service.SurveyorService;

@RestController
@RequestMapping("/surveyor")
@CrossOrigin(origins="http://localhost:4200")
public class SurveyorController {
	
	
	@Autowired
	private SurveyorService surveyorService;
	
	@PostMapping("/addSurveyor")
	public ResponseEntity<String> addSurveyor(@RequestBody Surveyor surveyor) {
		 surveyorService.addSurveyor(surveyor);
		 return new ResponseEntity<String>("Surveyor added Succesfully", HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getSurveyor/{sid}")
	public String getById(@PathVariable("sid") int id) {
		return surveyorService.getSurveyorById(id);
	}
	
	@GetMapping("/getAll")
	public List<Surveyor> getAllSurveyor(){
		return surveyorService.getAllSurveyor();
	}
	
	@RequestMapping(value="/updateSur/{id}",method=RequestMethod.PUT)
	public Surveyor updateSurvey(@PathVariable long id,@RequestBody Surveyor newSurveyor) {
		return surveyorService.updateSurveyor(id, newSurveyor);
	}
	
	@DeleteMapping("/deleteS/{id}")
	public String removeSurveyor(@PathVariable int id) {
		surveyorService.removeSurveyor(id);
		return "deleted Succesfully";
	}

	
}
