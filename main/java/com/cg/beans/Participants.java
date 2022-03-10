package com.cg.beans;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="participants")
public class Participants {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column
	@NotNull
    private String username, firstName, lastName;
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL)
	private List<Feedback> feedback;
	public Participants() {}
	
    public Participants(long id, String username, String firstName, String lastName, List<Feedback> feedbacks) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.feedback = feedbacks;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Feedback> getFeedbacks() {
        return feedback;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedback = feedbacks;
    }
}
