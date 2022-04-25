package hpl;

public class MemoryPointer
	implements MemoryCell
{
	private MemoryCell current;

	public MemoryPointer ()
	{
		this.current = new GenesisCell();
	}

	@Override
	public MemoryCell next ()
	{
		current = current.next();
		return current;
	}

	@Override
	public MemoryCell previous ()
	{
		current = current.previous();
		return current;
	}

	@Override
	public void increment ()
	{
		current.increment();
	}

	@Override
	public void decrement ()
	{
		current.decrement();
	}

	@Override
	public boolean isZero ()
	{
		return current.isZero();
	}

	@Override
	public void print (Output output)
	{
		current.print(output);
	}
}