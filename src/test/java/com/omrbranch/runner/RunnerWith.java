package com.omrbranch.runner;

import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(tags="@Login",dryRun = false,plugin= {"pretty","json:target//report.json"},glue ="com.omrbranch.stepdefinition",features = "src\\test\\resources")
public class RunnerWith {
	

	


}
