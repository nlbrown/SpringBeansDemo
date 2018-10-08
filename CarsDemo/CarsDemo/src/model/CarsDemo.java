package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car")
 
public class CarsDemo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="Make")
	private String make;
	@Column(name="Model")
	private String model;
	@Column(name="Year")
	private int year;
		
	public CarsDemo() {

	}


	public CarsDemo(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}


	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}


	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}


	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}


	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarsDemo [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	
	
}
