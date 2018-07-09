package edu.rg.score.entity;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private String stuNo;
	private String stuName;
	private Integer dailyScore;
	private Integer examScore;
	private String clsNo;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** minimal constructor */
	public Score(String stuNo) {
		this.stuNo = stuNo;
	}

	/** full constructor */
	public Score(String stuNo, String stuName, Integer dailyScore,
			Integer examScore, String clsNo) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.dailyScore = dailyScore;
		this.examScore = examScore;
		this.clsNo = clsNo;
	}

	// Property accessors

	public String getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getDailyScore() {
		return this.dailyScore;
	}

	public void setDailyScore(Integer dailyScore) {
		this.dailyScore = dailyScore;
	}

	public Integer getExamScore() {
		return this.examScore;
	}

	public void setExamScore(Integer examScore) {
		this.examScore = examScore;
	}

	public String getClsNo() {
		return this.clsNo;
	}

	public void setClsNo(String clsNo) {
		this.clsNo = clsNo;
	}

}