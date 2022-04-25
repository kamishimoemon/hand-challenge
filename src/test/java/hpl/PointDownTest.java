package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PointDownTest
{
	@Test
	public void shouldInvokePointDownMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		new PointDown().run(cell, output);

		verify(cell).decrement();
	}
}