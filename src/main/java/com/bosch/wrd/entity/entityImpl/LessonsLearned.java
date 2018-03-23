package com.bosch.wrd.entity.entityImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.bosch.wrd.entity.BaseEntity;

@Entity
@Table(name = "lessons_learned")
public class LessonsLearned extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "category")
	private String category;
	
	@Column(name = "problem_description")
	private String problemDescription;
	
	@Column(name = "root_cause")
	private String rootCause;
	
	@Column(name = "lesson_learned")
	private String lessonLearned;
	
	@Column(name = "who_should_get_inform")
	private String whoShouldGetInform;
	
	@Column(name = "transferable")
	private Boolean transferable;
	
	@Column(name = "action_for_el_7")
	private String actionForEl7;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "releases_id")
	private Releases releases;
	
	public LessonsLearned() {
	}

	public LessonsLearned(Long id, String category, String problemDescription, String rootCause, String lessonLearned,
			String whoShouldGetInform, Boolean transferable, String actionForEl7) {
		super(id);
		this.category = category;
		this.problemDescription = problemDescription;
		this.rootCause = rootCause;
		this.lessonLearned = lessonLearned;
		this.whoShouldGetInform = whoShouldGetInform;
		this.transferable = transferable;
		this.actionForEl7 = actionForEl7;
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

	public Boolean isTransferable() {
		return transferable;
	}

	public String getActionForEl7() {
		return actionForEl7;
	}
	
	public Releases getReleases() {
		return releases;
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
	
	public void setReleases(Releases releases) {
		this.releases = releases;
	}
}
