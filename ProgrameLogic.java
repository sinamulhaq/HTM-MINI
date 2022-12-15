package org.fi;
import java.util.Iterator;


	public class ProgramLogic
	{
		public void display(Iterator<String>iterator)
		while(iterator.hasNext())
			String data =iterator.next();
		if(data.equals("Second"))
		{
			iterator.remove();
			break;
		}
	}
	

