package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PointUpTest
{
	@Test
	public void shouldInvokePointUpMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);

		new PointUp().run(cell);

		verify(cell).increment();
	}
}