package hpl;

import java.util.Iterator;

public class BumpFist
	implements Operator
{
	Iterable<Operator> operators;

	public BumpFist (Iterable<Operator> operators)
	{
		this.operators = operators;
	}

	@Override
	public void run (MemoryCell cell, Output output)
	{
		while (!cell.isZero()) operators.forEach(op -> op.run(cell, output));
	}
}