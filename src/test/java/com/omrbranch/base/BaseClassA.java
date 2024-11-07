package com.omrbranch.base;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassA {


	RequestSpecification given;

	Response response;

	public void addHeader(String key, String value) {

		given = RestAssured.given().header(key, value);

	}

	public void addReqBody(String body) {

		given = given.body(body);

	}
	
	
	public void addReqBody1(Object body) {

		given = given.body(body);

	}
	
	

	public Response addReqType(String type, String endpoint) {

		switch (type) {
		case "Get":
			response = given.get(endpoint);

			break;

		case "Post":

			response = given.post(endpoint);

			break;

		case "Put":
			response = given.put(endpoint);
			break;

		case "Patch":

			response = given.patch(endpoint);
			break;

		case "Delete":
			response = given.delete(endpoint);
			break;

		default:
			break;
		}
		return response;

	}

	public int getResCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;

	}

	public String getResBodyAsString(Response response) {
		String asString = response.asString();
		return asString;
	}

	public String getResAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;

	}

	public void addBasicAuth(String name, String pass) {

		
		given = given.auth().preemptive().basic(name, pass);

	}
	
	
	public void addHeaders(Headers headers) {
		given=RestAssured.given().headers(headers);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
