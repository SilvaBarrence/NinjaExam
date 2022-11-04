package br.com.estudo.examenija.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudo.examenija.service.RankService;

@RestController
public class RankController {

	@Autowired
	private RankService RankService;
	
//	@PostMapping("/")
}
