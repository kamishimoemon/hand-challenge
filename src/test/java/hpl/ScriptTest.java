package hpl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScriptTest
{
	@Test
	public void shouldDisplayHello ()
	{
		FakeOutput output = new FakeOutput();

		new Script("👇🤜👇👇👇👇👇👇👇👉👆👈🤛👉👇👊👇🤜👇👉👆👆👆👆👆👈🤛👉👆👆👊👆👆👆👆👆👆👆👊👊👆👆👆👊").run(output);

		assertEquals("Hello", output.get());
	}

	@Test
	public void shouldDisplayHelloWorld ()
	{
		FakeOutput output = new FakeOutput();

		new Script("👉👆👆👆👆👆👆👆👆🤜👇👈👆👆👆👆👆👆👆👆👆👉🤛👈👊👉👉👆👉👇🤜👆🤛👆👆👉👆👆👉👆👆👆🤜👉🤜👇👉👆👆👆👈👈👆👆👆👉🤛👈👈🤛👉👇👇👇👇👇👊👉👇👉👆👆👆👊👊👆👆👆👊👉👇👊👈👈👆🤜👉🤜👆👉👆🤛👉👉🤛👈👇👇👇👇👇👇👇👇👇👇👇👇👇👇👊👉👉👊👆👆👆👊👇👇👇👇👇👇👊👇👇👇👇👇👇👇👇👊👉👆👊👉👆👊").run(output);

		// @SEE: why does it print a new line at the end?
		assertEquals("Hello World!\n", output.get());
	}

	class FakeOutput
		implements Output
	{
		private StringBuilder output = new StringBuilder();

		@Override
		public void print (char c) {
			output.append(c);
		}

		public String get () {
			return output.toString();
		}
	}
}