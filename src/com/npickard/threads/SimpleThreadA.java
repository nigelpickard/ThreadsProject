package com.npickard.threads;

public class SimpleThreadA implements Runnable {
	volatile boolean isRunning = true;
	
	@Override
	public void run(){
		System.out.println("Starting SimpleThreadA");
		runIt();
	}
	
	private synchronized void runIt(){
	    // This guard only loops once for each special event, which may not
	    // be the event we're waiting for.
	    while(isRunning) {
	        try {
	            wait();
	        } catch (InterruptedException e) {
	        	
	        }
	    }
	    
	    System.out.println("No longer isRunning true...");
	}
	
	public synchronized void notifyIsRunning() {
	    isRunning = false;
	    notifyAll();
	}
}
