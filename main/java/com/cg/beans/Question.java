package com.cg.beans;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="question")
public class Question{

 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)	
 private long id;
 @Column

 private String questionText;
 @ManyToOne(cascade=CascadeType.ALL)
 private Feedback feedback;
 @Column
 private String answer;
 
public Question() {}
  public Question(long id, String questionText, String answer,Feedback feedback) {
	super();
	this.id = id;
	this.questionText = questionText;
	this.answer=answer;
	this.feedback=feedback;
	
}
  
  public long getId() {
   
     return id;
  
  }

    
public void setId(long id) {
    
    this.id = id;
   
 }

 
   public String getQuestionText() {
  
     
 return questionText;
   
 }

   
 public void setQuestionText(String questionText) {
  
      this.questionText = questionText;
   
 }
    


public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public Feedback getFeedback() {
	return feedback;
}
public void setFeedback(Feedback feedback) {
	this.feedback = feedback;
}


}

