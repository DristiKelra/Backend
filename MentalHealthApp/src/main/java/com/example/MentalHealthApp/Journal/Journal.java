package com.example.MentalHealthApp.Journal;


import java.util.Date;
import java.util.List;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	 
	@Entity
	@Table(name="journal")
	public class Journal 
	{
		@Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long userid;
		 @Column(name = "title", nullable = false, length = 50)
		private String title;
		@Column(nullable = false, length = 300)
	    private String description;
		
	    @Temporal(TemporalType.DATE)
	    private Date created_date = new Date(System.currentTimeMillis());
	    
	    @Temporal(TemporalType.TIME)
	    private Date created_time = new Date(System.currentTimeMillis());
	    
	    
	    
	public Journal()
	{
	}
	 
	public Journal(Long Userid, String title,String description ,Date created_date ,Date created_time  ) 
	{
		this.userid = Userid;
		this.title = title;
		this.description= description;
		this.created_date= created_date;
		this.created_time =created_time ;
		
		
	}




	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}