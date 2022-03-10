package com.cg.beans;

import java.time.LocalDate;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	
    private LocalDate postedDateTime;
	
	@ManyToOne
	private Participants participant;
	
	@Column
	private String review;
	

	public Feedback() {}

public Feedback(long id, LocalDate postedDateTime, Participants participant,
		String review) {
	super();
	this.id = id;
	
	this.postedDateTime = postedDateTime;
	this.participant = participant;
	this.review = review;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}



public LocalDate getPostedDateTime() {
	return postedDateTime;
}

public void setPostedDateTime(LocalDate postedDateTime) {
	this.postedDateTime = postedDateTime;
}

public Participants getParticipant() {
	return participant;
}

public void setParticipant(Participants participant) {
	this.participant = participant;
}

public String getReview() {
	return review;
}

public void setReview(String review) {
	this.review = review;
}
	
    

}
