package br.com.estudo.examenija.repository;

import org.springframework.stereotype.Repository;

import br.com.estudo.examenija.enumerator.RankEnum;

@Repository
public class RankRepository {
	
	public RankEnum getExamRank(final Integer resultTest) {
		var result = RankEnum.codeEnum(resultTest);
		return result;
	}

}
