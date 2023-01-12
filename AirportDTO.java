package com.xworkz.collections;

import java.io.Serializable;

public class AirportDTO implements Serializable {

	private String name;
	private boolean big;
	private String location;

	public AirportDTO() {
		super();
	}

	public AirportDTO(String name, boolean big, String location) {
		super();
		this.name = name;
		this.big = big;
		this.location = location;
	}
	@Override
	public boolean equals(Object ref) {
		System.out.println("running equals from airportDTO");
		if(ref!=null) {
			if(ref instanceof AirportDTO) {
				AirportDTO dto =(AirportDTO)ref;
				if(dto.location.equals(this.location)) {
					System.out.println("location is matching "+dto.location);
					return true;
				}
			}
		}
		return false;
		}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", big=" + big + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBig() {
		return big;
	}

	public void setBig(boolean big) {
		this.big = big;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
