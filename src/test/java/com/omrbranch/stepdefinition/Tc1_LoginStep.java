package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.GlobalDatas.GlobalDatas;
import com.omrbranch.base.BaseClassA;
import com.omrbranch.login.pojo.PojoPostA;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class Tc1_LoginStep extends BaseClassA {

	Response reqType;
	static GlobalDatas datas = new GlobalDatas();

	@Given("User add header")
	public void user_add_header() {
		addHeader("accept", "application/json");

	}

	@When("User add basic authentication for login")
	public void user_add_basic_authentication_for_login() {
		addBasicAuth("ajaikumar.220ak@gmail.com", "Password@123");
	}

	@When("User send {string} request for login endpoint")
	public void user_send_request_for_login_endpoint(String string) {
		reqType = addReqType(string, "https://www.omrbranch.com/api/postmanBasicAuthLogin");
		int resCode = getResCode(reqType);
		datas.setStatuscode(resCode);
		System.out.println(getResAsPrettyString(reqType));
	}

	@Then("User should verify the login response body First_name present as {string} and get the logtoken saved")
	public void user_should_verify_the_login_response_body_first_name_present_as_and_get_the_logtoken_saved(
			String string) {

		PojoPostA a = reqType.as(PojoPostA.class);
		String first_name = a.getData().getFirst_name();

		Assert.assertEquals("verify ", first_name, string);
	}

}
