package hpl;

public interface MemoryCell
{
	MemoryCell next ();
	MemoryCell previous ();
	void increment ();
	void decrement ();
	boolean isZero ();
	void print (Output output);
}