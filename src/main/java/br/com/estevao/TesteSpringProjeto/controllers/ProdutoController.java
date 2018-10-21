package br.com.estevao.TesteSpringProjeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.estevao.TesteSpringProjeto.dao.ProdutoDao;
import br.com.estevao.TesteSpringProjeto.model.Produto;

@Controller
public class ProdutoController {

	@Autowired
	ProdutoDao dao = new ProdutoDao();
	
	@RequestMapping("/produtos/form")
	public String formulario() {
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String salvarProduto(Produto produto) {
		System.out.println(produto);
		dao.gravar(produto);
		return "produtos/ok";
	}
}
