package com.baemin.dto;

public class TeamDTO {
	private Long TeamId;
	private String TeamName;
	private PlayerDTO player;

	public TeamDTO() {
		super();
	}
	public TeamDTO(Long teamId, String teamName, PlayerDTO player) {
		super();
		TeamId = teamId;
		TeamName = teamName;
		this.player = player;
	}
	public Long getTeamId() {
		return TeamId;
	}
	public void setTeamId(Long teamId) {
		TeamId = teamId;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public PlayerDTO getPlayer() {
		return player;
	}
	public void setPlayer(PlayerDTO player) {
		this.player = player;
	}
}
