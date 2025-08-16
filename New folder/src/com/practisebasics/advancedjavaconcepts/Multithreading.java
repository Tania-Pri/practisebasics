package com.practisebasics.advancedjavaconcepts;
import java.util.concurrent.*;

public class Multithreading {

	public static void main(String[] args) {
		CallableImpl im = new CallableImpl();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future future = executor.submit(im);
		try {
		future.get();} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
