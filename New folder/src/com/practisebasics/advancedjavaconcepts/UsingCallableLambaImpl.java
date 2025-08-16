package com.practisebasics.advancedjavaconcepts;
import java.util.concurrent.*;

public class UsingCallableLambaImpl {

	public static void main(String[] args) {
		Callable <String> cl = () -> {
			return "Task";
			};
			ExecutorService exe = Executors.newSingleThreadExecutor();
			Future ft = exe.submit(cl);
			try {
			System.out.println(ft.get());}catch(Exception e) {
				e.printStackTrace();
			};
			exe.close();
			
		}

}
