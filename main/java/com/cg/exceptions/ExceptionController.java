package com.cg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=FeedbackNotFoundException.class)
	public ResponseEntity<Object> exception(FeedbackNotFoundException e){
		return new ResponseEntity<Object>("Feedback Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=InvalidOptionException.class)
	public ResponseEntity<Object> exception(InvalidOptionException e){
		return new ResponseEntity<Object>("Inavalid Option",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=InvalidParticipantException.class)
	public ResponseEntity<Object> exception(InvalidParticipantException e){
		return new ResponseEntity<Object>("Invalid Participant",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=InvalidQuestionTextException.class)
	public ResponseEntity<Object> exception(InvalidQuestionTextException e){
		return new ResponseEntity<Object>("Invalid Question Text",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=InvalidSurveyException.class)
	public ResponseEntity<Object> exception(InvalidSurveyException e){
		return new ResponseEntity<Object>("Invalid Survey",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=InvalidSurveyorException.class)
	public ResponseEntity<Object> exception(InvalidSurveyorException e){
		return new ResponseEntity<Object>("Invalid Surveyor",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=InvalidTopicNameException.class)
	public ResponseEntity<Object> exception(InvalidTopicNameException e){
		return new ResponseEntity<Object>("Invalid Topic Name",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(value=ParticipantNotFoundException.class)
	public ResponseEntity<Object> exception(ParticipantNotFoundException e){
		return new ResponseEntity<Object>("Participant Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=QuestionNotFoundException.class)
	public ResponseEntity<Object> exception(QuestionNotFoundException e){
		return new ResponseEntity<Object>("Question Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=SurveyorNotFoundException.class)
	public ResponseEntity<Object> exception(SurveyorNotFoundException e){
		return new ResponseEntity<Object>("Question Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=SurveyNotFoundException.class)
	public ResponseEntity<Object> exception(SurveyNotFoundException e){
		return new ResponseEntity<Object>("Question Not Found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=TopicNotFoundException.class)
	public ResponseEntity<Object> exception(TopicNotFoundException e){
		return new ResponseEntity<Object>("Question Not Found",HttpStatus.NOT_FOUND);
	}
	
}
