package br.com.estudo.examenija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.examenija.dto.request.ExamRequest;
import br.com.estudo.examenija.dto.response.ExamResponse;
import br.com.estudo.examenija.service.RankService;

@RestController
public class RankController {

	@Autowired
	private RankService rankService;
	
	@PostMapping("/v1/ninja/exam/result")
	@ResponseBody
	public ResponseEntity<ExamResponse> result(@RequestBody ExamRequest request){
		var result = ResponseEntity.ok(rankService.getRank(request.getResult(), request.getCurrentRating()));
		return result;
	}
}
