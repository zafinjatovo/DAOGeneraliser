package DAO.modele;

import DAO.annotation.DAOColumn;
import DAO.annotation.DAOEntity;
import DAO.annotation.DAOId;
import DAO.annotation.DAOTable;

@DAOEntity
@DAOTable (name = "T_produit")
public class Produit {
	
	@DAOId
	int id;
	
	@DAOColumn(required = true,max_size = 500)
	String designation;
	
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	

	public Produit(int id, String designation) {
		super();
		this.id = id;
		this.designation = designation;
	}


	@DAOId
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
