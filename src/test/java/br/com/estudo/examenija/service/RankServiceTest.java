package br.com.estudo.examenija.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.estudo.examenija.domain.RankDomain;
import br.com.estudo.examenija.dto.response.ExamResponse;
import br.com.estudo.examenija.enumerator.RankEnum;
import br.com.estudo.examenija.repository.RankRepository;

@ExtendWith(MockitoExtension.class)
class RankServiceTest {
	
	@InjectMocks
	private RankService rankService;
	
	@Mock
	private RankRepository rankRepository;

	@Test
	void getRankTest() {
		Mockito.when(rankRepository.getExamRank(Mockito.anyInt())).thenReturn(RankEnum.JOUNIN);
		ExamResponse result = rankService.getRank("PASSED", "Gennin");
		assertEquals("Congrats, you pass. Your new rank is Jounin" , result.getNewRankNinja());
	}

}
