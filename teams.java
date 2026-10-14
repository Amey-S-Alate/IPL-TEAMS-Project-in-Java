package com.tka.july5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class teams {
	
	public static void main(String[] args) {
		
		List<Players> rcb_team = new ArrayList<>();
		rcb_team.add(new Players(18, "Virat Kohli", 657, 0, "RCB"));
		rcb_team.add(new Players(97, "Rajat Patidar", 312, 0, "RCB"));
		rcb_team.add(new Players(28, "Phil Salt", 387, 0, "RCB"));
		rcb_team.add(new Players(55, "Jitesh Sharma", 268, 0, "RCB"));
		rcb_team.add(new Players(6, "Krunal Pandya", 142, 10, "RCB"));
		rcb_team.add(new Players(38, "Josh Hazlewood", 48, 10, "RCB"));
		rcb_team.add(new Players(15, "Bhuvneshwar Kumar", 39, 21, "RCB"));
		rcb_team.add(new Players(13, "Tim david", 354, 0, "RCB"));
		rcb_team.add(new Players(42, "Rasikh Salam", 8, 16, "RCB"));
		rcb_team.add(new Players(5, "Suyash Sharma", 15, 7, "RCB"));
		rcb_team.add(new Players(37, "Devdutt Padikkal", 247, 0, "RCB"));
		
		
		List<Players> gt_team = new ArrayList<>();
		gt_team.add(new Players(77, "Shubman Gill", 689, 0, "GT"));
		gt_team.add(new Players(66, "Sai Sudharsan", 652, 0, "GT"));
		gt_team.add(new Players(63, "Jos Buttler", 526, 0, "GT"));
		gt_team.add(new Players(19, "Rashid Khan", 168, 21, "GT"));
		gt_team.add(new Players(7, "Rahul Tewatia", 189, 2, "GT"));
		gt_team.add(new Players(15, "Washington Sundar", 141, 8, "GT"));
		gt_team.add(new Players(25, "Jason Holder", 153, 17, "GT"));
		gt_team.add(new Players(90, "Kagiso Rabada", 28, 24, "GT"));
		gt_team.add(new Players(73, "Mohammed Siraj", 32, 24, "GT"));
		gt_team.add(new Players(24, "Prasidh Krishna", 14, 18, "GT"));
		gt_team.add(new Players(18, "Anuj Rawat", 121, 0, "GT"));
		
		List<Players> rr_team = new ArrayList<>();
		rr_team.add(new Players(12, "Yashasvi Jaiswal", 559, 0, "RR"));
		rr_team.add(new Players(14, "Riyan Parag", 432, 3, "RR"));
		rr_team.add(new Players(9, "Vaibhav Sooryavanshi", 721, 0, "RR"));
		rr_team.add(new Players(63, "Dhruv Jurel", 333, 0, "RR"));
		rr_team.add(new Players(18, "Shimron Hetmyer", 251, 0, "RR"));
		rr_team.add(new Players(99, "Wanindu Hasaranga", 72, 14, "RR"));
		rr_team.add(new Players(26, "Jofra Archer", 18, 19, "RR"));
		rr_team.add(new Players(19, "Sandeep Sharma", 9, 13, "RR"));
		rr_team.add(new Players(24, "Tushar Deshpande", 5, 11, "RR"));
		rr_team.add(new Players(22, "Maheesh Theekshana", 16, 12, "RR"));
		rr_team.add(new Players(41, "Akash Madhwal", 2, 8, "RR"));
		
		List<Players> srh_team = new ArrayList<>();
		srh_team.add(new Players(1, "Abhishek Sharma", 486, 2, "SRH"));
		srh_team.add(new Players(62, "Travis Head", 412, 1, "SRH"));
		srh_team.add(new Players(45, "Heinrich Klaasen", 437, 0, "SRH"));
		srh_team.add(new Players(23, "Ishan Kishan", 523, 0, "SRH"));
		srh_team.add(new Players(30, "Pat Cummins", 81, 13, "SRH"));
		srh_team.add(new Players(16, "Harshal Patel", 15, 18, "SRH"));
		srh_team.add(new Players(91, "Jaydev Unadkat", 7, 11, "SRH"));
		srh_team.add(new Players(97, "Eshan Malinga", 3, 9, "SRH"));
		srh_team.add(new Players(27, "Zeeshan Ansari", 1, 5, "SRH"));
		srh_team.add(new Players(108, "Aniket Verma", 274, 0, "SRH"));
		srh_team.add(new Players(10, "Abhinav Manohar", 158, 0, "SRH"));
		
		Map<String, List<Players>> ipl_teams2026 = new HashMap<>();
		ipl_teams2026.put("RCB", rcb_team);
		ipl_teams2026.put("GT", gt_team);
		ipl_teams2026.put("RR", rr_team);
		ipl_teams2026.put("SRH", srh_team);
		
		
		for(String team : ipl_teams2026.keySet())
		{
			System.out.println(" Team :" + team);

			for(Players pl: ipl_teams2026.get(team))
			{
			System.out.println("Jersey No: " + pl.getJersey_no() + ", Name: " + pl.getName() + ", Runs: " + pl.getRuns() + ", Wickets: " + pl.getWickets());
		
			}
			
		}
		Players maxPlayer = null; 

		for(String team : ipl_teams2026.keySet())
		{
			for(Players player: ipl_teams2026.get(team)) {

		        if (maxPlayer == null ||player.getWickets() > maxPlayer.getWickets()) {
		            maxPlayer = player;
		        }
		    }
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Highest Wicket Taker");
		System.out.println("Player : " + maxPlayer.getName());
		System.out.println("Team : " + maxPlayer.getTeam_name());
		System.out.println("Wickets : " + maxPlayer.getWickets());
	
		
		for(String team : ipl_teams2026.keySet())
		{
			for(Players player: ipl_teams2026.get(team)) {

		        if (maxPlayer == null || player.getRuns() > maxPlayer.getRuns()) {
		            maxPlayer = player;
		        }
		    }
		}
		
		System.out.println("---------------------------------------------------");
		System.out.println("Highest Runs scorer");
		System.out.println("Player : " + maxPlayer.getName());
		System.out.println("Team : " + maxPlayer.getTeam_name());
		System.out.println("Wickets : " + maxPlayer.getRuns());

	}
}
