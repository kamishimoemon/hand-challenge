package hpl;

public class PointUp
	implements Operator
{
	@Override
	public void run (MemoryCell cell, Output output)
	{
		cell.increment();
	}
}