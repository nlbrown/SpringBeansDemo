package beans;

public class Ramp {

	private long rampID;
	private boolean access;
	private int mimYears;
	
	public Ramp() {
		
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
	/**
	 * @return the access
	 */
	public boolean isAccess() {
		return access;
	}
	/**
	 * @param access the access to set
	 */
	public void setAccess(boolean access) {
		this.access = access;
	}
	/**
	 * @return the mimYears
	 */
	public int getMimYears() {
		return mimYears;
	}
	/**
	 * @param mimYears the mimYears to set
	 */
	public void setMimYears(int mimYears) {
		this.mimYears = mimYears;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ramp [rampID=" + rampID + ", access=" + access + ", mimYears=" + mimYears + "]";
	}
	
	
}
