package com.lti;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Apptest {
    
	
	@Test
	public  void testlogin1() {
		App myapp=new App();
		Assertions.assertEquals(0,myapp.userlogin("abc", "abc@123"));
	}
	
	public  void testlogin2() {
		App myapp=new App();
		Assertions.assertEquals(1,myapp.userlogin("abc", "abc@123"));
	}
}
