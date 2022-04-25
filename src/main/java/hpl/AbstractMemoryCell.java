package hpl;

public abstract class AbstractMemoryCell
	implements MemoryCell
{
	private char value;
	private MemoryCell next;

	public AbstractMemoryCell ()
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
	public void increment ()
	{
		value++;
		if (value > 255) value = 0;
	}

	@Override
	public void decrement ()
	{
		value--;
		if (value < 0) value = 255;
	}

	@Override
	public boolean isZero ()
	{
		return value == 0;
	}

	@Override
	public void print (Output output)
	{
		output.print(value);
	}
}