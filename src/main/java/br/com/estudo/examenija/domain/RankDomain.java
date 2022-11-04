package br.com.estudo.examenija.domain;

import br.com.estudo.examenija.enumerator.RankEnum;
import br.com.estudo.examenija.repository.RankRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RankDomain {
	
	private String newRank;
	private RankEnum statusEnum; 
	private static String STATUS_RESULT = "PASSED";
	
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private transient RankRepository rankRepository;
	
	public RankDomain(RankRepository rankRepository) {
		this.rankRepository = rankRepository;
	}
	
	public String getRankStatus(final String result,final String currentRating) {
		RankDomain rank = new RankDomain();
		if(STATUS_RESULT.equals(result)) {
			int resultTest = validateResult(currentRating);
			rank.setStatusEnum(rankRepository.getExamRank(resultTest));
			rank.setNewRank(rank.getStatusEnum().getRank());
		}
		rank.setNewRank("Come back next year");
		
		
		return rank.getNewRank();
	}

	private int validateResult(String currentRating) {
		switch (currentRating) {
		case "Inciante":
			return 0;
		case "Aluno da Academia":
			return 1;
		case "Gennin":
			return 2;
		case "Chuunin":
			return 3;
		case "Jounin":
			return 4;
		case "Anbu":
			return 5;
		case "Sannin":
			return 6;
		default:
			return 7;
		}
	}
}
