package br.com.estudo.examenija.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExamResponse {
	private String newRankNinja;

	public static ExamResponse toResponse(String rankStatus) {
		ExamResponse response = new ExamResponse();
		response.setNewRankNinja("Congrats, you pass. Your new rank is " +rankStatus);
		return response;
	}

}
