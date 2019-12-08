package edu.wmich.cs1120.LA3.SKhan;

/**
 * 
 * 2nd October 2019
 * CS1120-545 LA3
 * This program simulates the execution of a list of instructions on a CPU and
 * on locations in memory.
 * The pseudocode for this lab assignment is in LA2SKhan folder.
 * 
 * This class serves as superclass to classes representing instructions of
 * different types and stores data required by multiple subclasses
 * 
 * @author M. Salman Khan
 *
 */
public abstract class Instruction implements IExecutable {

	private String arg1;
	private String arg2;
	private String opcode;

	/**
	 * Stores received parameters so they could be used by objects of subclasses
	 * 
	 * @param arg1    receives argument 1
	 * @param arg2    receives argument 2
	 * @param optcode receives operation code
	 */
	public Instruction(String arg1, String arg2, String optcode) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.opcode = optcode;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public String getArg1() {
		return arg1;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public String getArg2() {
		return arg2;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public String getOpcode() {
		return opcode;
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void setOpcode(String opcode) {
		this.opcode = opcode;
	}

}
