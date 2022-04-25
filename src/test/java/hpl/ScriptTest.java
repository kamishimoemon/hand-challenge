package hpl;

import org.junit.Test;
import static org.mockito.Mockito.*;
import java.util.*;

public class ScriptTest
{
	@Test
	public void shouldDisplayHello ()
	{
		Output output = mock(Output.class);

		new Script("👇🤜👇👇👇👇👇👇👇👉👆👈🤛👉👇👊👇🤜👇👉👆👆👆👆👆👈🤛👉👆👆👊👆👆👆👆👆👆👆👊👊👆👆👆👊").run(output);

		verify(output).print('H');
		verify(output).print('e');
		verify(output, times(2)).print('l');
		verify(output).print('o');
	}
}