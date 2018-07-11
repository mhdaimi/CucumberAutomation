package com.syne.basic.dataDriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/com/syne/basic/dataDriven/" }, 
				  glue = {"com/syne/basic/dataDriven/" }, 
				  monochrome = true, // console output in readable format
				  // dryRun = true,
				  plugin = { "pretty", 
						  "html:target/cucumber-htmlreport", 
						  "json:target/cucumber-report" + 1988 + ".json",
						  "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportDataDriven.html" 
						  }
				)

public class RunDataDrivenStepDefsTest {

}
