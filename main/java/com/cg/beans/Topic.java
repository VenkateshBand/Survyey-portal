package com.cg.beans;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="topic")
public class Topic {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
		@NotNull
		@Column
	    private String topicname;
		@Column
		@NotNull
	    private String topicDescription;
//		@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="topic")	
//	    private List<Survey>surveys=new ArrayList<>();
	    //topic created by
		@OneToOne
	    private Surveyor createdBy;
		public Topic() {}
	    public Topic(long id, String topicname, String topicDescription, Surveyor createdBy) {
			super();
			this.id = id;
			this.topicname = topicname;
			this.topicDescription = topicDescription;
//			this.surveys = surveys;
			this.createdBy = createdBy;
		}


		public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getTopicName() {
	        return topicname;
	    }

	    public void setTopicName(String topicname) {
	        this.topicname = topicname;
	    }

//	    public List<Survey> getSurveys() {
//	        return surveys;
//	    }
//
//	    public void setSurveys(List<Survey> surveys) {
//	        this.surveys = surveys;
//	    }

	    public Surveyor getCreatedBy() {
	        return createdBy;
	    }

	    public void setCreatedBy(Surveyor createdBy) {
	        this.createdBy = createdBy;
	    }
		public String getTopicname() {
			return topicname;
		}
		public void setTopicname(String topicname) {
			this.topicname = topicname;
		}
		public String getTopicDescription() {
			return topicDescription;
		}
		public void setTopicDescription(String topicDescription) {
			this.topicDescription = topicDescription;
		}
	    
}
