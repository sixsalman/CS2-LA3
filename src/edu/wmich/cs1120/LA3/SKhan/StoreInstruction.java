package edu.wmich.cs1120.LA3.SKhan;

/**
 * An object of this class is capable of updating the value of a memory address
 * by overwriting value from a register(ax or bx)
 * 
 * @author M. Salman Khan
 *
 */
public class StoreInstruction extends Instruction {

	/**
	 * Creates an object of StoreInstruction calling the constructor of its super
	 * class and passing received parameters to it
	 * 
	 * @param arg1    receives argument 1
	 * @param arg2    receives argument 2
	 * @param optcode receives operation code
	 */
	public StoreInstruction(String arg1, String arg2, String optcode) {
		super(arg1, arg2, optcode);
	}

	/*
	 * Description in IExecutable Interface
	 */
	@Override
	public void execute(ICPU cpu, IMemory memory) {

		int[] memContent;

		switch (getArg1()) {
		case "ax":
			memContent = memory.getMemoryContent();
			memContent[Integer.parseInt(getArg2())] = cpu.getAx();
			memory.setMemoryContent(memContent);
			break;
		case "bx":
			memContent = memory.getMemoryContent();
			memContent[Integer.parseInt(getArg2())] = cpu.getBx();
			memory.setMemoryContent(memContent);
			break;
		}

	}

}
