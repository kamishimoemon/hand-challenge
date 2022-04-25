package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class OperatorTest
{
	@Test
	public void pointRight ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		Operator.POINT_RIGHT.run(cell, output);

		verify(cell).next();
	}

	@Test
	public void pointLeft ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		Operator.POINT_LEFT.run(cell, output);

		verify(cell).previous();
	}

	@Test
	public void pointUp ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		Operator.POINT_UP.run(cell, output);

		verify(cell).increment();
	}

	@Test
	public void pointDown ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		Operator.POINT_DOWN.run(cell, output);

		verify(cell).decrement();
	}

	@Test
	public void punch ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		Operator.PUNCH.run(cell, output);

		verify(cell).print(output);
	}
}