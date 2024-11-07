package com.omrbranch.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Then;

public class CommonStep {
	
	@Then("User should verify the status code is {int}")
	public void user_should_verify_the_status_code_is(int int1) {
		
		int statuscode = Tc1_LoginStep.datas.getStatuscode();
		
		Assert.assertEquals("verify",statuscode, int1);
		}

}
