package com.snackoverflow.orderservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(OrderServiceApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing.....");
		assertEquals(true, true);
	}

}
