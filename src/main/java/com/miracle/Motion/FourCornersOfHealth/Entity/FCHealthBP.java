package com.miracle.Motion.FourCornersOfHealth.Entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Component
@Entity
@Table(name="FCHEALTH_BP")
public class FCHealthBP {
	@JsonIgnore
	@Id
	private long id;
	
	@JsonIgnore
	private long pid;
	
	@JsonIgnore
	@Column(name="BP_DATE")
	private Date bpDate;
	
	@Column(name="HBP")
	private long highBP;
	
	@Column(name="LBP")
	private long lowBP;
	@Column(name="DAY")
	private Integer day;
	
	@Column(name="MONTH")
	private Integer month;
	
	@Column(name="YEAR")
	private Integer year;

	

	public FCHealthBP() {
		super();
	}
	
	public FCHealthBP(long highBP, long lowBP) {
		super();
		this.highBP = highBP;
		this.lowBP = lowBP;
	}

	

	public FCHealthBP(long pid, Date bpDate, long highBP, long lowBP, Integer day, Integer month, Integer year) {
		super();
		this.pid = pid;
		this.bpDate = bpDate;
		this.highBP = highBP;
		this.lowBP = lowBP;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public Date getBpDate() {
		return bpDate;
	}

	public void setBpDate(Date bpDate) {
		this.bpDate = bpDate;
	}

	public long getHighBP() {
		return highBP;
	}

	public void setHighBP(long highBP) {
		this.highBP = highBP;
	}

	public long getLowBP() {
		return lowBP;
	}

	public void setLowBP(long lowBP) {
		this.lowBP = lowBP;
	}

	@Override
	public String toString() {
		return "FCHealthBP [pid=" + pid + ", bpDate=" + bpDate + ", highBP=" + highBP + ", lowBP=" + lowBP + ", day="
				+ day + ", month=" + month + ", year=" + year + "]";
	}

	

}
