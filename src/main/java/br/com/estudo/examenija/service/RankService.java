package br.com.estudo.examenija.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudo.examenija.domain.RankDomain;
import br.com.estudo.examenija.dto.response.ExamResponse;
import br.com.estudo.examenija.repository.RankRepository;

@Service
public class RankService {
	
	@Autowired
	private RankRepository rankRepository;
	
	public ExamResponse getRank(String result,final String currentRating) {
		 String rankStatus = new RankDomain(rankRepository).getRankStatus(result, currentRating);
		 var rankStatusResponse = ExamResponse.toResponse(rankStatus);
		return rankStatusResponse;
	}

}
