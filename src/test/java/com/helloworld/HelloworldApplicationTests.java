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

	@Test
	public void test_deepa() {
		String firstname = "Deepa";
		String lastname = "Phuyel" ;
		int age = 24;
		assertEquals("Deepa", firstname  );
		assertEquals("Phuyel", lastname);
		assertEquals (24, age);



	}

}
