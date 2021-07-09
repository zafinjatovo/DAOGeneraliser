package DAO.critere;


public class Condition {
	
	public static final int EQUALS=0;
	public static final int DIFFERENT=1;
	public static final int INF=2;
	public static final int SUP=3;
	public static final int LIKE=4;
	
	String colonne;
	int operateur;
	String value;
	
	public Condition() {
		// TODO Auto-generated constructor stub
	}

	public String getColonne() {
		return colonne;
	}

	public void setColonne(String colonne) {
		this.colonne = colonne;
	}

	public int getOperateur() {
		return operateur;
	}

	public void setOperateur(int operateur) {
		this.operateur = operateur;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Condition(String colonne, int operateur, String value) {
		super();
		this.colonne = colonne;
		this.operateur = operateur;
		this.value = value;
	}
	
	public String generateCondition() {
		String operateur="";
		String result= "";
		if(this.operateur == 0) {
			operateur="=";
		}else if( this.operateur == 1) {
			operateur="<>";
		}else if (this.operateur == 2) {
			operateur="<";
		}else if (this.operateur == 3) {
			operateur=">";
		}
		result = " AND  " + this.getColonne() + " " +  operateur + " '" + this.value  + "' ";
		if(this.operateur == 4) {
			operateur= " LIKE ";
			result = " AND  " + this.getColonne() + " " +  operateur + " '%" + this.value  + "%' ";
		}
		return result;
	}
	
}
