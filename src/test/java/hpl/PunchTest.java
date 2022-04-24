package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PunchTest
{
	@Test
	public void shouldInvokePrintMethodOnMeMoryCell ()
	{
		MemoryCell cell = mock(MemoryCell.class);
		Output output = mock(Output.class);

		new Punch().run(cell, output);

		verify(cell).print(output);
	}
}