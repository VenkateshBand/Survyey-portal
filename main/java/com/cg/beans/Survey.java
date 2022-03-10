package com.cg.beans;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="surveyTb")
public class Survey {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	@NotNull
	private String description;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Topic topic;
	
	@ManyToOne	
	private Surveyor postedBy;
	
//	@NotNull
	@Column(name="published_date",columnDefinition="DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate publishedDateTime;
	
//	@NotNull
	@Column(name="end_date",columnDefinition="DATE")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate endDateTime;
	
	@Column
//	@NotNull
	private Boolean active;

	@ManyToOne(cascade=CascadeType.ALL)
	private Feedback feedbacks;
	
	public Survey() {}
	
	public Survey(long id, String description, Topic topic, Surveyor postedBy, LocalDate publishedDateTime,
			LocalDate endDateTime, Boolean active, Feedback feedbacks) {
		super();
		this.id = id;
		this.description = description;
		this.topic = topic;
		this.postedBy = postedBy;
		this.publishedDateTime = publishedDateTime;
		this.endDateTime = endDateTime;
		this.active = active;
		this.feedbacks=feedbacks;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Surveyor getPostedBy() {
        return postedBy;
	}
	
	public void setPostedBy(Surveyor postedBy) {
        this.postedBy = postedBy;
	 }

	public LocalDate getPublishedDateTime() {
		return publishedDateTime;
	}

	public void setPublishedDateTime(LocalDate publishedDateTime) {
		this.publishedDateTime = publishedDateTime;
	}

	public LocalDate getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(LocalDate endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	public Feedback getFeedbacks() {
		return feedbacks;
	}
	public void setFeedbacks(Feedback feedbacks) {
		this.feedbacks = feedbacks;
	}

}
