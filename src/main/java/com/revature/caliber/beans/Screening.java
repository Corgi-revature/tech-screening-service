package com.revature.caliber.beans;

import java.util.Date;

//TODO Annotation for the bean
public class Screening {
	private Integer screeningId;
	private Candidate candidate;
	private Integer skillType;

	private Double compositeScore;
	private String aboutMeCommentary;
	private String generalCommentary;
	private String softSkillCommentary;

	private Date startDateTime;
	private Date endDateTime;
	private Boolean softSkillsVerdict;

	private String status;

	public Screening() {
		super();
	}

	public Screening(Candidate candidate, Integer skillType, Double compositeScore,
			String aboutMeCommentary, String generalCommentary, String softSkillCommentary, Date startDateTime,
			Date endDateTime, Boolean softSkillsVerdict, String status) {
		super();
		this.candidate = candidate;
		this.skillType = skillType;
		this.compositeScore = compositeScore;
		this.aboutMeCommentary = aboutMeCommentary;
		this.generalCommentary = generalCommentary;
		this.softSkillCommentary = softSkillCommentary;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.softSkillsVerdict = softSkillsVerdict;
		this.status = status;
	}

	public Integer getScreeningId() {
		return screeningId;
	}

	public void setScreeningId(Integer screeningId) {
		this.screeningId = screeningId;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}


	public Integer getSkillType() {
		return skillType;
	}

	public void setSkillType(Integer skillType) {
		this.skillType = skillType;
	}

	public Double getCompositeScore() {
		return compositeScore;
	}

	public void setCompositeScore(Double compositeScore) {
		this.compositeScore = compositeScore;
	}

	public String getAboutMeCommentary() {
		return aboutMeCommentary;
	}

	public void setAboutMeCommentary(String aboutMeCommentary) {
		this.aboutMeCommentary = aboutMeCommentary;
	}

	public String getGeneralCommentary() {
		return generalCommentary;
	}

	public void setGeneralCommentary(String generalCommentary) {
		this.generalCommentary = generalCommentary;
	}

	public String getSoftSkillCommentary() {
		return softSkillCommentary;
	}

	public void setSoftSkillCommentary(String softSkillCommentary) {
		this.softSkillCommentary = softSkillCommentary;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Boolean getSoftSkillsVerdict() {
		return softSkillsVerdict;
	}

	public void setSoftSkillsVerdict(Boolean softSkillsVerdict) {
		this.softSkillsVerdict = softSkillsVerdict;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
