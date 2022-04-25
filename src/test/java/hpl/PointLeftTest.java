package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PointLeftTest
{
	@Test
	public void shouldInvokePointLeftMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		new PointLeft().run(cell, output);

		verify(cell).previous();
	}
}