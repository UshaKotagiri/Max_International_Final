package com.max_international.testrunner;

/**
 *
 * @author nimit.jain
 */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin   = { "pretty", 
							  "json:target/cucumber-report.json",
					 		  "html:target/cucumber-report.html" }, 
				
				features = "src/test/resources/features/frontend/",

				 glue = {"com.max_international.stepdefs"},
				 tags={"@BF16,@BF18,@BF21,@BF22,@BF24"}
)  
				
public class RunCukeTestFrontend {

}

