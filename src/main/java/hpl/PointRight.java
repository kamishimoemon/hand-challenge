package hpl;

public class PointRight
	implements Operator
{
	@Override
	public void run (MemoryCell cell, Output output)
	{
		cell.next();
	}
}