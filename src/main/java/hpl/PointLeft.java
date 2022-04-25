package hpl;

public class PointLeft
	implements Operator
{
	@Override
	public void run (MemoryCell cell, Output output)
	{
		cell.previous();
	}
}