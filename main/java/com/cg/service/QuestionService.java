package com.cg.service;
import java.util.List;
import java.util.function.IntPredicate;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.cg.beans.Question;
import com.cg.exceptions.QuestionNotFoundException;
import com.cg.repo.QuestionRepository;



@Service
public class QuestionService {

@Autowired
private QuestionRepository qrepo;

public Question updateQuestion(long id,Question question)
{
try {
	if(!qrepo.existsById(id)) {
		throw new QuestionNotFoundException();
}
}catch(QuestionNotFoundException e) {
	throw e;
	}
return qrepo.save(question);
}
public Question addQuestion(Question questionText) {
	

return qrepo.save(questionText);
	
}

public Question findQuestion(long id) {
	try {
		if(!qrepo.existsById(id)) {
			throw new QuestionNotFoundException();
		}
	}catch(QuestionNotFoundException e) {
		throw e;
		
	}
	return  qrepo.findById(id).get();
}
public void removeQuestion(long id){
	try {
		if(!qrepo.existsById(id)) {
			throw new QuestionNotFoundException();	
		}
	}catch(QuestionNotFoundException e) {
		throw e;
		
	}
	qrepo.deleteById(id);
	}
	

public List<Question> getAll() {
	return qrepo.findAll();
}
public IntPredicate getAllQuestion() {
	// TODO Auto-generated method stub
	return null;
}

}
