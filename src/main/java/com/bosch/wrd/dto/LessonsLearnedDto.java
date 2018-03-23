package com.bosch.wrd.dto;

public class LessonsLearnedDto {

	private Long id;
	private String category;
	private String problemDescription;
	private String rootCause;
	private String lessonLearned;
	private String whoShouldGetInform;
	private Boolean transferable;
	private String actionForEl7;
	private Long realeasesId;
	
	public LessonsLearnedDto() {
	}
	
	public LessonsLearnedDto(Long id, String category, String problemDescription, String rootCause,
			String lessonLearned, String whoShouldGetInform, Boolean transferable, String actionForEl7) {
		this.id = id;
		this.category = category;
		this.problemDescription = problemDescription;
		this.rootCause = rootCause;
		this.lessonLearned = lessonLearned;
		this.whoShouldGetInform = whoShouldGetInform;
		this.transferable = transferable;
		this.actionForEl7 = actionForEl7;
	}

	public Long getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public String getRootCause() {
		return rootCause;
	}

	public String getLessonLearned() {
		return lessonLearned;
	}

	public String getWhoShouldGetInform() {
		return whoShouldGetInform;
	}

	public Boolean getTransferable() {
		return transferable;
	}

	public String getActionForEl7() {
		return actionForEl7;
	}
	
	public Long getRealeasesId() {
		return realeasesId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public void setLessonLearned(String lessonLearned) {
		this.lessonLearned = lessonLearned;
	}

	public void setWhoShouldGetInform(String whoShouldGetInform) {
		this.whoShouldGetInform = whoShouldGetInform;
	}

	public void setTransferable(Boolean transferable) {
		this.transferable = transferable;
	}

	public void setActionForEl7(String actionForEl7) {
		this.actionForEl7 = actionForEl7;
	}
	
	public void setRealeasesId(Long realeasesId) {
		this.realeasesId = realeasesId;
	}
}
