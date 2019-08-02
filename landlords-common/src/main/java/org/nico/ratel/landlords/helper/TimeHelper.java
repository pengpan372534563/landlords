package org.nico.ratel.landlords.helper;

/** 
 * 
 * @author pengpan
 */

public class TimeHelper {

	public static void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
		}
	}
}
