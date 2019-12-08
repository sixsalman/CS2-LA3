package edu.wmich.cs1120.LA3.SKhan;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * This interface was copied from assignment paper (as per instructions) and
 * code was added to loadInstructionsFromFile method
 * 
 * @author Assignment writer & M. Salman Khan
 *
 */
public interface IExecutable {
	/**
	 * Overridden by the four subclasses of abstract class Instruction.
	 *
	 * It checks to see which register(s) and memory locations (if applicable) are
	 * to be used for this instruction and sets the relevant register or memory
	 * location with the result / value based on the specific instruction (add,
	 * subtract, load or store).
	 *
	 * @param cpu    The CPU object with the registers ax, bx
	 * @param memory The memory object to be used for retrieving or storing data
	 */
	void execute(ICPU cpu, IMemory memory);

	/**
	 * This is a static method and so must be implemented here. YOU WILL NEED TO
	 * WRITE THE IMPLEMENTATION FOR THIS METHOD.
	 *
	 * It reads the data in the input file and stores the individual instructions in
	 * an array of IExecutable objects. In order to determine what kind of
	 * instruction to instantiate, it needs to check the first token (or word) on
	 * each line and then create the corresponding Instruction object (passing the
	 * parameters for that object to the relevant constructor in the process).
	 * 
	 * Remember that the first line in the input file specifies the number of
	 * instructions stored in it.
	 *
	 * @param file The File object referencing the input file.
	 * @return The array of IExecutable objects / instructions.
	 * @throws IOException In case the input file is not found.
	 */
	static IExecutable[] loadInstructionsFromFile(File file) throws IOException {
		Scanner insFile = new Scanner(file);
		int numberOfIns = Integer.parseInt(insFile.nextLine());
		IExecutable[] readIns = new IExecutable[numberOfIns];
		String[] rawInsChunks = new String[3];
		for (int i = 0; i < numberOfIns; i++) {
			rawInsChunks = (insFile.nextLine()).split(",");
			switch (rawInsChunks[0]) {
			case "add":
				readIns[i] = new AddInstruction(rawInsChunks[1], rawInsChunks[2], rawInsChunks[0]);
				break;
			case "store":
				readIns[i] = new StoreInstruction(rawInsChunks[1], rawInsChunks[2], rawInsChunks[0]);
				break;
			case "load":
				readIns[i] = new LoadInstruction(rawInsChunks[1], rawInsChunks[2], rawInsChunks[0]);
				break;
			case "sub":
				readIns[i] = new SubInstruction(rawInsChunks[1], rawInsChunks[2], rawInsChunks[0]);
				break;
			}
		}
		insFile.close();
		return readIns;
	}

	/**
	 * A getter for the first argument in an instruction.
	 *
	 * @return The first argument.
	 */
	String getArg1();

	/**
	 * A setter for the first argument.
	 *
	 * @param arg1 The first argument.
	 */
	void setArg1(String arg1);

	/**
	 * A getter for the second argument in an instruction.
	 *
	 * @return The second argument.
	 */
	String getArg2();

	/**
	 * A setter for the second argument.
	 *
	 * @param arg2 The second argument.
	 */
	void setArg2(String arg2);

	/**
	 * A getter for the operation code that specifies the type of operation or
	 * instruction to be performed.
	 *
	 * @return The type of operation or instruction.
	 */
	String getOpcode();

	/**
	 * A setter for the type of operation to be performed.
	 *
	 * @param opcode The operation to be performed.
	 */
	void setOpcode(String opcode);
} // End of IExecutable
