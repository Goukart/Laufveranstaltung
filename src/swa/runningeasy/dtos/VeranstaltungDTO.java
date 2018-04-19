package swa.runningeasy.dtos;

/**
 * @author Bernhard Hollunder
 * 
 * Represents a running event.
 * 
 */

import java.util.Date;

public class VeranstaltungDTO {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Date getAnmeldeschluss() {
		return anmeldeschluss;
	}
	public void setAnmeldeschluss(Date anmeldeschluss) {
		this.anmeldeschluss = anmeldeschluss;
	}
	public int getStartgebuehr() {
		return startgebuehr;
	}
	public void setStartgebuehr(int startgebuehr) {
		this.startgebuehr = startgebuehr;
	}

	public float getDistanz() {
		return distanz;
	}
	public void setDistanz(float distanz) {
		this.distanz = distanz;
	}

	
	private String name;
	private Date datum;
	private Date anmeldeschluss;
	private int startgebuehr;
	private float distanz;
	

	public VeranstaltungDTO(String name, Date datum, Date anmeldeschluss, int startgebuehr, float distanz) {
		super();
		this.name = name;
		this.datum = datum;
		this.anmeldeschluss = anmeldeschluss;
		this.startgebuehr = startgebuehr;
		this.distanz = distanz;
	}
	
	@Override
	public String toString() {
		return "VeranstaltungDTO [name=" + name + ", datum=" + datum
				+ ", anmeldeschluss=" + anmeldeschluss + ", startgebuehr="
				+ startgebuehr + "]";
	}
	
}
