package hpl;

public class PointDown
	implements Operator
{
	@Override
	public void run (MemoryCell cell, Output output)
	{
		cell.decrement();
	}
}