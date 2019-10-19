package com.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloworldApplicationTests {

	@Test
	public void testAdd() {
		String str= "Junit is working fine";
		assertEquals("Junit is working fine",str);
	}

}
