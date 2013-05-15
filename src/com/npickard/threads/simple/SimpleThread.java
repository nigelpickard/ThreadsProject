/**
 * 
 */
package com.npickard.threads.simple;

/**
 * @author nigel
 *
 */
public class SimpleThread extends Thread {
	private volatile boolean isRunning = true;
	
	/*
	 * 
	 */
	public SimpleThread(String name){
		super(name);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run(){
		while(isRunning){
			System.out.println("The thread (" + this.getClass().getName() + ") called: " + this.getName() + " is running....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
		System.out.println("set to not run....");
	}
}
