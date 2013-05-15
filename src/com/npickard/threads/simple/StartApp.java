/**
 * 
 */
package com.npickard.threads.simple;


/**
 * @author nigel
 *
 */
public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//runSimpleRunnable();
		runSimpleRunnableWithWait();
	}

	
	private static void runSimpleRunnable(){
		SimpleThread st = new SimpleThread("blah");
		st.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.setIsRunning(false);

		
		
		SimpleRunnable sr = new SimpleRunnable("blah");
		Thread t = new Thread(sr);
		t.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sr.setIsRunning(false);
	}
	
	private static void runSimpleRunnableWithWait(){
		SimpleRunnableWithWait sr = new SimpleRunnableWithWait("blah");
		new Thread(sr).start();
		//make sure we wait enough time before changing isrunning
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		//sr.setIsRunning(false);
	}
}
