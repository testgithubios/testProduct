package com.bosch.wrd.dto;

import com.bosch.wrd.entity.entityImpl.LessonsLearned;

public class LessonsLearnedConverter extends Converter<LessonsLearnedDto, LessonsLearned> {

	public LessonsLearnedConverter() {
		super(dto -> new LessonsLearned(dto.getId(), dto.getCategory(), dto.getProblemDescription(), dto.getRootCause(),
				dto.getLessonLearned(), dto.getWhoShouldGetInform(), dto.getTransferable(), dto.getActionForEl7()),
				entity -> new LessonsLearnedDto(entity.getId(), entity.getCategory(), entity.getProblemDescription(),
						entity.getRootCause(), entity.getLessonLearned(), entity.getWhoShouldGetInform(),
						entity.isTransferable(), entity.getActionForEl7()));
	}

}
