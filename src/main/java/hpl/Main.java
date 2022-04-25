package hpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;

public class Main
{
	public static void main (String[] args) throws Exception
	{
		new Script(
			new BufferedReader(
				new InputStreamReader(
					new FileInputStream("input.hand"),
					"UTF-8"
				)
			).readLine()
		).run(new DefaultOutput());
	}
}