package com.praneeth.web4.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class Jobs {
@Id
	private String jobId;
private String jobRole;
private int salary;
private String jobLocation;
private String jobdescription;

public String getJobRole() {
	return jobRole;
}
public void setJobRole(String jobRole) {
	this.jobRole = jobRole;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getJobLocation() {
	return jobLocation;
}
public void setJobLocation(String jobLocation) {
	this.jobLocation = jobLocation;
}
public String getJobdescription() {
	return jobdescription;
}
public void setJobdescription(String jobdescription) {
	this.jobdescription = jobdescription;
}
public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}

}
