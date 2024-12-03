package com.tech.EPL.realty.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.tech.EPL.realty.service.TestService;
import com.tech.EPL.realty.service.group.RealtyServiceGroup;

@SpringBootTest
class ELPRealtyControllerTest {


	@InjectMocks
	private RealtyServiceGroup serviceGroup;
	
	@Mock
	private TestService testService;
	
	@Test
	void test() {
		String asd = realty1();
		System.out.println(asd);
	}
	
	@Test
	@DisplayName("realty1 TEST")
	public String realty1() {
		testService.execution();
		return "epl/realty1";
	}
	
}