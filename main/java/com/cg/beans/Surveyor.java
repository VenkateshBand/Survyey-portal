package com.cg.beans;

import java.util.ArrayList;
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

@Entity
@Table(name="surveyor")
public class Surveyor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;
	
	@Column
	@NotNull
    private String username;
	
	@NotNull
	@Column
    private String firstName;
	
	@NotNull
	@Column
    private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="postedBy")
    private List<Survey> createdSurveys = new ArrayList<>();
	
	public Surveyor() {}
	
    public Surveyor(long id, String username, String firstName, String lastName, List<Survey> createdSurveys) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.createdSurveys = createdSurveys;
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

    public List<Survey> getCreatedSurveys() {
        return createdSurveys;
    }

    public void setCreatedSurveys(List<Survey> createdSurveys) {
        this.createdSurveys = createdSurveys;
    }
}
