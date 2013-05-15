/**
 * 
 */
package com.npickard.threads.simple;

/**
 * @author nigel
 *
 */
public class SimpleRunnable implements Runnable {
	private volatile boolean isRunning = true;
	private String name;
	
	/*
	 * 
	 */
	public SimpleRunnable(String name){
		this.name = name;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run(){
		while(isRunning){
			System.out.println("The runnable (" + this.getClass().getName() + ") called " + this.name + " is running....");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * 
	 */
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
		System.out.println("set to not run....");
	}
}
