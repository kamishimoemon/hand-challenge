package hpl;

import java.util.Iterator;
import java.util.ArrayList;

public interface Operator
{
	void run (MemoryCell cell, Output output);

	public static Operator fromCodePoint (int codePoint, Iterator<Integer> emojis)
	{
		switch (codePoint)
		{
			case 128073: return new PointRight();
			case 128072: return new PointLeft();
			case 128070: return new PointUp();
			case 128071: return new PointDown();
			case 129308:
				ArrayList<Operator> nested = new ArrayList<>();
				while (emojis.hasNext())
				{
					Integer emoji = emojis.next();
					if (emoji == 129307) break;
					nested.add(Operator.fromCodePoint(emoji, emojis));
				}
				return new BumpFist(nested);
			case 128074: return new Punch();
		}

		throw new RuntimeException("Invalid code point: " + codePoint);
	}
}