package hpl;

public class DoubleLinkedCell
	extends AbstractMemoryCell
{
	private char value;
	private MemoryCell previous;
	private MemoryCell next;

	public DoubleLinkedCell (MemoryCell previous)
	{
		this.value = 0;
		this.previous = previous;
		this.next = null;
	}

	@Override
	public MemoryCell next ()
	{
		if (next == null) next = new DoubleLinkedCell(this);
		return next;
	}

	@Override
	public MemoryCell previous ()
	{
		return previous;
	}
}