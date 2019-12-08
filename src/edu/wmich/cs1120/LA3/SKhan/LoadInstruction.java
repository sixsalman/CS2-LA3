package edu.wmich.cs1120.LA3.SKhan;

/**
 * An object of this class is capable of updating the value of a register (ax or
 * bx) by overwriting value from a memory address
 * 
 * @author M. Salman Khan
 *
 */
public class LoadInstruction extends Instruction {

	/**
	 * Creates an object of LoadInstruction calling the constructor of its super
	 * class and passing received parameters to it
	 * 
	 * @param arg1    receives argument 1
	 * @param arg2    receives argument 2
	 * @param optcode receives operation code
	 */
	public LoadInstruction(String arg1, String arg2, String optcode) {
		super(arg1, arg2, optcode);
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void execute(ICPU cpu, IMemory memory) {

		switch (getArg1()) {
		case "ax":
			cpu.setAx(memory.getMemoryContent()[Integer.parseInt(getArg2())]);
			break;
		case "bx":
			cpu.setBx(memory.getMemoryContent()[Integer.parseInt(getArg2())]);
			break;
		}

	}

}
