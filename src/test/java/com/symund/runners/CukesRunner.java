package com.symund.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",       (add some knowledge to console about running tests' results
                "json:target/cucumber.json",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features="src/test/resources/features",
        glue="com/symund/step_definitions",
        dryRun=true,
        tags = "@empty",
        publish=true    //  add a report link  to console
)
public class CukesRunner {
}
