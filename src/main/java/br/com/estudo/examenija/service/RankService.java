package br.com.estudo.examenija.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estudo.examenija.domain.RankDomain;
import br.com.estudo.examenija.repository.RankRepository;

@Service
public class RankService {
	
	@Autowired
	private RankRepository rankRepository;
	
	public String getRank(final String result,final String currentRating) {
		 String rankStatus = new RankDomain(rankRepository).getRankStatus(result, currentRating);
		return rankStatus;
	}

}
