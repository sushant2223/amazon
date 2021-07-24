package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"amazon"},
		glue= {"stepDefination"},
		monochrome=true,
		dryRun=false,
		plugin= {"html:target/cucmberReport.html",
		         "json:target/cucmber_json.json"	
				}
		)
		
		
		
		
		
		





public class testRunner {

}
