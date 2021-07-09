package DAO.generique;

import java.util.ArrayList;

import DAO.critere.Condition;
import DAO.critere.Limit;
import DAO.critere.Order;

public class Critere {
	
	String base;
	
	public static ArrayList<Condition> conditions=new ArrayList<>();
	public static Order order=null;
	public static Limit limit=null;
	
	public Critere() {
	}
	
	public Critere(String base) {
		this.base=base;
	}
	
	
	public void addCondition(String colonne,int operateur,String value) {
		Critere.conditions.add(new Condition(colonne, operateur, value));
	} 
	
	public void addOrder(String colonne,int order) {
		Critere.order=new Order(colonne,order);
	}
	
	public void addLimit(int page,int nombre) {
		int start=(page*nombre)-nombre;
		int limit=nombre;
		Critere.limit=new Limit(start, limit);
	}
	
	public String generateCritere() throws Exception {
		String result="";
		try {
			if(Critere.conditions.size()>0) {
				for(Condition condition : Critere.conditions) {
					result  +=condition.generateCondition();
				}
			}
			if(Critere.order!=null) {
				result+=order.generateOrder();
			}
			
			if(Critere.limit!=null) {
				result+=limit.generateLimit(this.base);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}

