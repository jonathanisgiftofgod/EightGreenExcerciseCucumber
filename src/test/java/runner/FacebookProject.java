package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Britto\\eclipse-workspace\\GreenExcerciseCucumber\\featureFiles\\FacebookLogin.feature",
							glue="stepDefinitions", dryRun=false, monochrome=true,
							plugin= {"html:report/WebReport","json:report/jsonReport.json"}
							)
public class FacebookProject {

}
