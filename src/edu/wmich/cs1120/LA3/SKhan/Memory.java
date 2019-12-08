package edu.wmich.cs1120.LA3.SKhan;

/**
 * An object of this class represents a memory capable of storing 10 integers
 * 
 * @author M. Salman Khan
 *
 */
public class Memory implements IMemory {

	int[] memoryContent = new int[10];

	/**
	 * Creates a Memory object assigning every index of its array field as value to
	 * that index
	 */
	public Memory() {
		for (int i = 0; i < memoryContent.length; i++) {
			memoryContent[i] = i;
		}
		System.out.println("Initial memory contents:");
		for (int i = 0; i < memoryContent.length; i++)
			System.out.printf("Address %d: %d\n", i, memoryContent[i]);
	}

	/*
	 * Description in IMemory Interface
	 */
	@Override
	public void printMemoryStatus() {
		System.out.println("\nProgram output:\n\nMemory Status:");
		for (int i = 0; i < memoryContent.length; i++)
			System.out.printf("Address %d: %d\n", i, memoryContent[i]);

	}

	/*
	 * Description in IMemory Interface
	 */
	@Override
	public int[] getMemoryContent() {
		return memoryContent;
	}

	/*
	 * Description in IMemory Interface
	 */
	@Override
	public void setMemoryContent(int[] memoryContent) {
		this.memoryContent = memoryContent;

	}

}
