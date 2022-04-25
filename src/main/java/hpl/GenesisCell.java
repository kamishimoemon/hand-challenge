package hpl;

public class GenesisCell
	extends AbstractMemoryCell
{
	private char value;
	private MemoryCell next;

	public GenesisCell ()
	{
		this.value = 0;
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
		throw new RuntimeException("Invalid operation");
	}
}