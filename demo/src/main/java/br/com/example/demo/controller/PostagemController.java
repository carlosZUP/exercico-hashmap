package br.com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.example.demo.postagem.PostagemModel;
import br.com.example.demo.service.PostagemService;

@Controller
public class PostagemController {
	
	@Autowired
	PostagemService postagemService;
	
	@RequestMapping("/adicionar")
	@ResponseBody
	public String adicionarPostagem() {
		postagemService.adicionarPostagem();
		return "Adicionado";
	}
	
	@RequestMapping
	@ResponseBody
	public Map<Integer, PostagemModel> mostrarPostagem(){
		return postagemService.mostrarPostagem();
		
	}
	
	@RequestMapping("/postagem/{id}")
	@ResponseBody
	public PostagemModel buscarPostagem(@PathVariable int id) {
		return postagemService.buscarPostagem(id);
	}
}
