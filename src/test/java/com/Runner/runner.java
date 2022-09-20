package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue= {"com.steps"},
plugin= {"pretty","html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"} ,
tags = "@smoke",
monochrome= true,
dryRun= false
		
		)



public class runner {
	
}
