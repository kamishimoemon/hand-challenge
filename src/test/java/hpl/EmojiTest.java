package hpl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmojiTest
{
	@Test
	public void pointRightCodePoint ()
	{
		assertEquals(128073, "👉".codePointAt(0));
	}

	@Test
	public void pointLeftCodePoint ()
	{
		assertEquals(128072, "👈".codePointAt(0));
	}

	@Test
	public void pointUpCodePoint ()
	{
		assertEquals(128070, "👆".codePointAt(0));
	}

	@Test
	public void pointDownCodePoint ()
	{
		assertEquals(128071, "👇".codePointAt(0));
	}

	@Test
	public void rightFistCodePoint ()
	{
		assertEquals(129308, "🤜".codePointAt(0));
	}

	@Test
	public void leftFistCodePoint ()
	{
		assertEquals(129307, "🤛".codePointAt(0));
	}

	@Test
	public void punchCodePoint ()
	{
		assertEquals(128074, "👊".codePointAt(0));
	}
}