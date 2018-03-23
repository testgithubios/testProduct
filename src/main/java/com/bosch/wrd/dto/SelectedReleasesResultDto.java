package com.bosch.wrd.dto;

import java.util.List;

public class SelectedReleasesResultDto {

	private List<ReleasesDto> releasesDtos;
	private Long totalPages;
	
	public SelectedReleasesResultDto() {
	}

	public List<ReleasesDto> getReleasesDtos() {
		return releasesDtos;
	}

	public Long getTotalPages() {
		return totalPages;
	}

	public void setReleasesDtos(List<ReleasesDto> releasesDtos) {
		this.releasesDtos = releasesDtos;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	
}
