package com.common;

import org.testng.annotations.Test;

public class LoadTimeCapture extends FlipkartCommonTest {

	@Test
	public void capturePageLoadTime() {
		
		long start = System.currentTimeMillis();
		driver.get("https://www.flipkart.com");

		long finish = System.currentTimeMillis();
		long totalTime = (finish - start)/1000;
		System.out.println("Total Time for page load - " + totalTime);
		
	}

}
