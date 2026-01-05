package com.practisebasics.advancedjavaconcepts;
import java.util.*;

public class ProducerConsumerClassic {
	Queue <Integer> buffer = new LinkedList<>();
	private final int CAPACITY = 5;
	public synchronized void produce(int value) throws InterruptedException{
		while(buffer.size()==CAPACITY) {
			wait();
		}buffer.add(value);
		Thread.sleep(2000);}
	public synchronized int consume()throws InterruptedException{
		int value = 0;
		while(buffer.isEmpty()) {
			wait();
		} value = buffer.poll();
		return value;
	}
}
