package hpl;

public class DoubleLinkedCell
	extends AbstractMemoryCell
{
	private MemoryCell previous;;

	public DoubleLinkedCell (MemoryCell previous)
	{
		super();
		this.previous = previous;
	}

	@Override
	public MemoryCell previous ()
	{
		return previous;
	}
}