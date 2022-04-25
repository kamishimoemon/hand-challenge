package hpl;

import java.util.Iterator;
import java.util.ArrayList;

public interface Operator
{
	public static final Operator POINT_RIGHT = new Operator() {
		@Override
		public void run (MemoryCell cell, Output output) {
			cell.next();
		}
	};

	public static final Operator POINT_LEFT = new Operator() {
		@Override
		public void run (MemoryCell cell, Output output) {
			cell.previous();
		}
	};

	public static final Operator POINT_UP = new Operator() {
		@Override
		public void run (MemoryCell cell, Output output) {
			cell.increment();
		}
	};

	public static final Operator POINT_DOWN = new Operator() {
		@Override
		public void run (MemoryCell cell, Output output) {
			cell.decrement();
		}
	};

	public static final Operator PUNCH = new Operator() {
		@Override
		public void run (MemoryCell cell, Output output) {
			cell.print(output);
		}
	};

	public static Operator fromCodePoint (int codePoint, Iterator<Integer> emojis)
	{
		switch (codePoint)
		{
			case 128073: return Operator.POINT_RIGHT;
			case 128072: return Operator.POINT_LEFT;
			case 128070: return Operator.POINT_UP;
			case 128071: return Operator.POINT_DOWN;
			case 129308:
				ArrayList<Operator> nested = new ArrayList<>();
				while (emojis.hasNext())
				{
					Integer emoji = emojis.next();
					if (emoji == 129307) break;
					nested.add(Operator.fromCodePoint(emoji, emojis));
				}
				return new BumpFist(nested);
			case 128074: return Operator.PUNCH;
		}

		throw new RuntimeException("Invalid code point: " + codePoint);
	}

	void run (MemoryCell cell, Output output);
}