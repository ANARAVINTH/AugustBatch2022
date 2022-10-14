package com.xyz.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = {"src/test/resources/com.cts.featurefile",},
        glue = {"/com/xyz/stepdefination"},
        dryRun = false,
        monochrome = true,
        tags = "@Apple",
        plugin = {"pretty","html:target/HTMLReport"
                ,"json:target/JsonReport/JsReport.json",
                   "junit:target/JunitReport/JunitReport.xml"}

)


public class FeatureRunner {
}
