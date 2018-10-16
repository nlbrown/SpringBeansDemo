package beans;

public class Employee {
	private int empID;
	private String fName;
	private char midI='X';
	private String lName;
	private long rampID;
	
	
	public Employee() {
		
	}


	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}


	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}


	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}


	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}


	/**
	 * @return the midI
	 */
	public char getMidI() {
		return midI;
	}


	/**
	 * @param midI the midI to set
	 */
	public void setMidI(char midI) {
		this.midI = midI;
	}


	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}


	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}


	/**
	 * @return the rampID
	 */
	public long getRampID() {
		return rampID;
	}


	/**
	 * @param rampID the rampID to set
	 */
	public void setRampID(long rampID) {
		this.rampID = rampID;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", fName=" + fName + ", midI=" + midI + ", lName=" + lName + "]";
	}

	 
}
