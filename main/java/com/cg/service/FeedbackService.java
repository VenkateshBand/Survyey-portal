package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Feedback;
import com.cg.exceptions.SurveyNotFoundException;
import com.cg.repo.FeedbackRepository;

@Service
public class FeedbackService {	
	@Autowired
	private FeedbackRepository frepository;	
public Feedback updateFeedback(long id, Feedback f) {
		
try {			
		if(!frepository.existsById(id)) {				
		throw new SurveyNotFoundException();			
	}		
		}catch(SurveyNotFoundException e) {			
			throw e;
		}		
		return frepository.save(f);
	    }

         public Feedback createFeedback(Feedback f) {	
         return frepository.save(f);	 
 	    }
         public Feedback findFeedback(long id) { 			
        	 try {				
 		if(!frepository.existsById(id)) {					
 		throw new SurveyNotFoundException(); 					
 	  }				
 		}catch(SurveyNotFoundException e) {					
 				throw e;
 	   } 				
     return frepository.findById(id).get();    
 	}				
  public void removeFeedback(long id) {	  
   try {	   
	   if(!frepository.existsById(id)) {		 					
	   throw new SurveyNotFoundException();		 					
	}
	  }catch(SurveyNotFoundException e) {		 					
		 	throw e;
	}			   
	  frepository.deleteById(id);				   
	}			   
     public List<Feedback> getAll(){	
      return frepository.findAll();			 
     }
     public List<Feedback> getByDate(LocalDate postedDateTime){
    	 return frepository.findByPostedDateTime(postedDateTime);
     }
}





	
	
	


