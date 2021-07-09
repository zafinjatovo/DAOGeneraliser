package DAO.main;

import DAO.critere.Condition;
import DAO.generique.Critere;
import DAO.helper.DatabaseAcess;


public class Main {
	public static void main(String [] args)throws Exception {
		String config="C:/Users/P12B-Tovo-93/eclipse-workspace/DAOGenerique/src/DAO/ressource/config.properties";
		DatabaseAcess acces= new DatabaseAcess();
		acces.open(config);
		Critere critere=new Critere("mysql");
		critere.addCondition("tovo",Condition.EQUALS,"koto");
		critere.addCondition("koto",Condition.INF,"Lita");
		critere.addCondition("koto",Condition.LIKE, "K");
		critere.addOrder("koto", 0);
		critere.addLimit(4, 8);
		System.out.print(critere.generateCritere());
	}
}
