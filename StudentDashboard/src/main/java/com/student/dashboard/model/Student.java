package com.student.dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity				// acts like a table in DB and acts as a class in the java perspective 
public class Student {
	
	@Id				// it is a id of this table
	@GeneratedValue(strategy = GenerationType.AUTO)		// For AutoGeneration of the values
	private Integer stdRollNumber;
	
	private String stdName;
	private String stdAddress;
	private Double stdPercentage;
	
	
}
