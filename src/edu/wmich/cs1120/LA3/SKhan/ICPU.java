package edu.wmich.cs1120.LA3.SKhan;

/**
 * 
 * This interface was copied from assignment paper (as per instructions)
 * 
 * @author Assignment writer
 *
 */
public interface ICPU {
	/**
	 * Prints out the status of the 2 CPU registers (ax and bx) - i.e the values
	 * stored in the registers.
	 */
	void printCPUStatus();

	/**
	 * Returns the value stored in register ax.
	 *
	 * @return Value in ax.
	 */
	int getAx();

	/**
	 * Updates the value in ax with the value in the parameter.
	 *
	 * @param axNew value for ax.
	 */
	void setAx(int ax);

	/**
	 * Returns the value stored in register bx.
	 *
	 * @return
	 */
	int getBx();

	/**
	 * Updates the value in bx with the value in the parameter.
	 *
	 * @param bx
	 */
	void setBx(int bx);
} // End of ICPU
