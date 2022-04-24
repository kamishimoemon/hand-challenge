package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PointDownTest
{
	@Test
	public void shouldInvokePointDownMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);

		new PointDown().run(cell);

		verify(cell).decrement();
	}
}