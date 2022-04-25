package hpl;

public class GenesisCell
	extends AbstractMemoryCell
{
	public GenesisCell ()
	{
		super();
	}

	@Override
	public MemoryCell previous ()
	{
		throw new RuntimeException("Invalid operation");
	}
}