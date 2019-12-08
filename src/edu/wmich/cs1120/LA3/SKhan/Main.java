package edu.wmich.cs1120.LA3.SKhan;

import java.io.File;
import java.io.IOException;

/**
 * 
 * This class was copied from assignment paper (as per instructions)
 * 
 * @author Assignment writer
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("instructions.txt");
		IExecutable[] instructions = IExecutable.loadInstructionsFromFile(file);
		ICPU cpu = new CPU();
		IMemory memory = new Memory();
		for (IExecutable ins : instructions) {
			ins.execute(cpu, memory);
		}
		memory.printMemoryStatus();
		cpu.printCPUStatus();
	}

}
