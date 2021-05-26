package com.rahul.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	int playerid;
	String playername;
	int runsscored;
	String teamname;
	public int getPlayerid() {
		return playerid;
	}
	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public int getRunsscored() {
		return runsscored;
	}
	public void setRunsscored(int runsscored) {
		this.runsscored = runsscored;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", runsscored=" + runsscored
				+ ", teamname=" + teamname + "]";
	}
	
}
