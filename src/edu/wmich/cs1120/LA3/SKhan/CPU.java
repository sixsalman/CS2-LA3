package edu.wmich.cs1120.LA3.SKhan;

/**
 * An object of this class represents two registers in a CPU
 * 
 * @author M. Salman Khan
 *
 */
public class CPU implements ICPU {

	private int ax;
	private int bx;

	/**
	 * Creates a CPU object and assigns every register a value of 0
	 */
	public CPU() {
		ax = 0;
		bx = 0;
	}

	/*
	 * Description in ICPU Interface
	 */
	@Override
	public void printCPUStatus() {
		System.out.printf("\nCPU Status:\nax:%d bx:%d\n", ax, bx);

	}

	/*
	 * Description in ICPU Interface
	 */
	@Override
	public int getAx() {
		return ax;
	}

	/*
	 * Description in ICPU Interface
	 */
	@Override
	public void setAx(int ax) {
		this.ax = ax;

	}

	/*
	 * Description in ICPU Interface
	 */
	@Override
	public int getBx() {
		return bx;
	}

	/*
	 * Description in ICPU Interface
	 */
	@Override
	public void setBx(int bx) {
		this.bx = bx;

	}

}
