package com.practisebasics.advancedjavaconcepts;
import java.util.concurrent.*;


public class CallableImpl  implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
	System.out.println("Inside task");
	return 1;
	}
		
}
