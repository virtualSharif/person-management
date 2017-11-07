package com.wagawin.person.rest.exception;

import com.wagawin.person.business.dto.StatusDTO;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private StatusDTO statusDTO;

	public BadRequestException(StatusDTO statusDTO) {
		super();
		this.setStatusDTO(statusDTO);
	}

	public StatusDTO getStatusDTO() {
		return statusDTO;
	}

	public void setStatusDTO(StatusDTO statusDTO) {
		this.statusDTO = statusDTO;
	}
}
