package br.com.estudo.examenija.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor
public enum RankEnum {
	
	SCHOOL(0, "Aluno da Academia"), 
	GENNIN(1,"Gennin"), 
	CHUNNIN(2,"Chuunin"),
	JOUNIN(3,"Jounin"), 
	ANBU(4,"Anbu"), 
	SANNIN(5,"Sannin"), 
	KAGE(6,"Kage"),
	ERROR(7, "RANK INCORRETO");
	
	private Integer code;
	private String rank;
	
	public static RankEnum codeEnum(final Integer code) {
		for (RankEnum intem : RankEnum.values()) {
			if(intem.getCode().equals(code)) {
				return intem;
			}
		}
		return RankEnum.ERROR;
	}
	
}
