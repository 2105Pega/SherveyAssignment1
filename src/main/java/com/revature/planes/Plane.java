package com.revature.planes;

import java.io.Serializable;

public class Plane implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 117029751550382796L;
	private int flightRange;
	private int cargoCapacity;
	private String manufactorer;
	
	public int getFlightRange() {
		return flightRange;
	}
	public void setFlightRange(int flightRange) {
		this.flightRange = flightRange;
	}
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public String getManufactorer() {
		return manufactorer;
	}
	public void setManufactorer(String manufactorer) {
		this.manufactorer = manufactorer;
	}

	public Plane()
	{
		super();
	}
	
	public Plane(int cargoCapacity, int flightRange, String manufactorer)
	{
		this.cargoCapacity = cargoCapacity;
		this.flightRange = flightRange;
		this.manufactorer = manufactorer;
	}
	@Override
	public String toString() {
		return "plane [flightRange=" + flightRange + " miles, cargoCapacity=" + cargoCapacity + " pounds, manufactorer="
				+ manufactorer + "]";
	}
}
