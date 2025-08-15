package advancedjavaconcepts;
import java.util.concurrent.*;

public class UsingCallableAnonymousClassImpl {

	public static void main(String[] args) {
		
		Callable<String> cl = new Callable<String> () {
    public String call() throws Exception{
	System.out.println("inside task");
	return "task performed";
}};
ExecutorService exe = Executors.newSingleThreadExecutor();
Future future = exe.submit(cl);
try {
System.out.println(future.get());}catch(Exception e) {
	e.printStackTrace();
}
exe.close();
		

}}
