package org.opendevup.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Societe implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String nomSociete;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	public Societe(String nomSociete) {
		super();
		this.nomSociete = nomSociete;
	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
