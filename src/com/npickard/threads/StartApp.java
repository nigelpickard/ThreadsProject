/**
 * 
 */
package com.npickard.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author nigel
 *
 */
public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleThreadA r1 = new SimpleThreadA();
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.execute(r1);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r1.notifyIsRunning();
	}

}
