package DAO.critere;

public class Limit {
	int start;
	int limit;
	
	public Limit() {
		// TODO Auto-generated constructor stub
	}
	
	public Limit(int start, int limit) {
		super();
		this.start = start;
		this.limit = limit;
	}
	
	
	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLimit() {
		return limit;
	}
	

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public String generateLimit(String base)throws Exception {
		String result="";
		if(base.equals("mysql")) {
			result="limit " + this.start+ "," + this.limit;
			return result;
		}else if(base.equals("postgresql")){
			result="limit " + this.limit + "  offset " + this.start;
			return result;
		}else {
			throw new Exception("Error:base de donnee non reconue!");
		}
	}
}
