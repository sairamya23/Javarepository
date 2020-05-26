package com.adactln.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resource\\com\\adactln\\features",
		glue= {"com.adactln.stepdefinition" ,"hooks"},
		dryRun=false,
		monochrome=true,
		tags= {"@Search"}
		
		)
public class AllTests {

}
