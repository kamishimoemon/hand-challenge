package hpl;

public abstract class AbstractMemoryCell
	implements MemoryCell
{
	private char value;

	public AbstractMemoryCell ()
	{
		this.value = 0;
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