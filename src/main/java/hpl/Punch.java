package hpl;

public class Punch
	implements Operator
{
	@Override
	public void run (MemoryCell cell, Output output)
	{
		cell.print(output);
	}
}