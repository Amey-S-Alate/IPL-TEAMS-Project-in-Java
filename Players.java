package com.tka.july5;

public class Players {
	private int jersey_no;
	private String Name;
	private int Runs;
	private int wickets;
	private String Team_name;
	
	
	
	public Players(int jersey_no, String name, int runs, int wickets, String team_name) {
		super();
		this.jersey_no = jersey_no;
		Name = name;
		Runs = runs;
		this.wickets = wickets;
		Team_name = team_name;
	}

	public int getJersey_no() {
		return jersey_no;
	}



	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getRuns() {
		return Runs;
	}



	public void setRuns(int runs) {
		Runs = runs;
	}



	public int getWickets() {
		return wickets;
	}



	public void setWickets(int wickets) {
		this.wickets = wickets;
	}



	public String getTeam_name() {
		return Team_name;
	}



	public void setTeam_name(String team_name) {
		Team_name = team_name;
	}



	@Override
	public String toString() {
		return "Players [jersey_no=" + jersey_no + ", Name=" + Name + ", Runs=" + Runs + ", wickets=" + wickets
				+ ", Team_name=" + Team_name + "]";
	}
	
	
	

}
