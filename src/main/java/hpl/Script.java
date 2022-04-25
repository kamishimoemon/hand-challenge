package hpl;

import java.util.Iterator;

public class Script
{
	private String script;

	public Script (String script)
	{
		this.script = script;
	}

	public void run (Output output)
	{
		MemoryCell cell = new MemoryPointer();
		Iterator<Integer> emojis = script.codePoints().iterator();
		while (emojis.hasNext())
		{
			Operator.fromCodePoint(emojis.next(), emojis).run(cell, output);
		}
	}
}