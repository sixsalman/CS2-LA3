package edu.wmich.cs1120.LA3.SKhan;

/**
 * An object of this class is capable of updating the value of a register (ax or
 * bx) through addition of values of both registers or addition of one of them
 * with value of a memory address
 * 
 * @author M. Salman Khan
 *
 */
public class AddInstruction extends Instruction {

	/**
	 * Creates an object of AddInstruction calling the constructor of its super
	 * class and passing received parameters to it
	 * 
	 * @param arg1    receives argument 1
	 * @param arg2    receives argument 2
	 * @param optcode receives operation code
	 */
	public AddInstruction(String arg1, String arg2, String optcode) {
		super(arg1, arg2, optcode);
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void execute(ICPU cpu, IMemory memory) {

		switch (getArg1()) {
		case "ax":
			if (getArg2().equals("bx")) {
				cpu.setAx(cpu.getAx() + cpu.getBx());
			} else {
				cpu.setAx(cpu.getAx() + memory.getMemoryContent()[Integer.parseInt(getArg2())]);
			}
			break;
		case "bx":
			if (getArg2().equals("ax")) {
				cpu.setBx(cpu.getBx() + cpu.getAx());
			} else {
				cpu.setBx(cpu.getBx() + memory.getMemoryContent()[Integer.parseInt(getArg2())]);
			}
			break;
		}

	}

}
