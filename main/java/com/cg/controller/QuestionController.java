package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.beans.Question;
import com.cg.service.QuestionService;

@RestController
@RequestMapping("/question")
@CrossOrigin(origins="http://localhost:4200")
public class QuestionController {

	@Autowired
	private QuestionService sService;
	
	
	@PostMapping("/addQ")
	public String addQuestion(@RequestBody Question questionText) {
	 sService.addQuestion(questionText);
	return "question Added SuccessFully..";
	}
	@RequestMapping(value="/updateQ/{id}",method=RequestMethod.PUT)
	public Question updateQuestion(@PathVariable long id,@RequestBody Question question) {
		return sService.updateQuestion(id, question);
	}
	
	
	@DeleteMapping("/delStud/{id}")
	public String removeQuestion(@PathVariable int id) {
		 sService.removeQuestion(id);
		 return "Deleted Suceessfully";
	}
	@GetMapping("/getQ/{id}")
	public Question findQuestion(@PathVariable int id) {
		return  sService.findQuestion(id);
	}
	@GetMapping("/getAllQ")
	public List<Question> getAllQuestion(){
		return sService.getAll();
	}
	
}
