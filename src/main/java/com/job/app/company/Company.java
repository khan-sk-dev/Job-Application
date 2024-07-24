package com.job.app.company;

import java.io.Serializable;
import java.util.List;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.job.app.job.Job;
import com.job.app.reviews.Reviews;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;

	@JsonIgnore
	@OneToMany(mappedBy = "company")
	private List<Job> job;

	@JsonIgnore
	@OneToMany(mappedBy = "company")
	private List<Reviews> review;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Reviews> getReview() {
		return review;
	}

	public void setReview(List<Reviews> review) {
		this.review = review;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description2) {
		this.description = description2;

	}

	public List<Job> getJob() {
		return this.job;
	}

	public void setJob(List<Job> jobList) {
		this.job = jobList;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name2) {
		this.name = name2;
	}

}