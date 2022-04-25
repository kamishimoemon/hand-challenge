package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PointRightTest
{
	@Test
	public void shouldInvokePointRightMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		new PointRight().run(cell, output);

		verify(cell).next();
	}
}