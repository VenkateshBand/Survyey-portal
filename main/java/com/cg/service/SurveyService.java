package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.cg.beans.Survey;

import com.cg.exceptions.SurveyNotFoundException;

import com.cg.repo.SurveyRepository;

@Service
public class SurveyService {
	@Autowired
	private SurveyRepository srepository;
	
	public Survey updateSurveyDescription(long id, Survey survey) {
		try {
			if(!srepository.existsById(id)){
				throw new SurveyNotFoundException();
			}
		}catch(SurveyNotFoundException e) {
			throw e;
		}
		    Survey s1 = new Survey();
		    s1.setDescription(survey.getDescription());
		    s1.setPublishedDateTime(survey.getPublishedDateTime());
		    s1.setEndDateTime(survey.getEndDateTime());
		    s1.setActive(survey.getActive());
		    return srepository.save(s1);
		}
	
	public Survey addSurvey(Survey s) {
		return srepository.save(s);		
	}
	
	public Survey findSurvey(long id){
		try {
			if(!srepository.existsById(id)) {
				throw new SurveyNotFoundException();
			}
		}catch(SurveyNotFoundException e){
			throw e;
		}	 
		 return srepository.findById(id).get();	
		 }
	
	public void removeSurvey(long id) {
		try {
			if(!srepository.existsById(id)) {
				throw new SurveyNotFoundException();
			}
		}catch(SurveyNotFoundException e){
			throw e;
		}		 
		 srepository.deleteById(id);
		 
		 }
	public List<Survey> getAll() {
		 return srepository.findAll();
	}
	public List<Survey> findByPublishedDateTime(LocalDate publishedDateTime){
		return srepository.findByPublishedDateTime(publishedDateTime);
	}

	public long countByFeebacks(Survey feedbacks) {
	return srepository.count();
} 
	
	
}


