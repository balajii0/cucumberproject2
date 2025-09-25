package com.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Balaji\\git\\cucumberproject2\\cucumberproject2\\src\\test\\resources\\features",        		
        glue = {"cucumberproject"},
        monochrome = true,
        plugin = {"pretty",
                "html:Reports/HTMLReports",
                "json:Reports/JSONReports/report.json",
                "junit:Reports/JUnitReports/report.xml"},
        dryRun = false       	
		)
public class runnerclass {

}
