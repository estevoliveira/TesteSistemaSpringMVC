package br.com.estevao.TesteSpringProjeto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String desc;
	private int numPagina;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getNumPagina() {
		return numPagina;
	}
	public void setNumPagina(int numPagina) {
		this.numPagina = numPagina;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return titulo+", "+desc+", "+numPagina;
	}
}
