package com.solvd.projectUniversity.model.university;

public abstract class Build {
	private String name;
	private String description;
	private String localization;

	public Build(String name,String localization, String description) {
		this.name=name;
		this.description=description;
		this.localization=localization;
	}
	
	public abstract void addRoom(Room r);
	public abstract boolean deleteRoom(String roomName);
	public abstract int numOfRooms();
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the localization
	 */
	public String getLocalization() {
		return localization;
	}

	/**
	 * @param localization the localization to set
	 */
	public void setLocalization(String localization) {
		this.localization = localization;
	}
	
}
