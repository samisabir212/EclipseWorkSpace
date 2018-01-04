package tests_TheGreatCourses;

import org.testng.annotations.Test;

import generic.Generic;

public class Testing_Generic_baseClass extends Generic {
	
	
	
	@Test
	public void test() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}

}
