/**
 * 
 */
package com.npickard.threads.simple;

/**
 * @author nigel
 *
 */
public class SimpleRunnableWithWait implements Runnable {
	private boolean isRunning = true;
	private String name;
	
	/*
	 * 
	 */
	public SimpleRunnableWithWait(String name){
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
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("The runnable (" + this.getClass().getName() + ") called " + this.name + " is finished running!");

	}

	/*
	 * 
	 */
	public void setIsRunning(boolean isRunning){
		this.isRunning = isRunning;
		System.out.println("set to not run....");
	}
}
