package DAO.critere;

public class Order {
	public static final int DESC=0;
	public static final int ASC=0;
	
	String colonne;
	int order;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String colonne, int order) {
		super();
		this.colonne = colonne;
		this.order = order;
	}

	public String getColonne() {
		return colonne;
	}

	public void setColonne(String colonne) {
		this.colonne = colonne;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	public String generateOrder() {
		String order="";
		if(this.order==0) {
			order="DESC";
		}else if(this.order==1) {
			order="ASC";
		}
		return " ORDER BY " + this.colonne + " " + order + " ";
	}
	
}
