package com.studentcrud.studentcrud.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	private long id;
	
	@Column(name = "name", nullable = false, length = 20)
    private String name;
   
	
	@Column(name="college",nullable = false,length = 45  )
    private String college;
	
	
	
	@Column(name = "emailId", nullable = false ,length = 45)
    private String emailId;
    
	@Column(nullable = false, unique = true, length = 10)
    private long phoneno;
    
	@Column(nullable = false, unique = true, length = 30)
    private String course;
    
	@Column(name = "semister",nullable = false, length = 2)
    private int semister;
   
	
	@Column(name = "percentage",nullable = false, length = 5)
    private String percentage;
    
   
	@Column(name = "location",nullable = false, length = 45)
    private String location;
    
    
	@Column(name = "companypackage",nullable = false, length = 45)
    private Long companypackage;
    
   
	@Column(name = "companyplaced",nullable = false, length = 45)
    private String companyplaced;
    
    
    
    
    public Student() {
		super();
	}
    
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
		@Column(nullable = false, length = 25)
		public String getName() {
		return name;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Column(nullable = false, length = 25)
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
//	@Email(message = "Email cannot be empty" ,nullable = false, length = 25, regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
	//@NotEmpty(message = "Email cannot be empty")
	@Column(nullable = false, length = 25 )
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	@Column(nullable = false, length = 10)
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	
	@Column(nullable = false, length = 25)
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	@Column(nullable = false, length = 25)
	public int getSemister() {
		return semister;
	}
	
	
	public void setSemister(int semister) {
		this.semister = semister;
	}
	
	
	
	
	@Column(nullable = false, length = 25)
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	
	
	@Column(nullable = false, length = 25)
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	@Column(nullable = false, length = 25)
	public Long getCompanypackage() {
		return companypackage;
	}
	public void setCompanypackage(Long companypackage) {
		this.companypackage = companypackage;
	}
	
	
	
	@Column(nullable = false, length = 25)
	public String getCompanyplaced() {
		return companyplaced;
	}
	public void setCompanyplaced(String companyplaced) {
		this.companyplaced = companyplaced;
	}
	
	
	
	
	
	
	
	
	public Student(long id, String name, String college, String emailId, long phoneno, String course, int semister,
			String percentage, String location, Long companypackage,String companyplaced) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.emailId = emailId;
		this.phoneno = phoneno;
		this.course = course;
		this.semister = semister;
		this.percentage = percentage;
		this.location = location;
		this.companypackage = companypackage;
		this.companyplaced = companyplaced;
	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", emailId=" + emailId + ", phoneno="
				+ phoneno + ", course=" + course + ", semister=" + semister + ", percentage=" + percentage
				+ ", location=" + location + ", companypackage=" + companypackage + ", companyplaced=" + companyplaced
				+ "]";
	}
	
    
}
