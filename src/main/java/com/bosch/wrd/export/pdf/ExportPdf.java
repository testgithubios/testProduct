package com.bosch.wrd.export.pdf;

import java.io.IOException;
import java.io.InputStream;

import com.bosch.wrd.dto.ProjectReviewDto;
import com.bosch.wrd.dto.StearingCommiteeDto;
import com.itextpdf.text.DocumentException;

public interface ExportPdf {

	public InputStream exportProjectTemplate(ProjectReviewDto dto) throws IOException, DocumentException;
	
	public InputStream exportStearingCommiteeTemplate(StearingCommiteeDto dto) throws IOException, DocumentException;
	
}
