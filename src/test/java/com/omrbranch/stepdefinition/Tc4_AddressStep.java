package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tc4_AddressStep {

	@Given("User add headers and bearer authorization for accesing adddress endpoints")
	public void user_add_headers_and_bearer_authorization_for_accesing_adddress_endpoints() {

	}

	@When("User add requestbody for AddNewAddress {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_add_requestbody_for_add_new_address(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8, String string9, String string10) {

	}

	@When("User send {string} request for adduseraddress endpoint")
	public void user_send_request_for_adduseraddress_endpoint(String string) {

	}

	@Then("User should verify adduseraddress response message matches {string}")
	public void user_should_verify_adduseraddress_response_message_matches(String string) {

	}

}
