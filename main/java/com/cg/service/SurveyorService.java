package com.cg.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.beans.Surveyor;
import com.cg.exceptions.SurveyorNotFoundException;

import com.cg.repo.SurveyorRepository;

@Service
public class SurveyorService  {
	

	@Autowired
	private SurveyorRepository surveyorRepo;


	public String addSurveyor(Surveyor surveyor) {
		surveyorRepo.save(surveyor);
		return "Surveyor added succesfully!";
	}


	public List<Surveyor> getAllSurveyor() {
		return surveyorRepo.findAll();
	}


	public String getSurveyorById(long id) {
		try {
			if(!surveyorRepo.existsById(id)) {
				throw new SurveyorNotFoundException();
			}
		}
		catch(SurveyorNotFoundException e) {
			throw e;
		}
		surveyorRepo.findById(id).get();
		return "Surveyor is present";
	}


	public Surveyor updateSurveyor(long id, Surveyor newSurveyor) {
		try {
			if(!surveyorRepo.existsById(id)) {
				throw new SurveyorNotFoundException();
			}
		}
		catch(SurveyorNotFoundException e) {
			throw e;
		}
		return surveyorRepo.save(newSurveyor);
	}



	public void removeSurveyor(long id) {
		try {
			if(!surveyorRepo.existsById(id)) {
				throw new SurveyorNotFoundException();
			}
		}
		catch(SurveyorNotFoundException e) {
			throw e;
		}
		surveyorRepo.deleteById(id);
	}



}
