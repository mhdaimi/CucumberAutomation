package com.syne.basic.multiScenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/syne/basic/multiscenariosinglefile/"},
				glue = {"com/syne/basic/multiScenario/"},
				monochrome=true,
				plugin = {"pretty",
						"html:target/cucumber-htmlreport",
						"json:target/cucumber-report" + 1987 + ".json",
						"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"}
//				dryRun = true
				)

public class RunMultiScenarioStepDefTest {

}
