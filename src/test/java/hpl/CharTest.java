package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class CharTest
{
	@Test
	public void ShouldBeH ()
	{
		char letter = 72;

		Output output = mock(Output.class);
		output.print(letter);

		verify(output).print('H');
	}
}