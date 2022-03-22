package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Britto\\eclipse-workspace\\GreenExcerciseCucumber\\featureFiles\\AdactinBooking.feature",
glue="stepDefinitions",
monochrome=true,
dryRun=false,
plugin= {"html:report/WebReport","json:report/jsonreport.json"},
tags = {"@Positive"}
)
public class AdactinRunner {

}
