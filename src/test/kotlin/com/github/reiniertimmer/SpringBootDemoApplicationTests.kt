package com.github.reiniertimmer

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Test
	fun contextLoads() {
		// this method is fired when a context is loaded
	}
	
	fun printTestMessage(msg: String) {
		println("This is a test message")
	}

}
