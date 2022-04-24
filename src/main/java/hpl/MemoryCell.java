package hpl;

public interface MemoryCell
{
	void next ();
	void previous ();
	void increment ();
	void decrement ();
	void print (Output output);
}